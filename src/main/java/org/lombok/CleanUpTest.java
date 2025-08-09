package org.lombok;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CleanUpTest {
    public void readFile(String path) throws IOException{
        @Cleanup InputStream in = new FileInputStream(path);

        byte [] data = in.readAllBytes();
        System.out.println(new String(data));
    }
}
