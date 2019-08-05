package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_RowCellData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> rows_inneed=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("Printing Rows Data:");
		System.out.println("===================================");
		for(int i=0;i<rows_inneed.size();i++)
		{
			System.out.println(rows_inneed.get(i).getText());
		}
		System.out.println("===================================");
		System.out.println("Printing cell data of DCB");
		for(int i=1;i<=rows_inneed.size();i++)
		{
			WebElement compname=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]/a"));
			//System.out.println(compname.getText());
			if(compname.getText().equals("DCB Bank")==true)
			{
				//printing particular cell data 
				System.out.println(driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td[3]")).getText());
			}
						
		}
		/*WebElement col=driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]/td[3]"));
		System.out.println(col.getText());*/
		//to find max value from Current Price column
		double temp=0,maxi=0;
		for(int i=1;i<=rows_inneed.size();i++)
		{
			String s=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[4]")).getText();
			maxi=Double.parseDouble(s);
			if(maxi>temp)
			{
				temp=maxi;
				
			}
			
		}
		System.out.println("max value:"+temp);
	}

}
