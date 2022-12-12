package com.appium.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPage {
	
	WebDriver idriver;
	public NewPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="")
	WebElement as;
	
	public void ClickSwitch() {
		as.click();
	}

}
