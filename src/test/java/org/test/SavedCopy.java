package org.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SavedCopy {
	static WebDriver driver;
	@BeforeClass
	 public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\welcome\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:www.facebook.com/");
	}

	@BeforeMethod
	 public void start() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test(priority=2)
	public void t1() {
		driver.findElement(By.id("email")).sendKeys("Soundarya");
	}

	@Test(priority=-3)
	public void t2() {
		driver.findElement(By.id("pass")).sendKeys("9677");
	}

	@Test(priority=2)
	 public void t3() {
		driver.findElement(By.id("u_0_b")).click();
	}

	@AfterMethod
	public void end() {
		Date d = new Date();
		System.out.println(d);
	}

}
