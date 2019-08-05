package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-form:signup")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int nol = links.size();
		System.out.println("Number of Links: " + nol);
		String lname, url;
		for (int i = 0; i < nol; i++) {
			lname = links.get(i).getText();
			url = links.get(i).getAttribute("href");
			if (lname.contains("Home") == true)
				System.out.println(lname + "  - " + url);
		}
		// To count number of dropdowns and print them
		List<WebElement> dropdown = driver.findElements(By.tagName("select"));
		int nod = dropdown.size();
		System.out.println("Number of dropdowns: " + nod);
		String dname;
		for (int i = 0; i < nod; i++) {
			dname = dropdown.get(i).getAttribute("name");
			if (dname.contains("state") == true)
				System.out.println(dname);
		}
		// To count number of textboxes and print them
		List<WebElement> tbox = driver.findElements(By.tagName("input"));
		int notb = tbox.size();
		System.out.println("Number of text boxes: " + notb);
		String tbname;
		for (int i = 0; i < notb; i++) {
			tbname = tbox.get(i).getAttribute("name");
			if (tbname.startsWith("B") == true)
				System.out.println(tbname);
		}
		// To count number of images
		List<WebElement> imgs = driver.findElements(By.tagName("img"));
		int noi = imgs.size();
		System.out.println("Number of images: " + noi);
		/*
		 * driver.get("http://google.com");
		 * driver.navigate().to("http://yahoo.com"); driver.quit();
		 */
	}
}
