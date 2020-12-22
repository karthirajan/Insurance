package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsers {
WebDriver driver=null;
@Parameters({"browsername"})
@Test
public void login(String name) {
	if (name.equals("ie")) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\NewTestNG\\driver\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
	    driver.get("https:www.facebook.com/");
	}
	else if (name.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\NewTestNG\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https:www.facebook.com/");
	    
	}
	else if (name.equals("ff")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\NewTestNG\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https:www.facebook.com/");
	}
	else {
		System.out.println("Not Matched");
	}
	driver.get("https:www.facebook.com/");
	driver.manage().window().maximize();
	driver.quit();
}

}
