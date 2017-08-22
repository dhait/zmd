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

package org.optionmetrics.zmd.core.section;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.optionmetrics.zmd.core.section.impl.*;

import java.util.ArrayList;
import java.util.List;

public class SectionListenerImpl extends SectionBaseListener {

    private final String fileName;
    public List<Paragraph> paragraphs = new ArrayList<>();
    private List<String> formals = new ArrayList<>();
    private boolean generic = false;
    private int currentTag = -1;
    private BufferedTokenStream tokens;
    private TokenStreamRewriter rewriter;

    public SectionListenerImpl(BufferedTokenStream tokens, String fileName) {
        this.tokens = tokens;
        this.fileName = fileName;
        rewriter = new TokenStreamRewriter(tokens);
    }

    public TokenStreamRewriter getRewriter() {
        return rewriter;
    }

    @Override
    public void exitSparents(SectionParser.SparentsContext ctx) {
        formals.clear();
        //for (TerminalNode t : ctx.NAME()) {
        //    formals.add(t.getText());
        //}
    }

    private Paragraph getSectionHeader(SectionParser.SectionHeaderContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("zed ");
        for (ParseTree c : ctx.children) {
            sb.append(c.getText());
        }
        SectionHeader s = new SectionHeader(sb.toString(), fileName, currentTag);
        s.setSectionName(ctx.sname().getText());
        s.getParents().addAll(formals);
        return s;
    }


    @Override
    public void exitStandardParagraph(SectionParser.StandardParagraphContext ctx) {
        StringBuilder sb = new StringBuilder();
        Token start = ctx.start;
        Token stop = ctx.stop;
        for (int i = start.getTokenIndex(); i <= stop.getTokenIndex(); i++) {
            sb.append(tokens.get(i).getText());
        }
        Paragraph p = new Formal(sb.toString(), generic, fileName, currentTag);
        paragraphs.add(p);
    }

    @Override
    public void exitSectionHeader(SectionParser.SectionHeaderContext ctx) {
        Paragraph p  = getSectionHeader(ctx);
        paragraphs.add(p);
    }
}
