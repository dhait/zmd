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
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.optionmetrics.zmd.core.section.SectionParserBaseListener;
import org.optionmetrics.zmd.core.section.SectionParser;
import org.optionmetrics.zmd.core.section.impl.Definition;
import org.optionmetrics.zmd.core.section.impl.Formal;
import org.optionmetrics.zmd.core.section.impl.SectionHeader;

import java.util.ArrayList;
import java.util.List;

public class SectionListenerImpl extends SectionParserBaseListener {

    private final String AX = "\u2577";
    private final String SCH = "\u250c";
    private final String GEN = "\u2550";
    private final String ZED = "\u2500";
    private final String END = "\u2514";
    private final String VERT = "|";

    private final String fileName;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<String> formals = new ArrayList<>();
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

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    @Override
    public void exitSparents(SectionParser.SparentsContext ctx) {
        formals.clear();
        for (SectionParser.SnameContext sctx : ctx.sname()) {
            formals.add(sctx.getText());
        }
    }

    @Override
    public void exitDefine(SectionParser.DefineContext ctx) {
        Definition definition  = new Definition(fileName, currentTag);
        definition.setKey(ctx.DEFSYM().getText());
        definition.setValue(ctx.zexpr(0).getText());
        paragraphs.add(definition);
    }

    private String convert(String s, boolean generic) {
        switch(s) {
            case "@":
                return " " + "\u2981" + " ";
            case "+":
            case "-":
            case "*":
            case "|":
                return " " + s + " ";
            case ",":
            case ";":
                return s + " ";
            case "zed":
                return ZED;
            case "axiom":
                return generic?  AX+GEN : AX;
            case "schema":
                return generic? SCH+GEN : GEN;
            case "where":
                return VERT;
            case "end":
                return END;

        }
        if (s.startsWith("\\")) {
            return s;
        }
        return s;
    }

    @Override
    public void exitSchemaParagraph(SectionParser.SchemaParagraphContext ctx) {
        Formal f = exitStandardParagraph(ctx,ctx.gen() != null);
        paragraphs.add(f);
    }

    @Override
    public void exitZedParagraph(SectionParser.ZedParagraphContext ctx) {
        Formal f = exitStandardParagraph(ctx, false);
        paragraphs.add(f);
    }

    @Override
    public void exitAxiomParagraph(SectionParser.AxiomParagraphContext ctx) {
        Formal f = exitStandardParagraph(ctx, ctx.gen() != null);
        paragraphs.add(f);
    }

    public Formal exitStandardParagraph(ParserRuleContext ctx, boolean generic) {
        StringBuilder sb = new StringBuilder();
        Interval interval = ctx.getSourceInterval();
        for (int i = interval.a; i <= interval.b; i++) {
            sb.append(tokens.get(i).getText());
        }

        return new Formal(sb.toString(), fileName, currentTag);
    }

    @Override
    public void exitSectionHeader(SectionParser.SectionHeaderContext ctx) {
        StringBuilder sb = new StringBuilder();
        Interval interval = ctx.getSourceInterval();
        for (int i = interval.a; i <= interval.b; i++) {
            sb.append(tokens.get(i).getText());
        }
        SectionHeader s = new SectionHeader(sb.toString(), fileName, currentTag);
        s.setSectionName(ctx.sname().getText());
        s.getParents().addAll(formals);
        paragraphs.add(s);
    }
}
