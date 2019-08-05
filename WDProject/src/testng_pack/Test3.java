package testng_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver;
	String baseurl = "http://demo.guru99.com/test/newtours/";

	@Test
	public void flight_click() {
		driver.findElement(By
				.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"))
				.click();
		String expected = "Find a Flight: Mercury Tours:3";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}


	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();

	}

}
