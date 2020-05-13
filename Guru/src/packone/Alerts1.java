package packone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("16545");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(1500);
		System.out.println(a.getText());
		a.accept();  //for confirming
		//a.dismiss(); //for canceling
		Thread.sleep(1500);
		System.out.println(a.getText());
		a.dismiss(); //for canceling
		driver.close();
	}

}
