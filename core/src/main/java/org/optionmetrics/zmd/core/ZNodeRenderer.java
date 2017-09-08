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

package org.optionmetrics.zmd.core;

import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Node;
import org.commonmark.renderer.html.CoreHtmlNodeRenderer;
import org.commonmark.renderer.html.HtmlNodeRendererContext;
import org.commonmark.renderer.html.HtmlWriter;


import java.util.Map;
import java.util.Set;

import static java.util.Collections.singleton;

public class ZNodeRenderer extends CoreHtmlNodeRenderer {

    public Map<Integer, String> blockMap;

    public ZNodeRenderer(HtmlNodeRendererContext context, Map<Integer, String> blockMap) {
        super(context);
        this.blockMap = blockMap;
    }

    @Override
    public Set<Class<? extends Node>> getNodeTypes() {
        return singleton(FencedCodeBlock.class);
    }

    @Override
    public void render(Node node) {
        FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
        ZInfo info = new ZInfo(fencedCodeBlock.getInfo());
        if (info.isZ()) {
            ZNode znode = (ZNode) fencedCodeBlock.getFirstChild();
            zrender(znode);
        }
        else {
            super.render(node);
        }
    }
    public void zrender(ZNode znode) {
        int tag = znode.getTag();
        HtmlWriter html = context.getWriter();
        html.line();
        String htmlText = blockMap.get(tag);
        html.raw(htmlText);
        html.line();
    }

}
