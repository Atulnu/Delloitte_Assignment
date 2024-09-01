package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement txtuserName;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txtpassword;

	@FindBy(xpath = "//input[@value='Log In']")
	WebElement btnLogin;

	@FindBy(xpath = "//h2[contains(text(),'Account Services')]")
	WebElement loginConfirmation;

//	public void enterUsername(String uname) 
//	{
//		txtuserName.clear();
//		txtuserName.sendKeys(uname);
//	}
//	
//	public void enterPassword(String pwd)
//	{
//		txtpassword.clear();
//		txtpassword.sendKeys(pwd);
//	}
//	
//	public void clickOnLogin()
//	{
//		btnLogin.click();
//	}

	public void login(String un, String pwd) {
		txtuserName.clear();
		txtuserName.sendKeys(un);
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
		btnLogin.click();

	}

	public String getLoginConfirmationMsg() {
		try {
			return (loginConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
