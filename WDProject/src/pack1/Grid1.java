package pack1;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid1 {

	public static void main(String[] args) throws Exception {
		DesiredCapabilities d = new DesiredCapabilities();
		d.setCapability("os", "OS X");
		d.setCapability("os_version", "Mojave");
		d.setCapability("browser", "Safari");
		d.setCapability("browser_version", "12.1");
		d.setCapability("browserstack.debug", true);

		URL u = new URL("https://vijaybabu4:bRtj6YCSyikpL13QVHX8@hub-cloud.browserstack.com/wd/hub");
		RemoteWebDriver r = new RemoteWebDriver(u, d);
		WebDriver driver = r;
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
