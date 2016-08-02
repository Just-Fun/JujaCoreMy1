package ua.com.juja.InputOutput.FileSynch;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * Created by Serzh on 8/2/16.
 */
public class Main {
//    private  static File source;
//    private  static File dest;
//    private static File test;

    public static void main(String[] args) throws IOException {
//        source = new File("/Users/Serzh/Prog/Temp/Inside1/");
        File dest = new File("/Users/Serzh/Prog/TempIn/");
        File test = new File("/Users/Serzh/Prog/Temp1File");

//        checkLength(test, dest);
    }

    private static void checkLength(File source, File dest) {
        if (source.length() != dest.length()) {
            getFiles(source, dest);
        }
    }

    private static void getFiles(File source, File dest) {
        File[] filesFrom = source.listFiles();
        File[] filesTo = source.listFiles();
        // listFiles() возвращает null, если это не директория, а файл
        if (filesFrom == null & filesTo == null) {
            copyIfFilesDifferent(source, dest);
            return;
        } else if (filesFrom == null) {

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
                copyFile(from, innerFolder);
                getFiles(from, innerFolder);
            }
        }
    }

    private static void copyIfFilesDifferent(File source, File dest) {
        if (source.length() != dest.length()) {
            copyFile(source, dest);
        }
    }

    private static boolean equalsNameAndLength(File from, File to) {
        return from.getName().equals(to.getName()) && from.length() == to.length();
    }

    private static void deleteIfNotInSource(File[] filesFrom, File[] filesTo) {
        first:
        for (File dest : filesTo) {
            second:
            for (File source : filesFrom) {
                if (dest.getName().equals(source.getName())) {
                    continue first;
                } else {
                    try {
                        Files.delete(dest.toPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static File getInnerFolder(File source, File dest) {
        String name = source.getName();
        String absolutePathDest = dest.getAbsolutePath();
        absolutePathDest += "/" + name;
        return new File(absolutePathDest);
    }

    private static void copyFile(File source, File dest) {
        CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
        };

        try {
            Files.copy(source.toPath(), dest.toPath(), options);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
