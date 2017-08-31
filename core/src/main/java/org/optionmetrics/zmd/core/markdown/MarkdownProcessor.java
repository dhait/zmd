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

import org.apache.commons.lang3.StringUtils;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.optionmetrics.zmd.core.converter.SearchPath;
import org.optionmetrics.zmd.core.converter.ZMarkupProcessor;
import org.optionmetrics.zmd.core.parser.ZCodeParser;

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

        // write the Z markup blocks to a temp file, with tags
        // and update the tag in the document tree code blocks
        FileWriter writer = new FileWriter(tmpFile.toString(),true);
        BufferedWriter bw = new BufferedWriter(writer);
        TagVisitor tagVisitor = new TagVisitor(bw);
        document.accept(tagVisitor);
        bw.close();

        Map<Integer, ZNode> nodeMap = tagVisitor.getTagMap();

        // now we parse the Z markup file
        SearchPath searchPath = new SearchPath();
        searchPath.addItem(SearchPath.SourceType.RESOURCE_PATH, "/toolkit");
        searchPath.addItem(SearchPath.SourceType.RESOURCE_PATH, "");
        searchPath.addItem(SearchPath.SourceType.DIRECTORY, tmpFile.getParent());

        ZMarkupProcessor zMarkupProcessor = new ZMarkupProcessor(searchPath);
        String result = zMarkupProcessor.process(StringUtils.removeEnd(tmpFile.getName(), ".z"));

        // save results if desired
        /*
        File saveFile = File.createTempFile("save_", ".z");
        writer = new FileWriter(saveFile.toString(),true);
        bw = new BufferedWriter(writer);
        bw.write(results);
        bw.close();
        System.out.println(saveFile.getAbsolutePath());
        */

        // now parse the raw Z
        ZCodeParser zCodeParser = new ZCodeParser(nodeMap);
        zCodeParser.parse(result);
        // now each ZTreeNode has a list of ParserRuleContext for the paragraphs
        // of that node

        HtmlRenderer renderer = HtmlRenderer.builder()
                .nodeRendererFactory(context -> new ZNodeRenderer(context))
                .build();

        String rendering = renderer.render(document);
        PageBuilder builder = new PageBuilder();

        Map<String, String> root = new HashMap<>();

        InputStream cssFile = this.getClass().getResourceAsStream("/html/zstyle.css");
        BufferedReader cssReader = new BufferedReader(new InputStreamReader(cssFile));
        String css = cssReader.lines().collect(Collectors.joining());

        root.put("body", rendering);
        root.put("css", css);

        String page = builder.build(root);
        return page;
    }

}
