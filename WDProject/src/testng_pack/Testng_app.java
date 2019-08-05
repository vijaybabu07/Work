package testng_pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testng_app {
	WebDriver driver;
	String baseurl = "http://demo.guru99.com/test/newtours/";

	@Test(priority = 2)
	public void reg_click() {
		driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		String expected = "Register: Mercury Tours";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 3)
	public void signon_click() {
		driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		String expected = "Sign-on: Mercury Tours";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
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
		String expected = "Welcome: Mercury Tours";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@AfterMethod
	public void afterMethod() {
		// driver.navigate().back();
		driver.findElement(By
				.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"))
				.click();

	}

	@BeforeTest
	public void launch_app() {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}

	@AfterTest
	public void close_app() {
		driver.close();
	}

}
