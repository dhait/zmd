package org.optionmetrics.zmd.core.translate;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SearchPath {

    enum SourceType {
        RESOURCE_PATH,
        DIRECTORY
    }

    class Source {
        SourceType type;
        String path;
        Source(SourceType type, String path) {
            this.type = type;
            this.path = path;
        }
    }

    List<Source> sources = new ArrayList<>();


    public void addItem(SourceType type, String path ) {
        sources.add(new Source(type, path));
    }

    public InputStream find(String name) throws IOException {
        for (Source s : sources) {
            if (s.type == SourceType.RESOURCE_PATH) {
                URL url = this.getClass().getResource(s.path + File.separatorChar + name);
                if (url != null) {
                    return url.openStream();
                }
            }
            else if (s.type == SourceType.DIRECTORY) {
                File f = new File(s.path, name);
                if (f.exists()) {
                    URL url = f.toURI().toURL();
                    return url.openStream();
                }
            }
        }
        // not found
        return null;
    }
/*        this.getClass().getResourceAsStream()
        URL url;
        url = this.getClass().getResource(name);
        if (url == null) {
            File f = new File(name);
            if (!f.exists()) {
                return null;
            }
            try {
                url = f.toURI().toURL();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return url == null ? null :  url.openStream();

    }
    */
}
