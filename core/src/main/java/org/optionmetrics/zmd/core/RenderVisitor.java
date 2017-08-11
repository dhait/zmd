package org.optionmetrics.zmd.core;

import org.optionmetrics.zmd.core.parse.ZOperatorParser;
import org.optionmetrics.zmd.core.parse.ZOperatorParserBaseListener;

public class RenderVisitor extends ZOperatorParserBaseListener {

    private StringBuilder html = new StringBuilder();

    public String getHtml() {
        return html.toString();
    }

    @Override
    public void exitBaseSection(ZOperatorParser.BaseSectionContext ctx) {
        html.append("section");
    }

    @Override
    public void exitInheritingSection(ZOperatorParser.InheritingSectionContext ctx) {
        html.append("section");
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
        html.append("Non operator");
    }

    @Override
    public void exitOperatorTemplateParagraph(ZOperatorParser.OperatorTemplateParagraphContext ctx) {
        html.append("Operator");
    }
}
