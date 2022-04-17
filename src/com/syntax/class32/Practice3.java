package com.syntax.class32;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice3 {
    public static void main(String[] args) throws IOException {
        //created empty workbook
        XSSFWorkbook workbook=new XSSFWorkbook();
        //created sheet
        XSSFSheet sheet = workbook.createSheet("Employee Info");
        //obj type of data, 2d array because we need rows and columns
        Object empData[][] = {{"EmpID", "Name", "Job"},
                             {111, "John", "Marketing"},
                            {112, "Tim", "Manager"},
                             {113, "George", "BOM"}
                             };
        int rowCount = 0;
        for(Object[] emp:empData){
           XSSFRow row = sheet.createRow(rowCount++);

            int columnCount = 0;
            for(Object value:emp){
                XSSFCell cell = row.createCell(columnCount++);

                if(value instanceof String){
                    cell.setCellValue((String)value);
                }
                if (value instanceof Integer){
                    cell.setCellValue((Integer)value);
                }
                if(value instanceof Boolean){
                    cell.setCellValue((Boolean)value);
                }
            }
        }

        String path = "/Users/Emilija/Desktop/Excel Files/Emp.xlsx";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        System.out.println("File written successfully");

    }
}
