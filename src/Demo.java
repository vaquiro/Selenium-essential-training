import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		// Se le dice la ruta del driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1583473\\Documents\\chromedriver.exe");

		// Se crea el objeto driver del navegador Chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.findElement(By.id("ybar-sbq")).sendKeys("Valentina");
		driver.findElement(By.id("ybar-search")).click();	

		driver.close();
		driver.quit();
	}

}
