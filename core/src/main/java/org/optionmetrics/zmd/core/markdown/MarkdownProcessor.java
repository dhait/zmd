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

package org.optionmetrics.zmd.core.markdown;

import org.antlr.v4.runtime.misc.MultiMap;
import org.apache.commons.lang3.StringUtils;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.optionmetrics.zmd.core.converter.Paragraph;
import org.optionmetrics.zmd.core.converter.SearchPath;
import org.optionmetrics.zmd.core.converter.Section;
import org.optionmetrics.zmd.core.converter.ZMarkupProcessor;
import org.optionmetrics.zmd.core.converter.impl.Formal;
import org.optionmetrics.zmd.core.converter.impl.SectionHeader;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MarkdownProcessor {

    public String process(Reader reader) throws Exception {

        Parser parser = Parser.builder().build();

        Node document = parser.parseReader(reader);

        File tmpFile = File.createTempFile("zmd_", ".z");
        tmpFile.deleteOnExit();

        FileWriter writer = new FileWriter(tmpFile.toString(),true);
        BufferedWriter bw = new BufferedWriter(writer);
        TagVisitor tagVisitor = new TagVisitor(bw);
        document.accept(tagVisitor);
        bw.close();

        // now we parse the file
        SearchPath searchPath = new SearchPath();
        searchPath.addItem(SearchPath.SourceType.RESOURCE_PATH, "/toolkit");
        searchPath.addItem(SearchPath.SourceType.RESOURCE_PATH, "");
        searchPath.addItem(SearchPath.SourceType.DIRECTORY, tmpFile.getParent());

        ZMarkupProcessor zMarkupProcessor = new ZMarkupProcessor(searchPath, true);
        String results = zMarkupProcessor.process(StringUtils.removeEnd(tmpFile.getName(), ".z"));

        // now the paragraphs have been translated

        // extract tagged paragraphs
        MultiMap<Integer, String> blockMap = new MultiMap<>();
        for (Section s: zMarkupProcessor.getSections()) {
            for (Paragraph p : s.getParagraphs()) {
                if (p instanceof Formal) {
                    // also add rendering
                    blockMap.map(p.getTagId(), ((Formal)p).toString());
                }
                else if (p instanceof SectionHeader) {
                    blockMap.map(p.getTagId(), ((SectionHeader) p).toString());
                }
            }
        }

        // put code back into document
        ReplaceVisitor replaceVisitor = new ReplaceVisitor(blockMap);
        document.accept(replaceVisitor);

        HtmlRenderer renderer = HtmlRenderer.builder()
                .nodeRendererFactory(context -> new NodeRenderer(context))
                .build();

        String result = renderer.render(document);
        PageBuilder builder = new PageBuilder();

        Map<String, String> root = new HashMap<>();


        InputStream cssFile = this.getClass().getResourceAsStream("/html/zstyle.css");
        BufferedReader cssReader = new BufferedReader(new InputStreamReader(cssFile));
        String css = cssReader.lines().collect(Collectors.joining());

        root.put("body", result);
        root.put("css", css);



        String page = builder.build(root);
        return page;

    }

}
