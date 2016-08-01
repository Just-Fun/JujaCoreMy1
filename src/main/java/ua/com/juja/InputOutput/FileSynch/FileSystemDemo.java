package ua.com.juja.InputOutput.FileSynch;

import java.io.File;

/**
 * Created by Oleg on 8/1/2016.
 */
public class FileSystemDemo {
    public static void main(String[] args) {
        File rootFile = new File("/Users/Serzh/Prog");
        printFileTree(rootFile, "");
    }

    private static void printFileTree(File rootFile, String offset){
        System.out.println(offset + rootFile.getName());
        File[] files = rootFile.listFiles(); // listFiles() возвращает null, если это не директория, а файл
        if (files == null) return;
        for (int i = 0; i < files.length; i++) {
            printFileTree(files[i], offset + "  ");
        }
    }
}