package org.optionmetrics.zmd.core;

public class ZInfo {

    private boolean zblock = false;
    private String language;

    public ZInfo(String info) {
        String language = "";
        if (info != null) {
            String[] parts = info.split(" ");
            if (parts.length > 0)
                language = parts[0];
        }
        zblock = (language.toLowerCase().equals("z") || language.toLowerCase().equals("zed"));
    }

    public boolean isZ() {
        return zblock;
    }
}
