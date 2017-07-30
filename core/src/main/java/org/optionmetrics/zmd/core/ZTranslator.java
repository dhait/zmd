package org.optionmetrics.zmd.core;

import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Node;
import org.commonmark.parser.PostProcessor;
import org.commonmark.renderer.html.HtmlWriter;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ZTranslator implements PostProcessor {

    @Override
    public Node process(Node node) {
        ZTranslateVisitor visitor = new ZTranslateVisitor();
        node.accept(visitor);
        return node;
    }

    private class ZTranslateVisitor extends AbstractVisitor {

        private final String AX = "\u2577";
        private final String SCH = "\u250c";
        private final String GEN = "\u2550";
        private final String ZED = "\u2500";
        private final String END = "\u2514";

        Map<String, String> keywords = new HashMap<String, String>() {{

            put("begin{zsection}", ZED);
            put("end{zsection}", END);
            put("begin{schema}", SCH);
            put("end{schema}", END);
            put("begin{theorem}", "\u22A2?");
            put("end{theorem}", END);
            put("begin{zed}", ZED);
            put("end{zed}", END);
            put("begin{axdef}", AX);
            put("end{axdef}", END);
            put("begin{gendef}", AX+GEN);
            put("end{gendef}", END);
            put("where", "|");
            put("SECTION", "section");
            put("parents", "parents");
            put("\\", "");   // Don't need NL, it's already at the end
            put("t1", "\t");
            put("t2", "\t\t");
            put("t3", "\t\t\t");
            put("{", "{");
            put("}", "}");
            put("_", "_");

            put("Delta",  "\u0394");
            put("Xi", "\u039e");
            put("theta", "\u03b8");
            put("mu", "\u03bc");
            put("arithmos", new String(Character.toChars(0x1D538)));
            put("power", "\u2119");
            put("nat", "\u2115");
            put("nat_1", "\u2115_1");

            put("prime", "\u02b9");
            put("lblot", "\u2989");
            put("rblot", "\u298a");
            put("ldata", "\u27ea");
            put("rdata","\u27eb");

            put("vdash", "\u22a2");
            put("land", "\u2227");
            put("lor", "\u2228");
            put("implies","\u21d2");
            put("iff","\u21d4");
            put("lnot", "\u00ac");
            put("forall", "\u2200");
            put("exists", "\u2203");
            put("cross", "\u00d7");
            put("in", "\u2208");
            put("spot", "\u2981");
            put("hide", "\u29f9");
            put("project","\u2a21");
            put("semi", "\u2a1f");
            put("pipe", "\u2a20");
            put("IF", "if");
            put("THEN", "then");
            put("ELSE", "else");
            put("LET", "let");
            put("pre", "pre");
            put("relation", "relation");
            put("generic", "generic");
            put("function", "function");
            put("leftassoc", "leftassoc");
            put("rightassoc", "rightassoc");


    /* set toolkit */
            put("rel", "\u2194");
            put("fun", "\u2192");
            put("neq", "\u2260");
            put("notin", "\u2209");
            put("emptyset", "\u2205");
            put("subseteq", "\u2286");
            put("subset", "\u2282");
            put("setminus", "\u02216");
            put("cup", "\u222a");
            put("cap", "\u2229");
            put("symdiff", "\u2296");
            put("bigcup", "\u22C3");
            put("bigcap", "\u22C2");
            put("finset", new String(Character.toChars(0x1D53D)));


    /* relation toolkit */
            put("dom", "dom");
            //put("ran", "ran");
            put("id", "id");
            put("mapsto", "\u21A6");
            put("comp", "\u2A3E");
            put("circ", "\u2218");
            put("dres", "\u25C1");
            put("rres", "\u25B7");
            put("ndres", "\u2A64");
            put("nrres", "\u2A65");
            put("inv", "\u223C");
            put("limg", "\u2987");
            put("rimg", "\u2988");
            put("oplus", "\u2295");
            put("disjoint", "disjoint");
            put("partition", "partition");

    /* function toolkit */
            put("pfun", "\u21F8");
            put("pinj", "\u2914");
            put("inj", "\u21A3");
            put("psurj", "\u2900");
            put("surj", "\u21A0");
            put("bij", "\u2916");
            put("ffun", "\u21FB");
            put("finj", "\u2915");

            // number toolkit
            put("num", "\u2124");
            put("minus", "\u2212");
            put("leq", "\u2264");
            put("geq", "\u2265");
            put("div", "div");
            put("mod", "mod");

            // sequence toolkit
            put("upto", "..");
            put("#", "#");
            put("seq", "seq");
            put("seq_1", "seq_1");
            put("langle", "\u3008");
            put("rangle", "\u3009");
            put("cat", "\u2040");
            put("extract", "\u21BF");
            put("filter", "\u21BE");

            put("ran", "ran");

        }};

        @Override
        public void visit(FencedCodeBlock codeBlock) {
            ZInfo info = new ZInfo(codeBlock.getInfo());
            if (info.isZ()) {
                String zstring = translate(codeBlock.getLiteral());
                codeBlock.setLiteral(zstring);
            } else {
                super.visit(codeBlock);
            }
        }

        public String translate(String input) {

            // look for anything beginning with a backslash
            String keys = "(\\\\[a-zA-Z0-9]+(\\{\\w+\\})?)|(\\\\_)|(\\\\\\{)|(\\\\\\})|(\\\\#)";
            Pattern p = Pattern.compile(keys);

            input = input.replaceAll("\\\\\\\\\\r?\\n", "\n");
            Matcher m = p.matcher(input);

            StringBuffer sb = new StringBuffer();
            while (m.find()) {
                String key = m.group().substring(1);
                String value = keywords.get(key);
                if (value != null)
                    m.appendReplacement(sb, value);
            }
            m.appendTail(sb);

            String out = sb.toString();

            out = out.replaceAll("~", " ");
            // add GEN character for generic schemas
            out = out.replaceAll(SCH + "\\{([^\\}]+?)\\}\\s*\\[([^\\]]+?)\\]", SCH + GEN + "$1 [$2]");
            // add name for schemas
            out = out.replaceAll(SCH + "\\{([^\\}]+?)\\}", SCH + " $1");
            return out;
        }
    }

}
