package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='customer.firstName']")
	WebElement textFName;
	
	@FindBy(xpath="//input[@id='customer.lastName']")
	WebElement textLName ;
	
	@FindBy(xpath="//input[@id='customer.address.street']")
	WebElement txtStreet ;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	WebElement txtCity;
	
	@FindBy(xpath="//input[@id='customer.address.state']")
	WebElement txtState;
	
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	WebElement txtZipcode;
	
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	WebElement txtphoneNumber;
	
	@FindBy(xpath="//input[@id='customer.ssn']")
	WebElement txtSsn;
	
	@FindBy(xpath="//input[@id='customer.username']")
	WebElement txtuserName;
	
	@FindBy(xpath="//input[@id='customer.password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='repeatedPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement btnRegister;
	
	@FindBy(xpath="//p[contains(text(),'Your account was created successfully. You are now')]")
	WebElement msgConfirmation;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	WebElement btnLogout;
	
	
	
	
	public void setFName(String fname)
	{
		textFName.sendKeys(fname);
	}
	
	public void seLName(String lname)
	{
		textLName.sendKeys(lname);
	}
	
	public void setStreet(String street)
	{
		txtStreet.sendKeys(street);
	}
	
	public void setCity(String city)
	{ 
		txtCity.sendKeys(city);
	}
	
	public void setState(String state)
	{
		txtState.sendKeys(state);
	}
	
	public void setZipcode(String zipcode)
	{
		txtZipcode.sendKeys(zipcode);
	}
	
	public void setphoneNumber(String phone)
	{
		txtphoneNumber.sendKeys(phone);
	}
	
	public void setSsn(String ssn)
	{
		txtSsn.sendKeys(ssn);
	}
	
	public void setUserName(String uname)
	{
		txtuserName.sendKeys(uname);
	}
	
	public void setPassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String password)
	{
		confirmPassword.sendKeys(password);
	}
	
	public void clickOnRegister()
	{
		btnRegister.click();
	}
	

	
	public String getConfirmationMsg()
	{
		try {
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	public void clickOnLogout()
	{
		btnLogout.click();
	}
	
//	public void setFirstName(String fname)
//	{
//		fName.sendKeys(fname);
//	}
//	
//	public void setFirstName(String fname)
//	{
//		fName.sendKeys(fname);
//	}
//	
//	public void setFirstName(String fname)
//	{
//		fName.sendKeys(fname);
//	}
//	
//	public void setFirstName(String fname)
//	{
//		fName.sendKeys(fname);
//	}
//	
//	public void setFirstName(String fname)
//	{
//		fName.sendKeys(fname);
//	}
//	
//	public void setFirstName(String fname)
//	{
//		fName.sendKeys(fname);
//	}
//	
//	public void setFirstName(String fname)
//	{
//		fName.sendKeys(fname);
	
	

	
	

}
