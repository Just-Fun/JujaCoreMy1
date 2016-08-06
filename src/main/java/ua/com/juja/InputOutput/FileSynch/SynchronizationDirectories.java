package ua.com.juja.InputOutput.FileSynch;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serzh on 8/2/16.
 */
public class SynchronizationDirectories {

    public static void synchDirs(File src, File dest) throws IOException {
        if (!src.isDirectory()) {
            throw new RuntimeException("Путь '" + src.getName() + "' ведет к файлу, а должен вести к папке.");
        }

        if (!dest.exists() || !dest.isDirectory() || dest.getName().equals(".DS_Store")) {
            File destNew = new File(dest.getParent() + "//dest");
            destNew.mkdir();
            dest = destNew;
        }
//        File[] srcFiles = src.listFiles();
        File[] srcFiles = src.listFiles((dir, name) -> !name.equals(".DS_Store")); // для мака :)
        File[] destFiles = dest.listFiles(); // listFiles() возвращает null, если это не директория, а файл

       if (srcFiles.length == 0) {                           // если папка src пуста
            if (dest.length() != 0) {
                FileUtils.cleanDirectory(dest);
            }
        } else {
            deleteIfNotInSource(srcFiles, destFiles);
            CheckIfHaveSameNameFoldersOrFiles(dest, srcFiles, destFiles);
        }
    }

    private static void CheckIfHaveSameNameFoldersOrFiles(File dest, File[] srcFiles, File[] destFiles) throws IOException {
        first:
        for (File from : srcFiles) {
            for (File to : destFiles) {
                if (from.getName().equals(to.getName())) {
                    if (from.isDirectory()) {
                        synchDirs(from, to);
                    } else {
                        replaceIfFilesDifferent(from, to);
                    }
                    continue first;
                }
            }
            copyFileOrDirInDir(dest, from);
        }
    }

    private static void copyFileOrDirInDir(File dest, File from) throws IOException {
        if (from.isDirectory()) {
            FileUtils.copyDirectoryToDirectory(from, dest);
        } else {
            FileUtils.copyFileToDirectory(from, dest);
        }
    }

    private static void replaceIfFilesDifferent(File source, File dest) throws IOException {
        if (source.length() != dest.length()) {
            FileUtils.copyFile(source, dest, Boolean.TRUE);
        }
    }

    private static void deleteIfNotInSource(File[] filesFrom, File[] filesTo) throws IOException {
        first:
        for (File dest : filesTo) {
            for (File source : filesFrom) {
                if (dest.getName().equals(source.getName())) {
                    continue first;
                }
            }
            FileUtils.deleteQuietly(dest);
        }
    }
}
