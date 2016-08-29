package ua.com.juja.inputOutput.fileSynch;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serzh on 8/2/16.
 */
public class MainMac {
    public static void main(String[] args) throws IOException {
        File testEmpty = new File("/Users/Serzh/Prog/practice/testEmpty");
        File test1File = new File("/Users/Serzh/Prog/practice/test1File");
        File DS_Store = new File("/Users/Serzh/Prog/practice/.DS_Store");
        File testFilesAndDirs = new File("/Users/Serzh/Prog/practice/testFilesAndDirs");

        File out = new File("/Users/Serzh/Prog/practice/testOut");

        File test1 = new File("/Users/Serzh/Prog/test/1");

//        new SynchronizationDirectories().run(testEmpty, out);
        new SynchronizationDirectories().run(testFilesAndDirs, out);
//        new SynchronizationDirectories().run(DS_Store, out);
//        new SynchronizationDirectories().run(test1File, out);

//        File[] list = dsTest.listFiles();
//        System.out.println(arrays.asList(list).toString());
    }
}
