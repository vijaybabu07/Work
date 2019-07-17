package com.mercury;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_login {
	public @FindBy(xpath="//input[@name='userName']") WebElement uid;
	public @FindBy(xpath="//input[@name='password']") WebElement pwd;
	public @FindBy(xpath="//input[@name='login']") WebElement siginbutton;

}
