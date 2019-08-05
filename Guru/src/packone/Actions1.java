package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actions1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.virtuosoft.eu/code/bootstrap-dropdown-hover/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("dropdownMenu1"));
		Actions a=new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.moveToElement(e).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
	}
}
