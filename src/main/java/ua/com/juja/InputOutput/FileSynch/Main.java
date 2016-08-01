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
        File source = new File("/Users/Serzh/Prog/Temp/Inside1/pgadmin3-1.22.1.dmg");
        String  name = source.getName();
        File dest = new File("/Users/Serzh/Prog/TempIn/Inside1/" + name);
        copyFileUsingJava7Files(source, dest);
    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
        };

        Files.copy(source.toPath(), dest.toPath(), options);

    }

}
