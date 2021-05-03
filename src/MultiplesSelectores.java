import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplesSelectores {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1583473\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// CSSSELECTOR -> Se usa cuando una etiqueta en el xml tiene el mismo id, clase
		// y name
		// Ej: <input id = "q" class = "q" name = "q">
		driver.findElement(By.cssSelector("#q")); // para el ID
		driver.findElement(By.cssSelector(".q")); // para la clase
		driver.findElement(By.cssSelector("input[name='q']")); // para el name

		// Etiqueta(tag) and clase. Ejemplo <input class = "q" type = "text">
		driver.findElement(By.cssSelector("input.q"));
		// Etiqueta(tag) and ID. Ejemplo <input id = "q" type = "text">
		driver.findElement(By.cssSelector("input#q"));
		// Etiqueta(tag) and attribute. Ejemplo <input type = "radio" value = "radio
		// button">
		driver.findElement(By.cssSelector("input[type='radio']"));
		driver.findElement(By.cssSelector("input[type='radio button']"));
		// Multiples clases. Ejemplo <input type = "radio" value = "radio button">
		driver.findElement(By.cssSelector("input[type='radio.button.button.btn']"));

		// Prefijo de palabra Ejemplo <div id="textField_randomId">
		driver.findElement(By.cssSelector("dib[id^='textField']"));

		// Sufijo de palabra Ejemplo <div id="randomId_textField">
		driver.findElement(By.cssSelector("dib[id$='textField']"));

		// Substring de palabra Ejemplo <div id="123_textField_randomId">
		driver.findElement(By.cssSelector("dib[id*='textField']"));

	}

}
