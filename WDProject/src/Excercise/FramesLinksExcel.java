package Excercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class FramesLinksExcel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[contains(@href,'awt/package-frame')]")).click();
		//driver.switchTo().frame("packageListFrame").findElement(By.xpath("//a[@href='java/io/package-frame.html']")).click();
		driver.switchTo().frame("packageListFrame").findElement(By.xpath("//a[contains(@href,'java/io/package-frame')]")).click();
		driver.switchTo().parentFrame();
		List<WebElement> links=driver.switchTo().frame("packageFrame").findElements(By.tagName("a"));
		System.out.println("Links count:"+links.size());
		FileOutputStream fout=new FileOutputStream("E:\\Sel\\Work\\WDProject\\src\\Output2.xls");
		WritableWorkbook wb=Workbook.createWorkbook(fout);
		WritableSheet ws=wb.createSheet("Frames", 1);
		for(int i=0;i<links.size();i++)
		{
			String lnames=links.get(i).getText();
			Label l=new Label(0, i, lnames);
			ws.addCell(l);
			System.out.println(lnames);
		}
		wb.write();
		wb.close();
		

	}

}
