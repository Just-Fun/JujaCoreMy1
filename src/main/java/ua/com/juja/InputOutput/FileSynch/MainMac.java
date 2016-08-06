package ua.com.juja.InputOutput.FileSynch;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

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
        File dsTest = new File("/Users/Serzh/Prog/test/.DS_Store");
        File ds = new File("/Users/Serzh/Prog/Temp1File/.DS_Store");

        File tempFileAndDirsTest1_rtf = new File("/Users/Serzh/Prog/TempFileAndDirs/Test1.rtf");
        File testTest1_rtf = new File("/Users/Serzh/Prog/test/Test1.rtf");

        File test1 = new File("/Users/Serzh/Prog/test/1");
//        File test2 = new File(test1.getParent() + "//2");
//        test2.mkdir();

        SynchronizationDirectories.synchDirs(testEmpty, test);
        SynchronizationDirectories.synchDirs(tempDir, test1);
//        System.out.println(tempFileAndDirsTest1_rtf.getName());
//        System.out.println(ds.getName().equals(".DS_Store"));

//        File[] list = dsTest.listFiles();
//        System.out.println(Arrays.asList(list).toString());
    }
}
