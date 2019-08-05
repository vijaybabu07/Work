package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		driver.switchTo().frame("packageListFrame").findElement(By.xpath("//a[@href='java/awt/package-frame.html']"))
				.click();
		// driver.navigate().back();
		driver.switchTo().parentFrame();
		WebElement f2 = driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(f2).findElement(By.xpath("//*[@href='Stroke.html']")).click();
		// driver.switchTo().frame(f2).findElement(By.xpath("//*[@href='java/util/AbstractList.html']")).click();

	}

}
