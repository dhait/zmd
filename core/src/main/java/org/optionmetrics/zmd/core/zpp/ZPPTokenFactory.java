package org.optionmetrics.zmd.core.zpp;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayDeque;
import java.util.Deque;

public class ZPPTokenFactory implements TokenFactory<ZPPToken> {

    Deque<String> stack = new ArrayDeque<String>();

    public void pushFilename(String filename) {
        stack.push(filename);
    }

    public void popFileName() { stack.pop(); }

    @Override
    public ZPPToken create(Pair<TokenSource, CharStream> source, int type, String text,
                           int channel, int start, int stop, int line,
                           int charPositionInLine)
    {
        ZPPToken t = new ZPPToken(source, type, channel, start, stop);
        t.setLine(line);
        t.setCharPositionInLine(charPositionInLine);
        CharStream input = source.b;
        t.setText(input.getText(Interval.of(start,stop)));
        t.filename = stack.peek();
        return t;
    }

    @Override
    public ZPPToken create(int type, String text) {
        return new ZPPToken(type, text);
    }

}
