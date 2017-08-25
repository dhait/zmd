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

package org.optionmetrics.zmd.core.section;

import org.apache.commons.text.StringEscapeUtils;
import org.optionmetrics.zmd.core.section.impl.Definition;
import org.optionmetrics.zmd.core.section.impl.Formal;
import org.optionmetrics.zmd.core.section.impl.SectionHeader;

import java.util.*;


public class Section {

    private List<Paragraph> paragraphs = new ArrayList<>();
    private Map<String, String> definitions = new HashMap<>();

        public enum Mark {
        NONE,
        TEMP,
        PERM
    }
    public Mark mark = Mark.NONE;

    public String getName() {
        return getSectionHeader().getSectionName();
    }

    private SectionHeader getSectionHeader() {
        return (SectionHeader) paragraphs.get(0);
    }

    public Map<String, String> getDefinitions() {
            return definitions;
    }
    public List<String> getParents() {
        return (getSectionHeader()).getParents();
    }

    public void visit(Set<Section> sections, List<Section> sorted) throws Exception {
        if (mark == Mark.PERM)
            return;
        if (mark == Mark.TEMP) {
            throw new Exception("Cycle present");
        }
        mark = Mark.TEMP;
        List<String> parents = getParents();
        for (String p : parents) {
            Optional<Section> ps = sections.stream()
                    .filter(s->s.getName().equals(p)).findFirst();
            if (ps.isPresent())
                ps.get().visit(sections, sorted);
        }
        mark = Mark.PERM;
        sorted.add(this);
    }


    public void collectDefinitions() {
        for (Paragraph p : paragraphs) {
            if (p instanceof Definition) {
                String key = ((Definition) p).getKey();
                String value = StringEscapeUtils.unescapeJava(((Definition) p).getValue());
                definitions.put(key,value);
            }
        }
    }
    public void expandDefinitions(Map<String, String> defines) {
        for (Paragraph p : paragraphs) {
            if (p instanceof Formal) {
                // make the substitutions
                Formal f = (Formal) p;
                f.expand(defines);
            }
        }
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    @Override
    public String toString() {

        return getName();

    }

    public void convertToZed() {
        for (Paragraph p : paragraphs) {
            if (p instanceof Formal) {
                Formal f = (Formal) p;
                f.convertToZed();
            }
            else if (p instanceof SectionHeader) {
                SectionHeader h = (SectionHeader) p;
                h.convertToZed();
            }
        }
    }
}