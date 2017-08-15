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

package org.optionmetrics.zmd.core.translate;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.text.StringEscapeUtils;
import org.optionmetrics.zmd.core.translate.impl.*;

import java.util.ArrayList;
import java.util.List;

public class SectionListener extends TranslateBaseListener {

    private final String fileName;
    public List<Paragraph> paragraphs = new ArrayList<>();
    private List<String> formals = new ArrayList<>();
    private boolean generic = false;
    private int currentTag = -1;

    public SectionListener(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void exitSparents(TranslateParser.SparentsContext ctx) {
        formals.clear();
        for (TerminalNode t : ctx.NAME()) {
            formals.add(t.getText());
        }
    }

    @Override
    public void exitGen(TranslateParser.GenContext ctx) {
        formals.clear();
        for (TerminalNode t : ctx.NAME()) {
            formals.add(t.getText());
        }
        generic = true;
    }

    @Override
    public void exitInformal(TranslateParser.InformalContext ctx) {
        Paragraph p = new Informal(ctx.getText(), fileName, currentTag);
        paragraphs.add(p);
    }

    @Override
    public void exitDefinition(TranslateParser.DefinitionContext ctx) {
        String key = ctx.misc(0).getText();
        String value = StringEscapeUtils.unescapeJava(ctx.misc(1).getText());
        Definition d = new Definition(fileName, currentTag);
        d.setKey(key);
        d.setValue(value);
        paragraphs.add(d);
    }

    @Override
    public void exitTag(TranslateParser.TagContext ctx) {
        currentTag = Integer.valueOf(ctx.misc().NUMBER().getText());
    }

    private Paragraph getParagraph(ParserRuleContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (ParseTree c : ctx.children) {
            sb.append(c.getText());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return new Formal(sb.toString(), generic, fileName, currentTag);
    }

    private Paragraph getSectionHeader(TranslateParser.SectionHeaderContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("zed ");
        for (ParseTree c : ctx.children) {
            sb.append(c.getText());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        SectionHeader s = new SectionHeader(sb.toString(), fileName, currentTag);
        s.setSectionName(ctx.NAME().getText());
        s.getParents().addAll(formals);
        return s;
    }

    @Override
    public void exitAxParagraph(TranslateParser.AxParagraphContext ctx) {
        Paragraph p = getParagraph(ctx);
        paragraphs.add(p);
    }

    @Override
    public void exitZedParagraph(TranslateParser.ZedParagraphContext ctx) {
        Paragraph p = getParagraph(ctx);
        paragraphs.add(p);
    }

    @Override
    public void exitSchemaParagraph(TranslateParser.SchemaParagraphContext ctx) {
        Paragraph p = getParagraph(ctx);
        paragraphs.add(p);
    }

    @Override
    public void exitSectionHeader(TranslateParser.SectionHeaderContext ctx) {
        Paragraph p  = getSectionHeader(ctx);
        paragraphs.add(p);
    }
}
