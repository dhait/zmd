package org.optionmetrics.zmd.core.zpp;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.optionmetrics.zmd.core.zpp.ZPreProcessor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ZPreProcessorTests {

    private void copyFile(String name) throws IOException {
        InputStream inputStream =
                this.getClass().getResourceAsStream("/" + name);
        Path dest = Paths.get(tempFolder.getRoot().getPath(), name);
        Files.copy(inputStream, dest);

    }
    @Rule
    public final TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void basicTest() throws URISyntaxException, IOException {

        copyFile("zeddef.zh");
        //copyFile("sequence_toolkit.zh");
        //copyFile("set_toolkit.zh");
        //copyFile("standard_toolkit.zh");
        copyFile("zpptest.z");

        ZPreProcessor zPreProcessor = new ZPreProcessor();
        zPreProcessor.addSearchPath(tempFolder.getRoot().getAbsoluteFile());

        zPreProcessor.process("zpptest.z");

        zPreProcessor.getDefines().forEach((d1,d2) ->
            System.out.println(d1 + " = " + d2));
    }
    @Test
    public void badTest() throws URISyntaxException, IOException {

        copyFile("zeddef.zh");
        copyFile("zppbad.z");

        ZPreProcessor zPreProcessor = new ZPreProcessor();
        zPreProcessor.addSearchPath(tempFolder.getRoot().getAbsoluteFile());

        zPreProcessor.process("zppbad.z");

    }

}
