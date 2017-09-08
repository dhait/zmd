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

package org.optionmetrics.zmd.tool;


import org.optionmetrics.zmd.core.MarkdownProcessor;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void writeZStyle(PrintStream outstream) {
        InputStream cssFile = Main.class.getResourceAsStream("/zstyle.css");
        BufferedReader cssReader = new BufferedReader(new InputStreamReader(cssFile));
        String css = cssReader.lines().collect(Collectors.joining("\n"));
        outstream.println(css);
    }

    public static void main(String [] args) throws Exception {

        Arguments arguments = new Arguments(args);
        arguments.parse();

        PrintStream outstream;
        if (arguments.getOutputFile().length() > 0) {
            outstream = new PrintStream(
                    new FileOutputStream(arguments.getOutputFile()));
        }
        else {
            outstream = System.out;
        }

        if (arguments.isZstyle()) {
            writeZStyle(outstream);
            return;
        }

        List<InputStream> streams = new ArrayList<>();
        for (String fileName : arguments.getRemaining()) {
            InputStream inputStream = new FileInputStream(fileName);
            streams.add(inputStream);
        }

        Reader reader = new BufferedReader(
                            new InputStreamReader(
                                    new SequenceInputStream(Collections.enumeration(streams))));

        MarkdownProcessor processor = new MarkdownProcessor();
        String result = processor.process(reader);
        outstream.println(result);
    }
}
