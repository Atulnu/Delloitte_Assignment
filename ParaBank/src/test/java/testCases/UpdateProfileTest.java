package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.UpdateProfilePage;
import testBase.BaseClass;

public class UpdateProfileTest extends BaseClass {

	public WebDriver driver;
	// LoginPage lp=new LoginPage(driver);

	@Test
	public void update_Profile() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.login(p.getProperty("username"), p.getProperty("password"));

		UpdateProfilePage prfl = new UpdateProfilePage(driver);
		prfl.clickOnUpdateContactInfo();
		prfl.clickOnUpdateProfile();

	}

}
