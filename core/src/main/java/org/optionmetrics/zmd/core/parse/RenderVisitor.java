/*
 * [The "BSD licence"]
 *  Copyright (c) 2017 David J Hait
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.optionmetrics.zmd.core.parse;

public class RenderVisitor extends ZOperatorParserBaseListener {

    private StringBuilder html = new StringBuilder();

    public String getHtml() {
        return html.toString();
    }

    @Override
    public void exitBaseSection(ZOperatorParser.BaseSectionContext ctx) {
        html.append("<div class=\"z-section\">\n");
        for (int i=1; i < ctx.children.size()-1; i++) {
            String t = ctx.children.get(i).getText();
            html.append(" ").append(t);
        }
        html.append("</div>\n");
    }

    @Override
    public void exitInheritingSection(ZOperatorParser.InheritingSectionContext ctx) {
        html.append("<div class=\"z-section\">\n");
        for (int i=1; i < ctx.children.size()-1; i++) {
            String t = ctx.children.get(i).getText();
            html.append(" ").append(t);
        }
        html.append("</div>\n");
    }

    @Override
    public void exitSchemaDefinitionParagraph(ZOperatorParser.SchemaDefinitionParagraphContext ctx) {

        String name = ctx.children.get(1).getText();
        html.append("<div class=\"z-schema\">\n");
        html.append("\t<div class=\"z-name\" >\n");
        html.append("\t").append(name).append("\n");
        html.append("\t</div>\n");

        html.append("\t<div class=\"z-schema-decl\">\n");
        for (int i=2; i < ctx.children.size()-1; i++) {
                String t = ctx.children.get(i).getText();
                if (t.equals("|")) {
                    html.append("\t</div>\n");
                    html.append("\t<div class=\"z-schema-pred\">\n");
                }
                else {
                    html.append(t);
                }
        }
        html.append("\t</div>\n");

        html.append("</div>\n");
    }

    @Override
    public void exitAxiomaticDescriptionParagraph(ZOperatorParser.AxiomaticDescriptionParagraphContext ctx) {
        html.append("<div class=\"z-axiom\">\n");

        html.append("\t<div class=\"z-axiom-decl\">\n");
        for (int i=1; i < ctx.children.size()-1; i++) {
            String t = ctx.children.get(i).getText();
            if (t.equals("|")) {
                html.append("\t</div>\n");
                html.append("\t<div class=\"z-axiom-pred\">\n");
            }
            else {
                html.append(t);
            }
        }
        html.append("\t</div>\n");

        html.append("</div>\n");
    }

    @Override
    public void exitNONOperatorTemplateParagraph(ZOperatorParser.NONOperatorTemplateParagraphContext ctx) {
        html.append("<div class=\"z-text\">\n");
        for (int i=1; i < ctx.children.size()-1; i++) {
            String t = ctx.children.get(i).getText();
            html.append(t);
        }
        html.append("</div>\n");
    }

    @Override
    public void exitOperatorTemplateParagraph(ZOperatorParser.OperatorTemplateParagraphContext ctx) {
        html.append("<div class=\"z-text\">\n");
        for (int i=1; i < ctx.children.size()-1; i++) {
            String t = ctx.children.get(i).getText();
            html.append(t);
        }
        html.append("</div>\n");
    }
}
