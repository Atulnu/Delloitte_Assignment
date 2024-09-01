package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	WebElement registerAcc;

	@FindBy(xpath = "//a[text()='Log Out']")
	WebElement logout;

	public void clickRegisterAcc() {

		registerAcc.click();
	}

	public void logout() {
		logout.click();
	}
}
