package org.optionmetrics.zmd.core.section;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SectionHeader implements Paragraph {
    private String sectionName;
    private List<String> parents = new ArrayList<>();
}
