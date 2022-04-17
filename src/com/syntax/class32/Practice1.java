package com.syntax.class32;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) throws IOException {

        String path = "/Users/Emilija/Desktop/Excel Files/Fruits.xlsx";
        //navigate to the file
        FileInputStream fileInputStream = new FileInputStream(path);
        //get the workbook from the file
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        //next we need to get the sheet and specify the name of the sheet
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        //last row num=num of rows
        int rows = sheet.getLastRowNum();
        //num of cells in the row representing the columns
        int cols = sheet.getRow(2).getLastCellNum();

        //using for loop to access all data(all rows and columns)
        XSSFCell cell = null;
        for (int r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            for (int c = 0; c <= cols; c++) {
                cell = row.getCell(c);
                //System.out.println(col+" ");
            }
            System.out.println();
        }

        //check the type of the cell data
        switch (cell.getCellType()) {
            case STRING:
                System.out.println(cell.getStringCellValue());
                break;
            case NUMERIC:
                System.out.println(cell.getNumericCellValue());
                break;
            case BOOLEAN:
                System.out.println(cell.getBooleanCellValue());
                break;
        }
    }
}
