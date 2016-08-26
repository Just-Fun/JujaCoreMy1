package ua.com.juja.InputOutput.FileSynch;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serzh on 8/2/16.
 */
public class MainMac {
    public static void main(String[] args) throws IOException {
        File testEmpty = new File("/Users/Serzh/Prog/Practice/testEmpty");
        File test1File = new File("/Users/Serzh/Prog/Practice/test1File");
        File DS_Store = new File("/Users/Serzh/Prog/Practice/.DS_Store");
        File testFilesAndDirs = new File("/Users/Serzh/Prog/Practice/testFilesAndDirs");

        File out = new File("/Users/Serzh/Prog/Practice/testOut");

        File test1 = new File("/Users/Serzh/Prog/test/1");

//        new SynchronizationDirectories().run(testEmpty, out);
        new SynchronizationDirectories().run(testFilesAndDirs, out);
//        new SynchronizationDirectories().run(DS_Store, out);
//        new SynchronizationDirectories().run(test1File, out);

//        File[] list = dsTest.listFiles();
//        System.out.println(Arrays.asList(list).toString());
    }
}
