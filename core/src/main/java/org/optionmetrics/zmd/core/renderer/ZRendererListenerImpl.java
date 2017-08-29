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

package org.optionmetrics.zmd.core.renderer;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.optionmetrics.zmd.core.converter.ZMarkupLexer;
import org.optionmetrics.zmd.core.converter.ZMarkupParser;
import org.optionmetrics.zmd.core.converter.ZMarkupParserBaseListener;

public class ZRendererListenerImpl extends ZMarkupParserBaseListener {

    private BufferedTokenStream tokens;
    private StringBuilder builder = new StringBuilder();

    public ZRendererListenerImpl(BufferedTokenStream tokens) {
        this.tokens = tokens;
    }


    @Override
    public String toString() {
        return builder.toString();
    }

    @Override
    public void exitSchemaParagraph(ZMarkupParser.SchemaParagraphContext ctx) {
        builder.append("<div class=\"z-schema\">\n");
        builder.append("\t<div class=\"z-name\" >\n");
        builder.append("\t").append(ctx.sname().NAME().getText()).append("\n");
        builder.append("\t</div>\n");
        builder.append("\t<div class=\"z-schema-decl\">\n");
        int start = ctx.zexpr(0).start.getTokenIndex();
        int stop = ctx.zexpr(ctx.zexpr().size()-1).stop.getTokenIndex();

        for (int i = start; i <= stop; i++) {
            Token t = tokens.get(i);
            if (t.getType() == ZMarkupLexer.WHERE) {
                builder.append("\t</div>\n");
                builder.append("\t<div class=\"z-schema-pred\">\n");
            }
            else if (t.getText().equals("\n")) {
                builder.append("<br/>");
            }
            else {
                builder.append(t.getText());
            }
        }
        builder.append("\t</div>\n");
        builder.append("</div>\n");
    }
}
