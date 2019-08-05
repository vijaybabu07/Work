package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select c = new Select(country);
		c.selectByVisibleText("ARUBA");
		Thread.sleep(2000);
		// Selecting Items in a Multiple SELECT elements
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select f = new Select(fruits);
		boolean fm = f.isMultiple(); // returns TRUE if the drop-down element
										// allows multiple selection at a time;
										// FALSE if otherwise
		System.out.println(fm);
		f.selectByIndex(1);
		f.selectByVisibleText("Banana");
		f.deselectByVisibleText("Apple");
		Thread.sleep(2000);
		f.deselectAll();

	}

}
