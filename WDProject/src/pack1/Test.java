package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Sel\\Jars\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver ();
		FirefoxDriver f=new FirefoxDriver ();
		//WebDriver driver=f;
		f.get("http://google.com");
		f.manage().window().maximize();
		f.close();
	}

}
