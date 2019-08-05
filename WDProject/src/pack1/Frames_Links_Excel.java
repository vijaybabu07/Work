package pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Frames_Links_Excel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		System.out.println("No of frames:"+frames.size());
		FileOutputStream fo=new FileOutputStream("E:\\Sel\\Work\\WDProject\\src\\Output4.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet wws=wwb.createSheet("Links",1);
		
		for(int i=0;i<frames.size();i++)
		{
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			System.out.println("No of Links:"+links.size());
			for(int j=0;j<links.size();j++)
			{
				//System.out.println(links.get(j).getText());
				
				/*for(int r=0;r<links.size();r++)
				{*/
					String l1=links.get(j).getText();
					Label l=new Label(0,j,l1);
					wws.addCell(l);
				//}
			}
			System.out.println("===================================");
			driver.switchTo().parentFrame();
		}
		wwb.write();
		wwb.close();
	}
}
