package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class XPath_Abs_Relative {
	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div/div/div[3]/p/a[2]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("vj123");
		driver.findElement(By.xpath("//*[starts-with(@name,'passwd')]")).sendKeys("abcde");
		driver.findElement(By.xpath("//*[@type='password' and contains(@name,'confirm')]")).sendKeys("abcde");
		driver.findElement(By.xpath("//*[starts-with(@name,'altemail')]")).sendKeys("vj@xyz.com");
		driver.findElement(By.xpath("//*[@id='lbl_txt']")).click();
		Thread.sleep(1000);
		List<WebElement> country_lists=driver.findElements(By.xpath("//div[@id='country_id']/ul//li"));
		int noc=country_lists.size();
		//System.out.println(noc);
		String a;
		for(int i=0;i<noc;i++)
		{
			a=country_lists.get(i).getText();
			//System.out.println(a);
			if(a.equals("China (+86)"))
				country_lists.get(i).click();
		}
		/*for(WebElement country : country_lists){
			if(country.getText().equals("USA / Canada (+1)")){
				country.click();
			}
		}*/			
		driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")).sendKeys("19");
		driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")).sendKeys("AUG");
		driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")).sendKeys("1998");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'gender') and @value='f']")).click();
		driver.findElement(By.xpath("//select[contains(@name,'country') and @id='country']")).sendKeys("Cuba");
				
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//input[@id='Register']")).click();

	}

}
