package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage extends BasePage {

	public NewAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//select[@id='type']")
	WebElement accType;

	@FindBy(xpath = "//a[text()='Open New Account']")
	WebElement menuOpenNewAcc;

	@FindBy(xpath = "//input[@value='Open New Account']")
	WebElement btnOpenNewAcc;

	@FindBy(xpath = "//h1[text()='Account Opened!']")
	WebElement accOpened;

	@FindBy(xpath = "//a[@id='newAccountId']")
	WebElement newAccId;

	public void openNewAcc() throws InterruptedException {
		Thread.sleep(3);
		menuOpenNewAcc.click();
		Thread.sleep(3);
		Select select = new Select(accType);
		Thread.sleep(3);
		select.selectByValue("1");
		Thread.sleep(3);
		btnOpenNewAcc.click();
		// return newAccId.getText();
		String accID = newAccId.getText();

	}

//	public void accOpenConfimation()
//	{
//		System.out.println(accOpened.getText());
//	}

	public String accOpenConfimation() {
		try {
			return (accOpened.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
