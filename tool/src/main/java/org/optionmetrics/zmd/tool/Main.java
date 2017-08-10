package org.optionmetrics.zmd.tool;

import org.optionmetrics.zmd.core.Compiler;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    Compiler compiler = new Compiler();

    public static void main(String [] args) throws IOException {

        System.out.println("Hello");

        URL url1 = Main.class.getResource("/toolkit/prelude.z");
        System.out.println(url1.toString());

        URL url2 = Main.class.getResource("/hello.properties");
        System.out.println(url2.toString());

        URLConnection x = url1.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(x.getInputStream()));
        reader.lines().forEach(l->System.out.println(l));

        x = url2.openConnection();
        reader = new BufferedReader(new InputStreamReader(x.getInputStream()));
        reader.lines().forEach(l->System.out.println(l));





    }
}
