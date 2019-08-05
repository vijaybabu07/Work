package pack1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_RedifReg {
	@FindBy(xpath="//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input") WebElement name;
	@FindBy(xpath="//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]") WebElement id;
	@FindBy(xpath="//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]") WebElement gender;
	@FindBy(xpath="//*[@id='country']") WebElement country;
	@FindBy(xpath="//*[@id='Register']") WebElement reg;
	
	
	
	
	
	//http://register.rediff.com/register/register.php?FormName=user_details
	
	
}
