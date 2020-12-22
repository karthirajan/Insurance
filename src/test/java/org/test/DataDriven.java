package org.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static Object[][] getData() throws Throwable {

File f = new File("C:\\Users\\Soundharya\\eclipse-workspace\\NewTestNG\\target.ExcelWrite.xlsx");
FileInputStream f1 = new FileInputStream(f);
Workbook w = new XSSFWorkbook(f1);
Sheet s = w.getSheet("Sheet1");
String name=null;
Row r = s.getRow(0);
Object[][] obj = new Object[s.getPhysicalNumberOfRows()][r.getPhysicalNumberOfCells()];
 for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
	 Row row = s.getRow(i);
for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	Cell cell = row.getCell(j);
	int c = cell.getCellType();
	if (c==1) {
	 name = cell.getStringCellValue();
		System.out.println(name);
	}
	else if (c==0) {
		double d = cell.getNumericCellValue();
		long l = (long) d;
		name = String.valueOf(1);
		System.out.println(name);
	}
	obj[i][j]=name;
}
	 
 }
return obj;	
}

}
