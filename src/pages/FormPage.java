package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
	public void form(WebDriver driver) {
		driver.findElement(By.id("first-name")).sendKeys("Val");
		driver.findElement(By.id("last-name")).sendKeys("Le");
		driver.findElement(By.id("job-title")).sendKeys("QA");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.cssSelector("option[value='1']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("01/01/1997");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

	}

}
