package com.syntax.class32;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Emp Info");

        //Storing the data in ArrayList ->we can store dif type of objects
        ArrayList<Object[]> empData = new ArrayList<>();
        empData.add(new Object[]{"EmpId", "Name", "Job"});
        empData.add(new Object[]{"123", "Mike", "Maintenance" });
        empData.add(new Object[] {"124", "Kiki", "Store Manager"});
        empData.add(new Object[] {"125", "Bobi", "Admin"});

        //using for each loop

        int rowNum = 0;
        for(Object[] emp:empData){
            XSSFRow row = sheet.createRow(rowNum++);

            int cellNum = 0;
            for(Object value:emp){
                XSSFCell cell= row.createCell(cellNum++);

                if(value instanceof String){
                    cell.setCellValue((String) value);
                }
                if(value instanceof Integer){
                    cell.setCellValue((Integer) value);
                }
                if(value instanceof Boolean){
                    cell.setCellValue((Boolean) value);
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
