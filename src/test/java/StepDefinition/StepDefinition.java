package StepDefinition;

import org.openqa.selenium.By;

import com.insurance.resources.Commonactions;

import PageObjectRepository.InsurancePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition extends Commonactions {
	
	
	InsurancePage page=new InsurancePage();
	
	@Given("User navigate to the url")
	public void user_navigate_to_the_url() throws InterruptedException {
			  launch("https://www.travelers.com/");
		}
	   
	@When("User selects auto+home from dropdown")
    public void user_selects_auto_home_from_dropdown() {
		
		click(driver.findElement(By.id("trans-fake-get-quote")));
		click(driver.findElement(By.xpath("//label[@for='dd-AUTO,HOME']")));
//	  click(page.getDropdown());
//	  click(page.getAutoHome());
	}

	@When("User gives the zipcode")
	public void user_gives_the_zipcode() {
		insertText(driver.findElement(By.id("quote-zip-code")),"33526");
	    //insertText(page.getZipCode(), "33526");
	}

	@When("user clicks start quote")
	public void user_clicks_start_quote() {
		click(driver.findElement(By.id("body-btn-get-quote")));
	   //click(page.getGetQuote());
	}

	@When("User closes the popup")
	public void user_closes_the_popup() {
		click(driver.findElement(By.xpath("//button[@class='close']")));
	   // click(page.getCloseButton());
	}

	@When("User validates whether the radiobutton is selected and clicks on continue quote")
	public void validates_whether_the_radiobutton_is_selected() {
		boolean quote =driver.findElement(By.xpath("//input[@id='currentTrvCustomerNoFake']")).isSelected();
	 	if (quote==true) {
	 		click(driver.findElement(By.id("continue")));
			}
//		boolean quote = page.getRadioButton().isSelected();
//	 	if (quote==true) {
//	 		click(page.getContinue());
//			}
	}


	@When("User fills all the details and clicks start my quote")
	public void user_fills_all_the_details_and_clicks_start_my_quote() throws InterruptedException {
		 insertText(driver.findElement(By.id("firstName")), "Harry");
		   insertText(driver.findElement(By.id("lastName")), "Potter");
		   insertText(driver.findElement(By.id("streetAddr1")), "gvjvjhvjhv");
		   click(driver.findElement(By.id("genderMale")));
		   insertText(driver.findElement(By.id("dobMonth")), "01");
		   insertText(driver.findElement(By.id("dobDay")), "01");
		   insertText(driver.findElement(By.id("dobYear")), "1995");
		   click(driver.findElement(By.id("continue")));
		   Thread.sleep(60000);
		   waitForElementClickable(driver.findElement(By.id("overlayZipConfirmUseButton")));
		   click(driver.findElement(By.id("overlayZipConfirmUseButton")));
		   insertText(driver.findElement(By.id("emailAddress")), "harry@mail.com");
		   click(driver.findElement(By.id("continue")));
		   
//	   insertText(page.getFirstName(), "Harry");
//	   insertText(page.getLastName(), "Potter");
//	   insertText(page.getAddress(), "gvjvjhvjhv");
//	   click(page.getGenderMale());
//	   insertText(page.getMonth(), "01");
//	   insertText(page.getDay(), "01");
//	   insertText(page.getYear(), "1995");
//	   click(page.getContinue());
//	   click(page.getConfirmAddressButton());
//	   insertText(page.getMailAddress(), "harry@mail.com");
//	   click(page.getContinue());
//	   
	}



}
