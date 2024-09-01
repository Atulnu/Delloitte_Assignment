package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class UpdateProfilePage extends BasePage {
	
	public UpdateProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[contains(text(),'Update Contact Info')]")
	WebElement updateContactInfo;
	
	@FindBy(xpath="//input[@value='Update Profile']")
	WebElement updateProfile;
	
	public void clickOnUpdateContactInfo()
	{
		updateContactInfo.click();
	}
	
	public void clickOnUpdateProfile()
	{
		updateProfile.click();
	}
	
	
	
	

}
