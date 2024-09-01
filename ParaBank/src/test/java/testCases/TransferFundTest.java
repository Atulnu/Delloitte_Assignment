package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.TransferFund;
import testBase.BaseClass;

public class TransferFundTest extends BaseClass {

	public WebDriver driver;

	@Test()
	public void reqLoan() {
		LoginPage lp = new LoginPage(driver);
		lp.login(p.getProperty("username"), p.getProperty("password"));
		// lp.login("280", "2808");

		TransferFund trnsfr = new TransferFund(driver);
		trnsfr.transferAmt("50");

	}

//	@DataProvider(name = "Funds")
//	public Object[][] supplyTransferData() {
//		Object data[][] = excelUtility.getTestDataFromExcel("TransferFundAmt");
//		return data;
	// }

}
