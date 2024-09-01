package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestLoan extends BasePage {

	public RequestLoan(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='Request Loan']")
	WebElement menuReqLoan;

	@FindBy(xpath = "//input[@id='amount']")
	WebElement amount;

	@FindBy(xpath = "//input[@id='downPayment']")
	WebElement downPayment;

	@FindBy(xpath = "//input[@value='Apply Now']")
	WebElement btnApplyNow;

	@FindBy(xpath = "//td[text()='Approved']")
	WebElement statusApproved;

	@FindBy(xpath = "//td[text()='Denied']")
	WebElement statusDenied;

	public void goToLoanMenu() {
		menuReqLoan.click();
	}

	public void amount(String amt) {
		amount.sendKeys(amt);

	}

	public void downPayment(String pay) {
		downPayment.sendKeys(pay);

	}

	public void ApplyNow() {
		btnApplyNow.click();

	}

	public boolean statusApproved() {
		boolean status = statusApproved.isDisplayed();
		return status;

	}

	public boolean statusDenied() {
		boolean status = statusDenied.isDisplayed();
		return status;

	}

//	public void downPayment(String pay)
//	{
//		downPayment.sendKeys(pay);
//		
//	}
//	
//	public void downPayment(String pay)
//	{
//		downPayment.sendKeys(pay);
//		
//	}

}
