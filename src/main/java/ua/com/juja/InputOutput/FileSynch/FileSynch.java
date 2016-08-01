package ua.com.juja.InputOutput.FileSynch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Oleg on 8/1/2016.
 */
public class FileSynch {
    public static void main(String[] args) {
        File source = new File("/Users/Serzh/Prog/Temp");
        File dest = new File("/Users/Serzh/Prog/TempIn");
        checkFileTree(source, dest);
    }

    private static void checkFileTree(File source, File dest){
        System.out.println("Before:");
        printTree(source, "");
        printTree(dest, "");

        long sourceLength = source.length();
        long destLength = dest.length();

        if (sourceLength != destLength) {
            copyFolders(source, dest);
            return;
        }

        File[] filesSource = source.listFiles(); // listFiles() возвращает null, если это не директория, а файл
        File[] filesDest = dest.listFiles();
        if (filesSource == null) return;
        if (filesDest == null) {
            copyFolders(source, dest);
            return;
        }

        for (int i = 0; i < filesSource.length; i++) {
            File sourceIn = filesSource[i];
            File destIn = filesDest[i];
            checkFileTree(sourceIn, destIn);
        }
    }

    private static void copyFolders(File source, File dest) {
        try {
            Files.copy(source.toPath(), dest.toPath());
            System.out.println("Done:");
            printTree(source, "");
            printTree(dest, "");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printTree(File source, String offset) {
        System.out.println(offset + source.getName() + " - length: " + source.length());

        File[] filesSource = source.listFiles(); // listFiles() возвращает null, если это не директория, а файл
        if (filesSource == null) return;
        for (int i = 0; i < filesSource.length; i++) {
            File fileSource = filesSource[i];
            printTree(fileSource, offset + "  ");
        }
    }

}
