package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Submit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		WebElement uid=driver.findElement(By.id("email"));
		WebElement pwd=driver.findElement(By.id("passwd"));
		uid.sendKeys("abc@xyz.com");
		pwd.sendKeys("abcdef");
		System.out.println("entered email:"+uid.getText());
		System.out.println("entered password:"+pwd.getText());
		uid.clear();
		pwd.clear();
		System.out.println("Cleared text");
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println("clicked submit");
		
		//using submit
		driver.navigate().back();
		//driver.get("http://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");							
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");							
        driver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Login Done with Submit");	
	}

}
