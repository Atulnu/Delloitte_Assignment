package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.NewAccountPage;
import testBase.BaseClass;

public class NewAccountTest extends BaseClass {

	public WebDriver driver;

	@Test(priority = 1)
	public void newAcc() throws InterruptedException

	{
		LoginPage lp = new LoginPage(driver);
		lp.login(p.getProperty("username"), p.getProperty("password"));
		NewAccountPage nw = new NewAccountPage(driver);
		nw.openNewAcc();
		Thread.sleep(10);

	}

	@Test(priority = 2, dependsOnMethods = "newAcc")
	public void newAccOpenedConfirmation() {
		NewAccountPage nw = new NewAccountPage(driver);
		String msg = nw.accOpenConfimation();
		// Assert.assertEquals(msg, "Account Opened!");
		System.out.println(msg);
	}
}
