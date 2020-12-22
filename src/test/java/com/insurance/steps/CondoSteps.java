package com.insurance.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.insurance.page.QuotePage;
import com.insurance.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CondoSteps extends Commonactions {

	QuotePage quote = new QuotePage();
	
	public static WebDriver driver;

	@Given("User launches the browser")
	public void user_launches_the_browser() {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chrome87//chromedriver.exe");
		driver.get("https://www.travelers.com/");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("User filling up the basic details")
	public void user_filling_up_the_basic_details() throws InterruptedException {
		
		driver.findElement(By.id("trans-fake-get-quote")).click();
		
		//Select s = new Select(element);
		/*driver.findElement(By.xpath("(//*[text()='Condo'])[4]")).click();*/
		/*driver.findElement(By.id("quote-zip-code")).sendKeys("02129");*/
		
		click(quote.getCondo());
		insertText(quote.getZipcode(),"02129");
		

	}

	@When("User clicks start quote button")
	public void user_clicks_start_quote_button() throws InterruptedException {
		
		/*driver.findElement(By.id("body-btn-get-quote")).click();*/
		
		click(quote.getStart_quote());
		Thread.sleep(8000);
	}

	/*@Then("User is displayed with next page")
	public void user_is_displayed_with_next_page() {
		WebElement yes = driver.findElement(By.id("currentTrvCustomerYes"));
		boolean no = driver.findElement(By.id("currentTrvCustomerNo")).isSelected();
	
	}*/

	@Then("User clicks the continue button")
	public void user_clicks_the_continue_button() throws InterruptedException {
		
		driver.findElement(By.id("continue")).click();
		
		/*if (no==true) {
			driver.findElement(By.id("continue")).click();
		}*/
		
		click(quote.getContinu());
		
		Thread.sleep(8000);
	}

	@When("User entering all the details in tell about page")
	public void user_entering_all_the_details_in_tell_about_page() {
		
		/*driver.findElement(By.id("firstName")).sendKeys("prnkmr");
		driver.findElement(By.id("lastName")).sendKeys("kvichkr");
		driver.findElement(By.id("streetAddr1")).sendKeys("chenn");*/
		
		insertText(quote.getFirstname(), "prnkmr");
		insertText(quote.getLastname(), "kvichkr");
		insertText(quote.getAddress(), "chenn");

		/*WebElement city = driver.findElement(By.xpath("(//select)[2]"));
		Select select1 = new Select(city);
		select1.selectByIndex(1);*/
		
		selectByIndex(quote.getCity(), 1);


		/*WebElement gender = driver.findElement(By.xpath("(//select)[5]"));
		Select select2 = new Select(gender);
		select2.selectByIndex(1);*/
		
		selectByIndex(quote.getGender(), 1);

		/*driver.findElement(By.id("dobMonth")).sendKeys("10");
		driver.findElement(By.id("dobDay")).sendKeys("20");
		driver.findElement(By.id("dobYear")).sendKeys("1990");*/
		
		insertText(quote.getMonth(), "10");
		insertText(quote.getDay(), "20");
		insertText(quote.getYear(), "1990");
		
	}

	@When("User clicks Yes,start quote button")
	public void user_clicks_Yes_start_quote_button() throws InterruptedException {
		
		/*driver.findElement(By.id("continue")).click();*/
		
		click(quote.getContin());
		
		Thread.sleep(180000);
	}

	@Then("User is displayed with confirm pop-up and clicks Yes,start quote button")
	public void user_is_displayed_with_confirm_pop_up_and_clicks_Yes_start_quote_button() throws InterruptedException {
		
		/*driver.findElement(By.xpath("//*[text()='Use This Address']")).click();*/
		
		click(quote.getConfirm_pop_up());
		
		Thread.sleep(10000);
	}

	@Then("User clicks the contiue button after entering the email address")
	public void user_clicks_the_contiue_button_after_entering_the_email_address() throws InterruptedException {
		
		/*driver.findElement(By.id("emailAddress")).sendKeys("prnkmrkvi@gmail.com");
		driver.findElement(By.id("continue")).click();*/
		
		insertText(quote.getMail(), "prnkmrkvi@gmail.com");
		click(quote.getMailcontinue());
		
		Thread.sleep(10000);
	}

	@When("User giving all the details in the Condo Basics page")
	public void user_giving_all_the_details_in_the_Condo_Basics_page() {

		//Condo Basics
		/*driver.findElement(By.id("yearBuilt")).sendKeys("2000");*/
		
		insertText(quote.getBuiltyear(), "2000");

		/*driver.findElement(By.id("purchaseMonth")).sendKeys("05");
		driver.findElement(By.id("purchaseYear")).sendKeys("2005");*/
		
		insertText(quote.getPur_month(), "05");
		insertText(quote.getPur_year(), "2005");

		/*driver.findElement(By.id("desiredPolicyStartMonth")).sendKeys("12");
		driver.findElement(By.id("desiredPolicyStartDay")).sendKeys("29");
		driver.findElement(By.id("desiredPolicyStartYear")).sendKeys("2020");*/
		
		insertText(quote.getPolicy_month(), "12");
		insertText(quote.getPolicy_day(), "29");
		insertText(quote.getPolicy_year(), "2020");

		/*WebElement mort = driver.findElement(By.xpath("(//select)[1]"));
		Select select3 = new Select(mort);
		select3.selectByIndex(1);*/
		
		selectByIndex(quote.getMort(), 1);

		/*WebElement resitype = driver.findElement(By.xpath("(//select)[2]"));
		Select select4 = new Select(resitype);
		select4.selectByIndex(0);*/
		
		selectByIndex(quote.getResitype(), 0);

		/*driver.findElement(By.id("ownsPetViciousNo")).click();
		driver.findElement(By.id("ownDogNo")).click();*/
		
		click(quote.getPet_no());
		click(quote.getDog_no());
		
	}

	@When("User clicking the continue button")
	public void user_clicking_the_continue_button1() throws InterruptedException {
		
		/*driver.findElement(By.id("continue")).click();*/
		
		click(quote.getContinue());
		
		Thread.sleep(10000);
	}

	@When("User gives all the details in the Condo Interior Page")
	public void user_gives_all_the_details_in_the_Condo_Interior_Page() {
		
		/*WebElement heat = driver.findElement(By.xpath("(//select)[1]"));
		Select select5 = new Select(heat);
		select5.selectByIndex(1);*/
		
		selectByIndex(quote.getHeat(), 1);

		/*driver.findElement(By.id("stoveNo")).click();*/
		
		click(quote.getStove());

		/*WebElement alarm = driver.findElement(By.xpath("(//select)[2]"));
		Select select6 = new Select(alarm);
		select6.selectByIndex(1);*/
		
		selectByIndex(quote.getAlarm(), 1);

		/*WebElement firealarm = driver.findElement(By.xpath("(//select)[3]"));
		Select select7 = new Select(firealarm);
		select7.selectByIndex(1);*/
		
		selectByIndex(quote.getFire_alarm(), 1);

		/*WebElement smokeD = driver.findElement(By.xpath("(//select)[4]"));
		Select select8 = new Select(smokeD);
		select8.selectByIndex(1);*/	
		
		selectByIndex(quote.getSmoke_Detect(), 1);
		
	}

	@When("User clicks contiue button")
	public void user_clicks_contiue_button() throws InterruptedException {
		
		/*driver.findElement(By.id("continue")).click();*/
		
		click(quote.getNextContinue());
		
		Thread.sleep(10000);
	}

	@When("User enters the details in the Condo Exterior page")
	public void user_enters_the_details_in_the_Condo_Exterior_page() {
		
		/*driver.findElement(By.id("milesToFireStation")).sendKeys("20");*/
		
		insertText(quote.getDistance(), "20");

		/*WebElement firedep = driver.findElement(By.xpath("(//select)[1]"));
		Select select9 = new Select(firedep);
		select9.selectByIndex(1);*/
		
		selectByIndex(quote.getFire_dept(), 1);

		/*WebElement contype = driver.findElement(By.xpath("(//select)[2]"));
		Select select10 = new Select(contype);
		select10.selectByIndex(1);*/
		
		selectByIndex(quote.getCon_type(), 1);
	}

	@When("User click the continue button")
	public void user_click_the_continue_button() throws InterruptedException {
		
		/*driver.findElement(By.id("continue")).click();*/
		
		click(quote.getFinalContinue());
		
		Thread.sleep(10000);
	}


}
