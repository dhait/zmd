package org.optionmetrics.zmd.core;

import java.util.HashMap;
import java.util.Map;

public class ZMarkupListenerImpl extends ZMarkupBaseListener {


    private final String AX = "\u2577";
    private final String SCH = "\u250c";
    private final String GEN = "\u2550";
    private final String ZED = "\u2500";
    private final String END = "\u2514";

    @Override
    public void exitSection(ZMarkup.SectionContext ctx) {

    }

    // ENTER ZED, exit print END

    @Override
    public void enterZedParagraph(ZMarkup.ZedParagraphContext ctx) {
        System.out.print(ZED);
    }
    @Override
    public void exitZedParagraph(ZMarkup.ZedParagraphContext ctx) {
        System.out.println(END);
    }

    @Override
    public void exitAxParagraph(ZMarkup.AxParagraphContext ctx) {

    }

    @Override
    public void exitSchemaParagraph(ZMarkup.SchemaParagraphContext ctx) {

    }

    @Override
    public void exitDefParagraph(ZMarkup.DefParagraphContext ctx) {

    }

    @Override
    public void exitToken(ZMarkup.TokenContext ctx) {
        System.out.print(ctx.getText()+ " ");
    }

}
