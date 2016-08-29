package ua.com.juja.fromExcel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.io.FilenameUtils;


import java.io.*;
import java.util.Iterator;
/*Вы, наверное, уже нашли ответ на вопрос. Но вдруг кто искать будет.
POI работает с форматом xls через HSSF, а с xlsx через XSSF.*/

/**
 * Created by serzh on 7/12/16.
 */
public class Parser {

    public static String parseAndRead(String name) {

        String result = "";
        InputStream in;
        Workbook workbook = null;

        try {
            in = new FileInputStream(name);
            String ext = FilenameUtils.getExtension(name);
            if (ext.equals("xlsx")) {
                workbook = new XSSFWorkbook(in);
            } else if (ext.equals("xls")) {
                workbook = new HSSFWorkbook(in);
            } else {
                new RuntimeException("неведомый формат");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


       /* String[] split = name.split("\\.");
        String type = split[split.length - 1];
        try {
            in = new FileInputStream(name);
            if (type.equals("xlsx")) {
                workbook = new XSSFWorkbook(in);
            } else {
                workbook = new HSSFWorkbook(in);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                result = checkTypeAndAdd(result, cell);
            }
            result += "\n";
        }

        return result;
    }

    private static String checkTypeAndAdd(String result, Cell cell) {
        int cellType = cell.getCellType();
        switch (cellType) {
            case Cell.CELL_TYPE_STRING:
                result += "|" + cell.getStringCellValue();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                result += "|" + cell.getNumericCellValue();
                break;

            case Cell.CELL_TYPE_FORMULA:
                result += "|" + cell.getNumericCellValue();
                break;
            default:
                result += "|";
                break;
        }
        return result;
    }
}

// зависимости

/* <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>3.12</version>
        </dependency>
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>3.12</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.5</version>
        </dependency>*/