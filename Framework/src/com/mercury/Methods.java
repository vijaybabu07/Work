package com.mercury;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Methods {
	public WebDriver driver;
	FileInputStream f;
	public Workbook wb;
	public Sheet s;
	
	public void launch_app(String url)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Framework\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void close_app()
	{
		driver.close();
	}
	
	public void elementPresent(WebElement element, boolean exp)
	{
		boolean a=element.isDisplayed();
		if(a==exp)
		{
			System.out.println("Pass: element is present");
		}
		else
		{
			System.out.println("Fail: element is not present");
		}
	}
	public void elementEnabled(WebElement element, boolean exp)
	{
		boolean a=element.isEnabled();
		if(a==exp)
		{
			System.out.println("Pass: element is enabled");
		}
		else
		{
			System.out.println("Fail: element is not enabled");
		}
	}
	public void elementsCount(String loc, int exp)
	{
		List<WebElement> count=driver.findElements(By.tagName(loc));
		//System.out.println("elements count:"+count.size());
		if(count.size()==exp)
		{
			System.out.println("Pass: Actual elements count:"+count.size()+" is equal to expected count:"+exp);			
		}
		else
		{
			System.out.println("Pass: Actual elements count:"+count.size()+" is not equal to expected count:"+exp);			
		}
	}
	public void titleContains(String exp)
	{
		String title=driver.getTitle();
		boolean a=title.contains(exp);
		if(a==true)
		{
			System.out.println("Title: "+title+" contains "+exp);
		}
		else
		{
			System.out.println("Title: "+title+" does not contains "+exp);
		}
	}
	public void excelcon(String sname) throws Exception
	{
		f=new FileInputStream("E:\\Sel\\Work\\Framework\\src\\data.xls");
		wb=Workbook.getWorkbook(f);
		s=wb.getSheet(sname);
	}
}
