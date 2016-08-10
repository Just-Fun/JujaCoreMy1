package ua.com.juja.InputOutput.FileSynch;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serzh on 8/2/16.
 */
// TODO обработать исключения
public class SynchronizationDirectories {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/Serzh/Prog/TempFileAndDirs");
        File dest = new File("/Users/Serzh/Prog/test");
        synchronization(src, dest);
    }

    public static void synchronization(File src, File dest) throws IOException {
        IfPathDoesntExist(src);
        IfPathDoesntExist(new File(dest.getParent()));
        IfScrNotDirectory(src);
        dest = makeDirectoryIfNotExist(dest);
//        File[] srcFiles = src.listFiles();
        File[] srcFiles = src.listFiles((dir, name) -> !name.equals(".DS_Store")); // для мака :)
        File[] destFiles = dest.listFiles(); // listFiles() возвращает null, если это не директория, а файл

        if (srcFiles.length == 0) { // если папка src пуста
            if (dest.length() != 0) {
                FileUtils.cleanDirectory(dest);
                System.out.println("Очищена директория " + dest.getAbsolutePath());

            }
        } else {
            deleteIfNotInSource(srcFiles, destFiles);
            CheckIfHaveSameNameFoldersOrFiles(dest, srcFiles, destFiles);
        }
        System.out.println("Синфронизация завершена успешно!");
    }

    private static void CheckIfHaveSameNameFoldersOrFiles(File dest, File[] srcFiles, File[] destFiles) throws IOException {
        first:
        for (File from : srcFiles) {
            for (File to : destFiles) {
                if (from.getName().equals(to.getName())) {
                    if (from.isDirectory()) {
                        synchronization(from, to);
                    } else {
                        replaceIfFilesDifferent(from, to);
                    }
                    continue first;
                }
            }
            copyFileOrDirInDir(from, dest);
        }
    }

    private static void copyFileOrDirInDir(File src, File dest) throws IOException {
        if (src.isDirectory()) {
            FileUtils.copyDirectoryToDirectory(src, dest);
            System.out.println("Скопирована папка " + src.getName() + " в директорию: " + dest.getParent());
        } else {
            FileUtils.copyFileToDirectory(src, dest);
            System.out.println("Скопирован файл " + src.getName() + " в директорию: " + dest.getParent());
        }
    }

    private static void replaceIfFilesDifferent(File source, File dest) throws IOException {
        if (source.length() != dest.length()) {
            FileUtils.copyFile(source, dest, Boolean.TRUE);
            System.out.println("Заменен файл " + dest.getName() + " в директории: " + dest.getParent());
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
            String dirToRemove = dest.getAbsolutePath();
            FileUtils.deleteQuietly(dest);
            System.out.println("Удалена директория: " + dirToRemove);
        }
    }

    private static File makeDirectoryIfNotExist(File dest) {
        if (!dest.exists() || !dest.isDirectory() || dest.getName().equals(".DS_Store")) {
            File destNew = new File(dest.getParent() + "//dest");
            destNew.mkdir();
            dest = destNew;
            System.out.println("Создана папка 'dest' в директории: " + dest.getParent());
        }
        return dest;
    }

    private static void IfScrNotDirectory(File src) {
        if (!src.isDirectory()) {
            throw new RuntimeException("Путь '" + src.getAbsolutePath() + "' ведет к файлу, а должен вести к папке.");
        }
    }

    private static void IfPathDoesntExist(File file) {
        if (!file.exists()) {
            throw new RuntimeException("Путь '" + file.getAbsolutePath() + "' не существует...");
        }
    }
}
