package org.optionmetrics.zmd.core.section;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.text.StringEscapeUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SectionListener extends SectionParserBaseListener {

    public List<Paragraph> paragraphs = new ArrayList<>();
    public List<String> formals = new ArrayList<>();
    public Map<String, String> defines = new HashMap<>();

    @Override
    public void exitFormals(SectionParser.FormalsContext ctx) {
        formals.clear();
        for (TerminalNode t : ctx.NAME()) {
            formals.add(t.getText());
        }
    }

    @Override
    public void exitInformal(SectionParser.InformalContext ctx) {
        Paragraph p = new Informal(ctx.getText());
        paragraphs.add(p);
    }

    @Override
    public void exitDefinition(SectionParser.DefinitionContext ctx) {
        String key = ctx.CHUNK(0).getText();
        String value = StringEscapeUtils.unescapeJava(ctx.CHUNK(1).getText());
        defines.put(key,value);
    }

    @Override
    public void exitZedParagraph(SectionParser.ZedParagraphContext ctx) {
        Paragraph p = new Formal(ctx.getText());
        paragraphs.add(p);
    }

    @Override
    public void exitSchemaParagraph(SectionParser.SchemaParagraphContext ctx) {
        Paragraph p = new Formal(ctx.getText());
        paragraphs.add(p);
    }

    @Override
    public void exitSectionHeader(SectionParser.SectionHeaderContext ctx) {
        SectionHeader s = new SectionHeader();
        s.setSectionName(ctx.NAME().getText());
        s.getParents().addAll(formals);
        paragraphs.add(s);
    }

}
