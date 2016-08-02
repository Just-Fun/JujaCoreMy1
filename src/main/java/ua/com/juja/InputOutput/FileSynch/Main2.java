package ua.com.juja.InputOutput.FileSynch;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serzh on 8/2/16.
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        String from = "/Users/Serzh/Prog/TempIn/Inside1";
        String to = "/Users/Serzh/Prog/test/Inside1";
        copyDirectoryUsingApache(from, to);
    }


    public static void copyDirectoryUsingApache(String from, String to) throws IOException {
        File source = new File(from);
        File target = new File(to);
        FileUtils.copyDirectory(source, target);
    }

}
