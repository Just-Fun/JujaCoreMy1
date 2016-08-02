package ua.com.juja.InputOutput.FileSynch;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * Created by Serzh on 8/2/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        source = new File("/Users/Serzh/Prog/Temp/Inside1/");
        File dest = new File("/Users/Serzh/Prog/TempIn/");
        File test = new File("/Users/Serzh/Prog/Temp1File");
        File test2 = new File("/Users/Serzh/Prog/TempIn/Inside1");
        File test3 = new File("/Users/Serzh/Prog/test/Inside1");
        File testEmpty = new File("/Users/Serzh/Prog/testEmpty");
//        copyFilesRecursive(test2, test3);

        File[] list = testEmpty.listFiles();
        System.out.println(list.length);
//        checkLength(test, dest);
    }

    private static void checkLength(File source, File dest) throws IOException {
        if (source.length() != dest.length()) {
            getFiles(source, dest);
        }
    }

    private static void getFiles(File source, File dest) throws IOException {
        File[] filesFrom = source.listFiles();
        File[] filesTo = dest.listFiles();
        // listFiles() возвращает null, если это не директория, а файл
        if (filesFrom == null & filesTo == null) { // если в обеих по одному файлу
            replaceIfFilesDifferent(source, dest);
        } else if (filesFrom == null) {            // если в исходящей только один файл
            deleteAllExceptSource(source, filesTo);
            replaceIfFilesDifferent(source, dest);
        } else if (filesTo == null) {             // если в dest только один файл
            for (File from : filesFrom) {
                if (from.getName().equals(dest.getName())) {
                    replaceIfFilesDifferent(from, dest);
                } else {
//                   copyFilesRecursive();
                }
            }
        } else if (filesFrom.length == 0) { // если source пуста
            cleanDirectory(dest);
        } else {
            deleteIfNotInSource(filesFrom, filesTo);

            from:
            for (File from : filesFrom) {
                to:
                for (File to : filesTo) {
                    if (equalsNameAndLength(from, to)) {
                        continue from;
                    } else {
                        getFiles(from, to);
                    }
                }
                File innerFolder = getInnerFolder(from, dest);
                copyFilesRecursive(from, innerFolder);
                getFiles(from, innerFolder);
            }
        }
    }

    private static void replaceIfFilesDifferent(File source, File dest) throws IOException {
        if (source.length() != dest.length()) {
            copyFilesRecursive(source, dest);
        }
    }

    private static boolean equalsNameAndLength(File from, File to) {
        return from.getName().equals(to.getName()) && from.length() == to.length();
    }

    private static void deleteIfNotInSource(File[] filesFrom, File[] filesTo) {
        first:
        for (File dest : filesTo) {
            for (File source : filesFrom) {
                if (dest.getName().equals(source.getName())) {
                    continue first;
                }
            }
            removeDirectory(dest);
        }
    }

    private static void deleteAllExceptSource(File source, File[] dest) {
        for (File to : dest) {
            if (!equalsNameAndLength(source, to)) {
                removeDirectory(to);
            }
        }
    }

    private static File getInnerFolder(File source, File dest) {
        String name = source.getName();
        String absolutePathDest = dest.getAbsolutePath();
        absolutePathDest += "/" + name;
        return new File(absolutePathDest);
    }

    public static void copyDirectory(File sourceDir, File targetDir) throws IOException {
        if (sourceDir.isDirectory()) {
            copyDirectoryRecursively(sourceDir, targetDir);
        } else {
            Files.copy(sourceDir.toPath(), targetDir.toPath());
        }
    }

    // recursive method to copy directory and sub-diretory in Java
    private static void copyDirectoryRecursively(File source, File target) throws IOException {
        if (!target.exists()) {
            target.mkdir();
        }

        for (String child : source.list()) {
            copyDirectory(new File(source, child), new File(target, child));
        }
    }

    private static void copyFilesRecursive(File source, File dest) throws IOException {
        CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
        };

        Files.copy(source.toPath(), dest.toPath(), options);

        if (source.isDirectory()) {
            File[] files = source.listFiles();
            for (File aFile : files) {
                File temp = getInnerFolder(aFile, dest);
                copyFilesRecursive(aFile, temp);
            }
        }
    }

    public static void removeDirectory(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                for (File aFile : files) {
                    removeDirectory(aFile);
                }
            }
            dir.delete();
        } else {
            dir.delete();
        }
    }

    public static void cleanDirectory(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                for (File aFile : files) {
                    removeDirectory(aFile);
                }
            }
        }
    }

}
