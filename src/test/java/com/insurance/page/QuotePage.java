package com.insurance.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insurance.resources.Commonactions;

public class QuotePage extends Commonactions {

	public QuotePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getCondo() {
		return condo;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getStart_quote() {
		return start_quote;
	}

	public WebElement getContinu() {
		return continu;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getContin() {
		return contin;
	}

	public WebElement getConfirm_pop_up() {
		return confirm_pop_up;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getMailcontinue() {
		return mailcontinue;
	}

	public WebElement getBuiltyear() {
		return builtyear;
	}

	public WebElement getPur_month() {
		return pur_month;
	}

	public WebElement getPur_year() {
		return pur_year;
	}

	public WebElement getPolicy_month() {
		return policy_month;
	}

	public WebElement getPolicy_day() {
		return policy_day;
	}

	public WebElement getPolicy_year() {
		return policy_year;
	}

	public WebElement getMort() {
		return mort;
	}

	public WebElement getResitype() {
		return resitype;
	}

	public WebElement getPet_no() {
		return pet_no;
	}

	public WebElement getDog_no() {
		return dog_no;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getHeat() {
		return heat;
	}

	public WebElement getStove() {
		return stove;
	}

	public WebElement getAlarm() {
		return alarm;
	}

	public WebElement getFire_alarm() {
		return fire_alarm;
	}

	public WebElement getSmoke_Detect() {
		return smoke_Detect;
	}

	public WebElement getNextContinue() {
		return nextContinue;
	}

	public WebElement getDistance() {
		return distance;
	}

	public WebElement getFire_dept() {
		return fire_dept;
	}

	public WebElement getCon_type() {
		return con_type;
	}

	public WebElement getFinalContinue() {
		return finalContinue;
	}
	@FindBy(xpath="(//*[text()='Condo'])[4]")
	private WebElement condo;
	
	@FindBy(id="quote-zip-code")
	private WebElement zipcode;
	
	@FindBy(id="body-btn-get-quote")
	private WebElement start_quote;
	
	@FindBy(id="continue")
	private WebElement continu;
	
	@FindBy(id="firstName")
	private WebElement Firstname;
	
	@FindBy(id="lastName")
	private WebElement Lastname;
	
	@FindBy(id="streetAddr1")
	private WebElement Address;
	
	@FindBy(xpath="(//select)[2]")
	private WebElement city;
	
	@FindBy(xpath="(//select)[5]")
	private WebElement gender;
	
	@FindBy(id="dobMonth")
	private WebElement month;
	
	@FindBy(id="dobDay")
	private WebElement day;
	
	@FindBy(id="dobYear")
	private WebElement year;
	
	@FindBy(id="continue")
	private WebElement contin;
	
	@FindBy(xpath="//*[text()='Use This Address']")
	private WebElement confirm_pop_up;
	
	@FindBy(id="emailAddress")
	private WebElement mail;
	
	@FindBy(id="continue")
	private WebElement mailcontinue;
	
	@FindBy(id="yearBuilt")
	private WebElement builtyear;
	
	@FindBy(id="purchaseMonth")
	private WebElement pur_month;
	
	@FindBy(id="purchaseYear")
	private WebElement pur_year;
	
	@FindBy(id="desiredPolicyStartMonth")
	private WebElement policy_month;
	
	@FindBy(id="desiredPolicyStartDay")
	private WebElement policy_day;
	
	@FindBy(id="desiredPolicyStartYear")
	private WebElement policy_year;
	
	@FindBy(xpath="(//select)[1]")
	private WebElement mort;
	
	@FindBy(xpath="(//select)[2]")
	private WebElement resitype;
	
	@FindBy(id="ownsPetViciousNo")
	private WebElement pet_no;
	
	@FindBy(id="ownDogNo")
	private WebElement dog_no;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	@FindBy(xpath="(//select)[1]")
	private WebElement heat;
	
	@FindBy(id="stoveNo")
	private WebElement stove;
	
	@FindBy(xpath="(//select)[2]")
	private WebElement alarm;
	
	@FindBy(xpath="(//select)[3]")
	private WebElement fire_alarm;
	
	@FindBy(xpath="(//select)[4]")
	private WebElement smoke_Detect;
	
	@FindBy(id="continue")
	private WebElement nextContinue;
	
	@FindBy(id="milesToFireStation")
	private WebElement distance;
	
	@FindBy(xpath="(//select)[1]")
	private WebElement fire_dept;
	
	@FindBy(xpath="(//select)[2]")
	private WebElement con_type;
	
	@FindBy(id="continue")
	private WebElement finalContinue;
	
}
