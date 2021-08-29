package org.chrome.ChromeLaunch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Chrome {

	public static void main(String[] args, Object Stringcellvalue) throws IOException {
		File f=new File("D:\\DATA.xlsx");
		FileInputStream stream=new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(stream);
		
		Sheet sheet= w.getSheet("Sheet1");
		
		Row row= sheet.getRow(0);
		
		Cell cel= row.getCell(0);
		
         String stringCellValue= cel.getStringCellValue();
         
         System.out.println(stringCellValue);
	}

}
