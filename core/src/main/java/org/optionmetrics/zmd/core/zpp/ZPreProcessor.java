package org.optionmetrics.zmd.core.zpp;

import org.antlr.v4.runtime.*;
import org.apache.commons.text.StringEscapeUtils;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZPreProcessor {

    private ZPPTokenFactory tokenFactory = new ZPPTokenFactory();

    private List<File> searchPaths = new ArrayList<>();
    private Map<String, String> defines = new HashMap<>();


    public Map<String,String> getDefines() {
        return defines;
    }

    public void addSearchPath(File file) {
        searchPaths.add(file);
    }

    public List<ZPPToken> include(String includeCommand) {
        System.out.print("process " + includeCommand);
        int l = includeCommand.indexOf('"');
        int r = includeCommand.lastIndexOf('"');
        String filename = includeCommand.substring(l+1, r);
        tokenFactory.pushFilename(filename);
        List<ZPPToken> tokens = load(filename);
        tokenFactory.popFileName();
        return tokens;
    }

    private List<ZPPToken> load(String filename) {
        System.out.println("opening " + filename);
        String fullname = null;
        try {
            for (File p : searchPaths) {
                if (p.listFiles() != null) {
                for (File f : p.listFiles()) {
                    if (f.getName().equals(filename)) {
                        fullname =  f.getPath();
                        break;
                    }
                }
            }
            }
            if (fullname == null) {
                throw new IOException();
            }

            FileReader fr = new FileReader(fullname);
            BufferedReader br = new BufferedReader(fr);

            UnbufferedCharStream input = new UnbufferedCharStream(br);
            ZPPLexer lexer = new ZPPLexer(input);
            lexer.setTokenFactory(tokenFactory);
            lexer.preProcessor = this;
            return (List<ZPPToken>)lexer.getAllTokens();
        }
        catch (IOException ioe) {
            System.err.println("ERROR: Can't load "+filename);
        }
        return null;
    }

    public void process(String filename) throws IOException {
        tokenFactory.pushFilename(filename);
        final List<ZPPToken> tokens = load(filename);
        for (ZPPToken t : tokens) {
            System.out.println(t);
//            if (t.getType() == ZPPLexer.DEFINE) {
//                String pieces[] = t.getText().split("\\s");
//                if (pieces.length != 3) {
//                    System.err.println("ERROR: Can't parse " + t.getText());
//                }
//                else if (defines.containsKey(pieces[1])) {
//                    System.err.println("ERROR: " + pieces[1] + " already defined");
//                }
//                else {
//                    defines.put(pieces[1], StringEscapeUtils.unescapeJava(pieces[2]));
//                }
//            }
        }
    }
}
