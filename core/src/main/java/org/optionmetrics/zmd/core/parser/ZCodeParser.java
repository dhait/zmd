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

package org.optionmetrics.zmd.core.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.optionmetrics.zmd.core.markdown.ZNode;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ZCodeParser {

    private final Map<Integer, ZNode> nodeMap;
    private CommonTokenStream tokens;

    public CommonTokenStream getTokens() {
        return tokens;
    }

    // for testing
    public ZCodeParser() {
        this.nodeMap = new HashMap<>();
    }
    public ZCodeParser(Map<Integer, ZNode> nodeMap) {
        this.nodeMap = nodeMap;
    }
    public void parse(InputStream input) throws IOException {
        CharStream stream = CharStreams.fromStream(input);
        parse(stream);
    }

    public void parse(String input) {
        CharStream stream = CharStreams.fromString(input);
        parse(stream);
    }

    private void parse(CharStream stream) {
        ZLexer lexer = new ZLexer(stream);
        tokens = new CommonTokenStream(lexer);
        ZParser parser = new ZParser(tokens);

        parser.removeErrorListeners();
        ZCodeErrorListener errorListener = new ZCodeErrorListener();
        parser.addErrorListener(errorListener);

        ParserRuleContext tree = parser.specification();

        TaggingListener listener = new TaggingListener(nodeMap);

        if (errorListener.getErrorCount() > 0) {
            System.err.println(errorListener.getErrorCount() + " errors in Z code ");
        } else {
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);
        }
        //return listener.getParagraphs();
    }
}
