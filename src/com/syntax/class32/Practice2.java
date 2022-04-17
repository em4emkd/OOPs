package com.syntax.class32;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Practice2 {
    //Workbook->Sheet->Rows->Cells

    public static void main(String[] args) throws IOException {
        //created empty workbook
        XSSFWorkbook workbook=new XSSFWorkbook();
        //created sheet
        XSSFSheet sheet = workbook.createSheet("Employee Info");
        //obj type of data, 2d array because we need rows and columns
        Object empData[][] = {{"EmpID", "Name", "Job"},
                                {111, "John", "Marketing"},
                                {112, "Tim", "Manager"},
                                 {112, "George", "BOM"}
                                };

        //Using for loop to create rows and columns
        int rows=empData.length;
        int cols=empData[0].length;

        System.out.println(rows);//4 rows
        System.out.println(cols);//3 column

        for(int r=0; r<rows; r++){
            //create a row in the sheet
            XSSFRow row = sheet.createRow(r);
            for(int c=0; c<cols; c++){
                //create a cell, multiple cells
              XSSFCell cell = row.createCell(c);
              //write the data
                Object value=empData[r][c];

                if(value instanceof String)//if the val contains String
                    cell.setCellValue((String) value);
                if(value instanceof Integer)
                    cell.setCellValue((Integer)value);
                if(value instanceof Boolean)
                    cell.setCellValue((Boolean) value);
            }
        }
        String path = "/Users/Emilija/Desktop/Excel Files/Employee.xlsx";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        System.out.println("File written successfully");

    }
}
