import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class SauceLabsExample {
	public static final String USERNAME = "oauth-vquirozh97-18d8e";
	public static final String ACCESS_KEY = "100fe88f-9d04-4265-bbc6-a9e896dde836";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY
			+ "@ondemand.us-west-1.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		cap.setCapability("platform", "");
		cap.setCapability("version", "");

		WebDriver driver = new RemoteWebDriver(new URL(URL), cap);

		driver.get("https://formy-project.herokuapp.com");
	}
}
