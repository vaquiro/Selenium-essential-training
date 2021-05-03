import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ConfirmationPage;
import pages.FormPage;

public class CleanForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1583473\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");

		FormPage form = new FormPage();
		form.form(driver);
		ConfirmationPage confirmation = new ConfirmationPage();
		confirmation.waitForAlert(driver);
		confirmation.getAlertText(driver);

		assertEquals("The form was successfully submitted!", confirmation.getAlertText(driver));

		driver.close();
	}

}
