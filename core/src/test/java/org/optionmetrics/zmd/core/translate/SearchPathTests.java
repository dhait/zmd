package org.optionmetrics.zmd.core.translate;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Paths;

public class SearchPathTests {

    SearchPath source = new SearchPath();

    @Rule
    public TemporaryFolder tempfolder = new TemporaryFolder();

    @Before
    public void Init() throws IOException {
        source.addItem(SearchPath.SourceType.RESOURCE_PATH, "/toolkit");
        source.addItem(SearchPath.SourceType.RESOURCE_PATH, "/");
        source.addItem(SearchPath.SourceType.DIRECTORY, tempfolder.getRoot().getAbsolutePath());
        tempfolder.newFile("abc.z");
    }

    @Test
    public void ResourceTest() throws Exception {
        System.out.println(source.find("prelude.z"));
    }

    @Test
    public void FileTest() throws Exception {

        System.out.println(source.find("abc.z"));
    }
}
