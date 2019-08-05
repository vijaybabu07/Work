package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReusableMethods1 {
	public WebDriver driver;
	public void applaunch(String url)
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		driver=new FirefoxDriver();
		/*System.setProperty("webdriver.ie.driver", "E:\\Sel\\Jars\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();*/
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("login-form:signup")).click();		
	}
	public void element_present(String loc, boolean exp)
	{
		boolean actual=driver.findElement(By.id(loc)).isEnabled();
		if(actual==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");			
	}
	public void links_count(String loc, int exp)
	{
		List<WebElement> links=driver.findElements(By.tagName(loc));
		int nol=links.size();
		System.out.println("Number of links: "+nol);
		if(nol==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	public void app_title_length(int exp)
	{
		String t=driver.getTitle();
		System.out.println("app title: "+t);
		int tl=t.length();
		System.out.println("title length: "+tl);
		if(tl==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");		
	}
	public void url_contains(String s)
	{
		String u=driver.getCurrentUrl();
		System.out.println(u);
		if(u.contains(s))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	public void title_startswith(String exp)
	{
		String t=driver.getTitle();
		if(t.startsWith(exp))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}
