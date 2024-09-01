package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferFund extends BasePage {

	public TransferFund(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='Transfer Funds']")
	WebElement menuTransfer;

	@FindBy(xpath = "//input[@id='amount']")
	WebElement amtTransfer;

	@FindBy(xpath = "//input[@value='Transfer']")
	WebElement btnTransfer;

//	@FindBy(xpath="//a[text()='Transfer Funds']")
//	WebElement menuTransfer;

	public void transferAmt(String amt) {
		menuTransfer.click();
		amtTransfer.sendKeys(amt);
		btnTransfer.click();
	}

}
