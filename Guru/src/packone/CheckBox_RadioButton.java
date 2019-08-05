package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		List<WebElement> r = driver.findElements(By.xpath("//*[starts-with(@id,'vfb-7-')]"));
		WebElement radio1 = driver.findElement(By.id("vfb-7-2"));
		radio1.click();
		System.out.println("selected option 2 ");
		boolean rcheck = driver.findElement(By.id("vfb-7-2")).isSelected();
		if (rcheck == true)
			System.out.println("option 2 is selected");
		else
			System.out.println("option 2 is not selected");
		/*
		 * System.out.println("Radio buttons count:"+r.size()); for(int
		 * i=0;i<r.size();i++) { if (i==2) //option 3 will be clicked {
		 * r.get(i).click(); } }
		 */
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		for (int i = 0; i < 4; i++) {
			chkFBPersist.click();
			System.out.println("FB checkbook status is " + chkFBPersist.isSelected());
		}

	}

}
