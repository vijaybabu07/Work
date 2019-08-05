package pack1;

import java.io.FileOutputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class FrameLinksExcel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.switchTo().frame("packageListFrame").findElements(By.tagName("a"));
		System.out.println("No of links:" + links.size());

		FileOutputStream f = new FileOutputStream("E:\\Sel\\Work\\WDProject\\src\\Output7.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f);
		WritableSheet ws = wb.createSheet("res", 1);

		for (int i = 0; i < links.size(); i++) {
			// for (int r = 0; r < links.size(); r++) {
			String ln = links.get(i).getText();
			Label l = new Label(0, i, ln);
			System.out.println(ln);
			ws.addCell(l);
			// }
		}
		wb.write();
		wb.close();

	}

}
