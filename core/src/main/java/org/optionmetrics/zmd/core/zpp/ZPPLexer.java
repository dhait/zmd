package org.optionmetrics.zmd.core.zpp;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import java.util.ArrayDeque;

public class ZPPLexer extends ZPPBaseLexer {

    protected ArrayDeque<Token> buffer = new ArrayDeque<Token>();


    public ZPPLexer(CharStream input) {
        super(input);
    }

    @Override
    public Token nextToken() {
        if (buffer.size() > 0) {
            return buffer.removeFirst();
        }
        else {
            super.nextToken();
            return buffer.removeFirst();
        }
    }

    @Override
    public Token getToken() {
        return buffer.peek();
    }

    @Override
    public void emit(Token token) {
        super.emit(token);
        buffer.add(token);
    }
}
