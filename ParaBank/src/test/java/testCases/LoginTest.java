package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass {

	public WebDriver driver;

	@Test
	public void verify_login() throws InterruptedException {
		logger.info("****** LOGIN FUNCTIONALITY *********");
		LoginPage lp = new LoginPage(driver);
		lp.login(p.getProperty("username"), p.getProperty("password"));

		String msgLogin = lp.getLoginConfirmationMsg();
		System.out.println(msgLogin);
		Assert.assertEquals(msgLogin, "Account Services");

		// regpage.clickOnLogout();
	}

}
