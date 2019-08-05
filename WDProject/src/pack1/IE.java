package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='login-form:signup']")).click();
		
		WebElement sbutton=driver.findElement(By.id("login-form:signup"));
		sbutton.click();
		//Thread.sleep(200);
		driver.findElement(By.id("signup:fname")).sendKeys("vijay");
		driver.findElement(By.id("signup:lname")).sendKeys("Babu");
		driver.findElement(By.id("BirthDate")).sendKeys("12/06/2012");
		driver.findElement(By.id("signup:state")).sendKeys("Arizona");
		driver.findElement(By.id("signup:signup")).click();	
	}
}
