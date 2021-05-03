import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1583473\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/datepicker");

		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.sendKeys("02/02/2022");
		dateField.sendKeys(Keys.RETURN);

		driver.close();
		driver.quit();
	}

}
