package ua.com.juja.InputOutput.FileSynch;

import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg on 8/2/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // Windows Oleg
        File temp1File = new File("/Users/Serzh/Prog/Temp1File");
        File tempDir = new File("/Users/Serzh/Prog/TempDir");
        File tempFileAndDirs = new File("H:\\TestOut\\TempFileAndDirs");
        File testEmpty = new File("H:\\TestOut\\testEmpty");

        File test = new File("H:\\TestIn");
//        System.out.println(test.length());

        SynchronizationDirectories.synchronization(tempFileAndDirs, test);
    }
}
