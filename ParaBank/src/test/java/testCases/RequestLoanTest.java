package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.RequestLoan;
import testBase.BaseClass;
import utilities.excelUtility;

public class RequestLoanTest extends BaseClass {

	public WebDriver driver;

	@Test(dataProvider = "loanData")
	public void reqLoan(String amt, String pay) {
		LoginPage lp = new LoginPage(driver);
		lp.login(p.getProperty("username"), p.getProperty("password"));

		RequestLoan loan = new RequestLoan(driver);
		loan.goToLoanMenu();
		loan.amount(amt);
		loan.downPayment(pay);
		loan.ApplyNow();
		loan.statusApproved();
	}

	@DataProvider(name = "loanData")
	public Object[][] supplyLoanData() {
		Object data[][] = excelUtility.getTestDataFromExcel("RequestLoan");
		return data;
	}

}
