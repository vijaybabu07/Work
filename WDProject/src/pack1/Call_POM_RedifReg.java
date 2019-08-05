package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Call_POM_RedifReg {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();

		POM_RedifReg p = PageFactory.initElements(driver, POM_RedifReg.class);
		p.name.sendKeys("vija");
		p.id.sendKeys("vj@xuz.com");
		p.gender.click();
		Select c = new Select(p.country);
		c.selectByVisibleText("Peru");
		// p.country.sendKeys("Aruba");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.reg.click();
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
	}
}
