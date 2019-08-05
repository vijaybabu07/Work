package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BO {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-form:signup")).click();
		driver.findElement(By.id("signup:fname")).sendKeys("vijay");
		driver.findElement(By.id("signup:lname")).sendKeys("Babu");
		driver.findElement(By.id("BirthDate")).sendKeys("12/06/2012");
		driver.findElement(By.id("signup:state")).sendKeys("Arizona");
		driver.findElement(By.id("signup:signup")).click();		

	}

}
