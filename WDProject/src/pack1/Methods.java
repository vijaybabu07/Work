package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	WebDriver driver;
	public void launchApp(String url)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Sel\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void closeApp()
	{
		
		driver.close();
		
	}

}
