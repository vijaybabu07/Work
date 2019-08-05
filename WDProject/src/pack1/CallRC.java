package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallRC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-form:signup")).click();
		driver.findElement(By.id("signup:fname")).sendKeys("vijay");
		//WebDriverBackedSelenium o=new WebDriverBackedSelenium();
	}

}
