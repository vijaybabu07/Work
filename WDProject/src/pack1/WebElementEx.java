package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("login-form:email")).sendKeys("vijay");
		driver.findElement(By.id("login-form:email")).clear();
		driver.findElement(By.id("login-form:email")).sendKeys("babu");
		driver.findElement(By.id("login-form:email")).clear();
		driver.findElement(By.id("login-form:email")).sendKeys("begari");*/
		WebElement email=driver.findElement(By.id("login-form:email"));
		email.sendKeys("vijay");
		email.clear();
		email.sendKeys("babu");
		email.clear();
		email.sendKeys("begari");

	}

}
