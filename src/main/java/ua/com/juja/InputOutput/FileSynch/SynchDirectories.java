package ua.com.juja.InputOutput.FileSynch;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serzh on 8/2/16.
 */
public class SynchDirectories {

    public static void fileSynch(File src, File dest) throws IOException {
        File[] srcFiles = src.listFiles();
        File[] destFiles = dest.listFiles(); // listFiles() возвращает null, если это не директория, а файл

        if (srcFiles == null & destFiles == null) {         // если src и File dest - это файлы, а не папки
            replaceIfFilesDifferent(src, dest);
        } else if (srcFiles == null) {                      // если src - это файл, а не папка, а dest - папка или папки
            File parent = new File(dest.getParent());
            FileUtils.cleanDirectory(parent);
            FileUtils.copyFileToDirectory(src, parent);
        } else if (destFiles == null) {                     // если dest - это файл, а не папка
            for (File from : srcFiles) {
                if (from.getName().equals(dest.getName())) {
                    replaceIfFilesDifferent(from, dest);
                } else {
                    FileUtils.copyDirectoryToDirectory(from, dest);
                }
            }
        } else if (srcFiles.length == 0) {                   // если папка src пуста
            FileUtils.cleanDirectory(dest);
        } else {                                             // если в src есть папки(файлы) и в dest папки(файлы)
            deleteIfNotInSource(srcFiles, destFiles);
            CheckCopyAndSoOn(dest, srcFiles, destFiles);
        }
    }

    private static void CheckCopyAndSoOn(File dest, File[] srcFiles, File[] destFiles) throws IOException {
        first:
        for (File from : srcFiles) {
            for (File to : destFiles) {
                if (from.getName().equals(to.getName())) {
                    if (from.isDirectory()) {
                        fileSynch(from, to);
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
