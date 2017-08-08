package org.optionmetrics.zmd.core.translate;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.text.StringEscapeUtils;
import org.optionmetrics.zmd.core.section.SectionParser;
import org.optionmetrics.zmd.core.section.SectionParserBaseListener;
import org.optionmetrics.zmd.core.translate.impl.Definition;
import org.optionmetrics.zmd.core.translate.impl.Formal;
import org.optionmetrics.zmd.core.translate.impl.Informal;
import org.optionmetrics.zmd.core.translate.impl.SectionHeader;

import java.util.ArrayList;
import java.util.List;

public class SectionListener extends SectionParserBaseListener {

    public List<Paragraph> paragraphs = new ArrayList<>();
    public List<String> formals = new ArrayList<>();
    boolean generic = false;

    @Override
    public void exitFormals(SectionParser.FormalsContext ctx) {
        formals.clear();
        for (TerminalNode t : ctx.NAME()) {
            formals.add(t.getText());
        }
    }

    @Override
    public void exitGenformals(SectionParser.GenformalsContext ctx) {
        formals.clear();
        for (TerminalNode t : ctx.FORMAL()) {
            formals.add(t.getText());
        }
        generic = true;
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
        Definition d = new Definition();
        d.setKey(key);
        d.setValue(value);
        paragraphs.add(d);
    }

    @Override
    public void exitZedParagraph(SectionParser.ZedParagraphContext ctx) {
        Paragraph p = new Formal(ctx.getText(), generic);
        paragraphs.add(p);
    }

    @Override
    public void exitSchemaParagraph(SectionParser.SchemaParagraphContext ctx) {
        Paragraph p = new Formal(ctx.getText(), generic);
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
