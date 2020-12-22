package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Savedparameters {
	static WebDriver driver;
	@Parameters({"userName", "password"})
	@Test
	public void t1(@Optional("Ramya")String username, String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\welcome\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys("9677"); 
		driver.findElement(By.id("u_0_b")).click();
		driver.quit();
	}
	}

