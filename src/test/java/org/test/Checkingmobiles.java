package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkingmobiles {
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\NewTestNG\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.snapdeal.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("keyword")).sendKeys("redmi y2 mobile phone");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
        List<WebElement> ele = driver.findElements(By.xpath("//p[@class='product-title']"));
        for (WebElement x : ele) {
        	String text = x.getText();
        	System.out.println(text);
        }
        File f = new File("C:\\Users\\Soundharya\\eclipse-workspace\\NewTestNG\\target.Excelphone.xlsx");
        Workbook w = new XSSFWorkbook();
        Sheet s = w.createSheet("Sheet1");
        for (int i = 0; i <ele.size(); i++) {
        	WebElement ele1 = ele.get(i);
        	String text = ele1.getText();
        	Row row = s.createRow(i);
        	Cell cell = row.createCell(0);
        	cell.setCellValue(text);        	
        }
        WebElement ele2 = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
        String text2 = ele2.getText();
        System.out.println(text2);
		FileOutputStream f1 = new FileOutputStream(f);
		w.write(f1);
		File f2 = new File("C:\\\\Users\\\\Soundharya\\\\eclipse-workspace\\\\NewTestNG\\\\target.Excelphone.xlsx");
		FileInputStream f3 = new FileInputStream(f2);
		Workbook w1 = new XSSFWorkbook(f3);
		Sheet s1 = w1.getSheet("Sheet1");
		for (int i = 0; i < s1.getPhysicalNumberOfRows(); i++) {
			Row row1 = s1.getRow(i);
			for (int j = 0; j <row1.getPhysicalNumberOfCells(); j++) {
				Cell cell1 = row1.getCell(j);
				int ct = cell1.getCellType();
				if (ct==1) {
					String stc = cell1.getStringCellValue();
					if (stc.valueOf(2).equals(text2.valueOf(2))) {
						System.out.println("true");		
					}else {
						System.out.println("false");
					}
				}
			}
		}
		
		
	}

}
