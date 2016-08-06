package ua.com.juja.InputOutput.FileSynch;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serzh on 8/2/16.
 */
public class SynchronizationDirectories {

    public static void synchDirs(File src, File dest) throws IOException {
        File[] srcFiles = src.listFiles();
        File[] destFiles = dest.listFiles(); // listFiles() возвращает null, если это не директория, а файл

        // походу этих вариантов не  будет
       /* if (srcFiles == null & destFiles == null) {         // если src и File dest - это файлы, а не папки
            replaceIfFilesDifferent(src, dest);
        } else if (srcFiles == null) {                      // если src - это файл, а не папка, а dest - папка(+файл(ы)) или папки(+файл(ы))
            removeAllExceptSrcFile(src, dest, destFiles);
        } else if (destFiles == null) {                     // если dest - это файл, а не папка
            for (File from : srcFiles) {
                if (from.getName().equals(dest.getName())) {
                    replaceIfFilesDifferent(from, dest);
                } else {
                    FileUtils.copyDirectoryToDirectory(from, dest);
                }
            }
        } else */

       if (srcFiles.length == 0) {                   // если папка src пуста
            if (dest.length() != 0) {
                FileUtils.cleanDirectory(dest);
            }
        } else {                                             // если в src есть папки(файлы) и в dest папки(файлы)
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

    /*private static void removeAllExceptSrcFile(File src, File dest, File[] destFiles) throws IOException {
        File parentDest = new File(dest.getParent());
        for (File file : destFiles) {
            if (file.getName().equals(src.getName())) {
                replaceIfFilesDifferent(src, file);
            } else {
                file.delete();
            }
            if (parentDest.listFiles().length == 0) {
                FileUtils.cleanDirectory(parentDest);
                FileUtils.copyFileToDirectory(src, parentDest);
            }

        }
    }*/
}
