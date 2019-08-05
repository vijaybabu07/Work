package testng_pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProvide {
  WebDriver driver;
  String baseurl = "http://demo.guru99.com/test/newtours/";
	@Test(dataProvider = "dp")
  public void f(String uid, String pwd) throws Exception {
		driver.findElement(By.name("userName")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(2000);
		
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


  @DataProvider(name="dp")
  public Object[][] data() {
	  Object[][] o=new Object[3][2];
	  o[0][0]="vijay"; o[0][1]="abcde";
	  o[1][0]="begari"; o[1][1]="abcdef";
	  o[2][0]="babbu"; o[2][1]="abc"; 
	  return o;
	    
    /*return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };*/
  }
}
