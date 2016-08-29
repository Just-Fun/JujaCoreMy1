package ua.com.juja.inputOutput.fileSynch;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serzh on 8/2/16.
 */
public class SynchronizationDirectories {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/Serzh/Prog/TempFileAndDirs");
        File dest = new File("/Users/Serzh/Prog/test");

        new SynchronizationDirectories().run(src, dest);
    }

    public void run(File src, File dest) {
        checkIfPathExist(src);
        checkIfPathExist(new File(dest.getParent()));
        ifScrIsNotADirectory(src);
        dest = makeDirectoryIfNotExist(dest);
        synchronization(src, dest);
        System.out.println("Синхронизация завершена успешно!");
    }

    private void synchronization(File src, File dest) {

        File[] srcFiles = src.listFiles((file) -> !file.isHidden());
        File[] destFiles = dest.listFiles();

        boolean folderEmpty = srcFiles.length == 0;
        if (folderEmpty) {
            if (dest.length() != 0) {
                try {
                    FileUtils.cleanDirectory(dest);
                } catch (IOException e) {
                    throw new RuntimeException(String.format("Не удалось очистить папку %s, ", dest.getName()), e.getCause());
                }
                System.out.println("Очищена директория " + dest.getAbsolutePath());
            }
        } else {
            deleteIfNotInSource(srcFiles, destFiles);

            checkIfHaveSameNameFoldersOrFiles(dest, srcFiles, destFiles);
        }
    }

    private void checkIfHaveSameNameFoldersOrFiles(File dest, File[] srcFiles, File[] destFiles) {
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

    private void copyFileOrDirInDir(File src, File dest) {
        if (src.isDirectory()) {
            try {
                FileUtils.copyDirectoryToDirectory(src, dest);
            } catch (IOException e) {
                throw new RuntimeException(String.format("Не удалось скопировать папку %s в папку %s, ", src.getName(), dest.getName()), e.getCause());
            }
            System.out.println("Скопирована папка " + src.getName() + " в директорию: " + dest.getPath());
        } else {
            try {
                FileUtils.copyFileToDirectory(src, dest);
            } catch (IOException e) {
                throw new RuntimeException(String.format("Не удалось скопировать файл %s в папку %s, ", src.getName(), dest.getName()), e.getCause());
            }
            System.out.println("Скопирован файл " + src.getName() + " в директорию: " + dest.getPath());
        }
    }

    private void replaceIfFilesDifferent(File source, File dest) {
        if (source.length() != dest.length()) {
            try {
                FileUtils.copyFile(source, dest, Boolean.TRUE);
            } catch (IOException e) {
                throw new RuntimeException(String.format("Не удалось заменить файл %s, ", dest.getName()), e.getCause());
            }
            System.out.println("Заменен файл " + dest.getName() + " в директории: " + dest.getParent());
        }
    }

    private void deleteIfNotInSource(File[] filesFrom, File[] filesTo) {
        first:
        for (File dest : filesTo) {
            for (File source : filesFrom) {
                if (dest.getName().equals(source.getName())) {
                    continue first;
                }
            }
            String dirToRemove = dest.getAbsolutePath();
            FileUtils.deleteQuietly(dest);
            System.out.println("Удалено: " + dirToRemove);
        }
    }

    private File makeDirectoryIfNotExist(File dest) {
        if (!dest.exists() || !dest.isDirectory() || dest.getName().equals(".DS_Store")) {
            File destNew = new File(String.format("%s//dest", dest.getParent()));
            // если создавать папку с таким же именем как  входной dest:
//            File destNew = new File(String.format("%s//%s", dest.getParent(), dest.getName()));
            destNew.mkdir();
            dest = destNew;
            System.out.println("Создана папка 'dest' в директории: " + dest.getParent());
        }
        return dest;
    }

    private void ifScrIsNotADirectory(File src) {
        if (!src.isDirectory()) {
            throw new RuntimeException("Путь '" + src.getAbsolutePath() + "' ведет к файлу, а должен вести к папке.");
        }
    }

    private void checkIfPathExist(File file) {
        if (!file.exists()) {
            throw new RuntimeException("Путь '" + file.getAbsolutePath() + "' не существует...");
        }
    }
}
