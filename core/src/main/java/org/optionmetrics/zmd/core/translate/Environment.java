package org.optionmetrics.zmd.core.translate;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Environment {
    private Path currentDir;
    private Path toolkitDir;
    private List<Path> sectionPath = new ArrayList<>();

    public Environment(Path toolkitDir) {
         this.currentDir =Paths.get(".").toAbsolutePath().normalize();
         this.toolkitDir =toolkitDir;
    }

    public void setCurrentDir(Path currentDir) {
        this.currentDir = currentDir;
    }

    public void setToolkitDir(Path toolkitDir) {
        this.toolkitDir = toolkitDir;
    }

    public Path getCurrentDir() {
        return currentDir;
    }

    public Path getToolkitDir() {
        return toolkitDir;
    }

    public List<Path> getSectionPath() {
        return sectionPath;
    }

    public void addToSectionPath(Path path) {
        sectionPath.add(path);
    }
}
