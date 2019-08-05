package pack1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div[2]/div/div/div/div/p[4]/button")).click();
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div[2]/div/div/div/div/p[5]/button")).click();
		ArrayList a = new ArrayList(driver.getWindowHandles());
		System.out.println("Window sessions:");
		for (int i = 0; i < a.size(); i++) {
			//closing alternate windows
			if (i % 2 != 0) {   	
				System.out.println(a.get(i));
				String title = driver.switchTo().window((String) a.get(i)).getTitle();
				System.out.println("Window "+i+" Title: "+title);
				System.out.println("window " + i + " is closed");
				driver.switchTo().window((String) a.get(i)).close();
			}
		}
		System.out.println("===========================================");

	}

}
