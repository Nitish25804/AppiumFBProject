package com.appium.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver idriver;
	public LandingPage(WebDriver rdriver) {
		idriver=rdriver;           
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//android.widget.MultiAutoCompleteTextView[@index='2']")
	WebElement login;
	
	@FindBy(xpath="//android.widget.MultiAutoCompleteTextView[@index='4']")
	WebElement Pass;
	
	@FindBy(xpath="//android.view.ViewGroup[@index='5']")
	WebElement Submit;
	
	@FindBy(xpath="//android.view.ViewGroup[@index='4']")
	WebElement Deny;
	
	public void EnterEmail(String email) {
		login.clear();
		login.sendKeys(email);
	}
	public void EnterPass(String pass) {
		Pass.clear();
		Pass.sendKeys(pass);
	}
	public void ClickEnter() {
		Submit.click();
	}
	public void ClickDeny() {
		Deny.click();
	}

}
