package ua.com.juja.FromExcel;

import java.io.IOException;

/**
 * Created by serzh on 7/12/16.
 */
public class Main2 {

    public static void main(String[] args) throws IOException {


        System.out.println(Parser.parseAndRead("/home/serzh/Desktop/testfile.xlsx"));

       /* ReadWriteExcelFile.writeXLSFile();
        ReadWriteExcelFile.readXLSFile();

        ReadWriteExcelFile.writeXLSXFile();
        ReadWriteExcelFile.readXLSXFile();
*/
    }
}
