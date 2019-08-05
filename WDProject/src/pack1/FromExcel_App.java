package pack1;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class FromExcel_App {

	public static void main(String[] args) throws Exception{
		FileInputStream f=new FileInputStream("E:\\Sel\\Work\\WDProject\\src\\Details.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet1");
		String url=s.getCell(0, 0).getContents();
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		String uid=s.getCell("B2").getContents();
		String uname=s.getCell(2, 1).getContents();
		driver.findElement(By.id(uid)).sendKeys(uname);
		
		String pid=s.getCell(1,2).getContents();
		String pass=s.getCell(2,2).getContents();
		driver.findElement(By.id(pid)).sendKeys(pass);
		
		

	}

}
