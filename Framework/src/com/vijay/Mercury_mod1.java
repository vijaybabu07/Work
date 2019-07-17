package com.vijay;

import org.openqa.selenium.support.PageFactory;

import com.mercury.Methods;
import com.mercury.PO_HomePage;
import com.mercury.PO_login;

public class Mercury_mod1 {
	public Methods m;
	public void mercury_homepage() throws Exception
	{
		m=new Methods();
		m.excelcon("Sheet1");
		m.launch_app(m.s.getCell(0, 0).getContents());
		PO_login loginpage=PageFactory.initElements(m.driver, PO_login.class);
		m.elementPresent(loginpage.uid,true);
		m.elementPresent(loginpage.pwd, true);
		m.elementEnabled(loginpage.uid, true);
		m.elementEnabled(loginpage.pwd, true);
		loginpage.uid.sendKeys(m.s.getCell(0, 1).getContents());
		loginpage.pwd.sendKeys(m.s.getCell(0, 2).getContents());
		loginpage.siginbutton.click();
		PO_HomePage homepage=PageFactory.initElements(m.driver, PO_HomePage.class);
		m.elementPresent(homepage.submitbutton, true);
		m.elementEnabled(homepage.submitbutton, true);
		m.elementsCount("a", 6);
		m.titleContains("Sign");
		m.close_app();
	}
}
