package ua.com.juja.InputOutput.FileSynch;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Serzh on 8/2/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File temp1File = new File("/Users/Serzh/Prog/Temp1File");
        File tempDir = new File("/Users/Serzh/Prog/TempDir");
        File tempFileAndDirs = new File("/Users/Serzh/Prog/TempFileAndDirs");
        File testEmpty = new File("/Users/Serzh/Prog/testEmpty");

        File test = new File("/Users/Serzh/Prog/test");

        checkDirLength(tempFileAndDirs, test);

    }

    private static void checkDirLength(File source, File dest) throws IOException {
        if (source.length() != dest.length()) {
            fileSynch(source, dest);
        }
    }

    private static void fileSynch(File src, File dest) throws IOException {
        File[] srcFiles = src.listFiles();
        File[] destFiles = dest.listFiles(); // listFiles() возвращает null, если это не директория, а файл

        if (srcFiles == null & destFiles == null) {        // если src, File dest - это файлы, а не папки
            replaceIfFilesDifferent(src, dest);
        } else if (srcFiles == null) {                   // если src - это файл, а не папка, а dest - папка или папки
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
        }
        if (srcFiles.length == 0) {                       // если папка src пуста
            FileUtils.cleanDirectory(dest);
        } else {                                             // если в src есть папки(файлы)
            deleteIfNotInSource(srcFiles, destFiles);
            findSameCheckCopyAndSoOn(dest, srcFiles, destFiles);
        }
    }

    private static void findSameCheckCopyAndSoOn(File dest, File[] srcFiles, File[] destFiles) throws IOException {
        from:
        for (File from : srcFiles) {
            for (File to : destFiles) {
                if (from.getName().equals(to.getName())) {
                    if (from.length() == to.length()) {
                        // do nothing
                    } else {
                        fileSynch(from, to);
                    }
                    continue from;
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
            copyDirectory(source, dest);
        }
    }

    private static boolean equalsNameAndLength(File from, File to) {
        return from.getName().equals(to.getName()) && from.length() == to.length();
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


    // TODO если все ок - ниже все завалить...
    public static void copyDirectoryUsingApache(String from, String to) throws IOException {
        File source = new File(from);
        File target = new File(to);
        FileUtils.copyDirectory(source, target); //  копирует все, оставляя что было
    }

    private static void deleteAllRedundantAndCompareFile(File source, File[] dest) throws IOException {
        for (File to : dest) {
            if (!equalsNameAndLength(source, to)) {
                FileUtils.deleteDirectory(to);
            } else {
                replaceIfFilesDifferent(source, to);
            }
        }
    }

    private static File getInnerFolder(File source, File dest) {
        String name = source.getName();
        String absolutePathDest = dest.getAbsolutePath();
        absolutePathDest += "/" + name;
        return new File(absolutePathDest);
    }



    /* private static void copyFilesRecursive(File source, File dest) throws IOException {
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
 */
   /* public static void removeDirectory(File dir) {
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
    }*/

    /*public static void cleanDirectory(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                for (File aFile : files) {
                    removeDirectory(aFile);
                }
            }
        }
    }
*/
}
