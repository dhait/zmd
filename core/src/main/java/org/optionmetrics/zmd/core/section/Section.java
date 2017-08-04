package org.optionmetrics.zmd.core.section;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Section {
    private List<Paragraph> paragraphs = new ArrayList<>();

}
