package ua.com.juja.InputOutput.FileSynch;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serzh on 8/2/16.
 */
public class MainMac {
    public static void main(String[] args) throws IOException {
        File temp1File = new File("/Users/Serzh/Prog/Temp1File");
        File tempDir = new File("/Users/Serzh/Prog/TempDir");
        File tempFileAndDirs = new File("/Users/Serzh/Prog/TempFileAndDirs");
        File testEmpty = new File("/Users/Serzh/Prog/testEmpty");

        File test = new File("/Users/Serzh/Prog/test");

        File tempFileAndDirsTest1_rtf = new File("/Users/Serzh/Prog/TempFileAndDirs/Test1.rtf");
        File testTest1_rtf = new File("/Users/Serzh/Prog/test/Test1.rtf");

        SynchDirectories.fileSynch(testEmpty, test);
    }
}
