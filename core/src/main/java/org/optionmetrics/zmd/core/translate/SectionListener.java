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
        Paragraph p = new Informal(ctx.getText(), fileName);
        paragraphs.add(p);
    }

    @Override
    public void exitDefinition(TranslateParser.DefinitionContext ctx) {
        String key = ctx.misc(0).getText();
        String value = StringEscapeUtils.unescapeJava(ctx.misc(1).getText());
        Definition d = new Definition(fileName);
        d.setKey(key);
        d.setValue(value);
        paragraphs.add(d);
    }

    @Override
    public void exitTag(TranslateParser.TagContext ctx) {
        int id = Integer.valueOf(ctx.misc().NUMBER().getText());
        Tag t = new Tag(id, fileName);
        paragraphs.add(t);
    }

    private Paragraph getParagraph(ParserRuleContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (ParseTree c : ctx.children) {
            sb.append(c.getText());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return new Formal(sb.toString(), generic, fileName);
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
        SectionHeader s = new SectionHeader(fileName);
        s.setSectionName(ctx.NAME().getText());
        s.getParents().addAll(formals);
        paragraphs.add(s);
    }

}
