package PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insurance.resources.Commonactions;

public class InsurancePage extends Commonactions {
	public InsurancePage() {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(id="trans-fake-get-quote")
	private WebElement Dropdown;
	
	@FindBy(xpath="//label[@for='dd-AUTO,HOME']")
	private WebElement AutoHome;
	
	@FindBy(id="quote-zip-code")
	private WebElement ZipCode;
	
	@FindBy(id="body-btn-get-quote")
	private WebElement GetQuote;
	
	@FindBy(xpath="//button[@class='close']")
	private WebElement CloseButton;
	
	@FindBy(xpath="//input[@id='currentTrvCustomerNoFake']")
	private WebElement RadioButton;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	@FindBy(id="firstName]")
	private WebElement FirstName;
	
	@FindBy(id="lastName")
	private WebElement LastName;
	
	@FindBy(id="streetAddr1")
	private WebElement Address;
	
	@FindBy(id="genderMale")
	private WebElement GenderMale;
	
	@FindBy(id="dobMonth]")
	private WebElement Month;
	
	@FindBy(id="dobDay")
	private WebElement Day;
	
	@FindBy(id="dobYear")
	private WebElement Year;
	
	@FindBy(id="overlayZipConfirmUseButton")
	private WebElement ConfirmAddressButton;
	
	@FindBy(id="emailAddress")
	private WebElement MailAddress;

	public WebElement getDropdown() {
		return Dropdown;
	}

	public WebElement getAutoHome() {
		return AutoHome;
	}

	public WebElement getZipCode() {
		return ZipCode;
	}

	public WebElement getGetQuote() {
		return GetQuote;
	}

	public WebElement getCloseButton() {
		return CloseButton;
	}

	public WebElement getRadioButton() {
		return RadioButton;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getGenderMale() {
		return GenderMale;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getDay() {
		return Day;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getConfirmAddressButton() {
		return ConfirmAddressButton;
	}

	public WebElement getMailAddress() {
		return MailAddress;
	}
	
	
	
	
	
	
	
	
	
}
