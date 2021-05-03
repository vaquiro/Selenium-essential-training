import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {

		// Se utilizan para esperar que cargue una página, para esperar que una acción
		// termine o que aparezca un componente
		// Se da por la velocidad de los browser drivers, velocidad de la conexión,
		// paginas lentas para cargar

		// Implícitas
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1583473\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Explicitas
		// Sintaxis
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement autoComplete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("")));

		driver.close();
	}

}
