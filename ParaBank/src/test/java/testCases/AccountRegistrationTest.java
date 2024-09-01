package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.excelUtility;

public class AccountRegistrationTest extends BaseClass {

	// public WebDriver driver;

	@Test(priority = 1, dataProvider = "RegistrationData")
	public void verify_account_regirstation(String fName, String lName, String street, String state, String city,
			String zipcode, String phnNo, String ssn, String username, String password, String cpassword)
			throws InterruptedException {

		logger.info("****** REGISTRATION FUNCTIONALITY *********");
		HomePage hp = new HomePage(driver);
		hp.clickRegisterAcc();

		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		regpage.clickOnRegister();
//		regpage.setFName("Atul");
//		regpage.seLName("Thakur");
//		regpage.setStreet("176");
//		regpage.setState("Delhi");
//		regpage.setCity("New Delhi");
//		regpage.setZipcode("22");
//		regpage.setphoneNumber("3423764234");
//		regpage.setSsn("77");
//		regpage.setUserName("vy110");
//		regpage.setPassword("vy1");
//		// Thread.sleep(5);
//		regpage.setConfirmPassword("vy1");
//		regpage.clickOnRegister();

		regpage.clickOnRegister();
		regpage.setFName(fName);
		regpage.seLName(lName);
		regpage.setStreet(street);
		regpage.setState(state);
		regpage.setCity(city);
		regpage.setZipcode(zipcode);
		regpage.setphoneNumber(phnNo);
		regpage.setSsn(ssn);
		regpage.setUserName(username);
		regpage.setPassword(password);
		regpage.setConfirmPassword(cpassword);
		regpage.clickOnRegister();

		String msg = regpage.getConfirmationMsg();
		System.out.println(msg);
		Assert.assertEquals(msg, "Your account was created successfully. You are now logged in.");

		regpage.clickOnLogout();

	}

	@DataProvider(name = "RegistrationData")
	public Object[][] supplyRegData() {
		Object data[][] = excelUtility.getTestDataFromExcel("AccountRegistration");
		return data;

	}

//	@Test
//	public void verifyNewUserLoginFn()
//	{
//		LoginPage lp=new LoginPage(driver);
//		
//	}
}
