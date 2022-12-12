package com.appium.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver idriver;
	public HomePage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//android.view.View[@index='0' and @bounds='[415,286][485,402]']")
	WebElement Chat;
	
	@FindBy(xpath="//android.view.View[@index='0' and @bounds='[595,286][665,402]']")
	WebElement Notification;
	
	@FindBy(xpath="//android.view.View[@index='0' and @bounds='[235,281][305,397]']")
	WebElement Request;
	
	@FindBy(xpath="//android.view.View[@index='0' and @bounds='[55,281][125,397]']")
	WebElement Home;
	@FindBy(xpath="//android.view.View[@index='2' and @bounds='[941,421][1063,554]']")
    WebElement Photo;
	@FindBy(xpath="//android.view.View[@index='0' and @bounds='[354,1013][607,1053]']")
	WebElement Status;
	
	public void ClickChat() {
		Chat.click();
	}
	public void ClickRequest() {
		Request.click();
	}
	public void ClickNotification() {
		Notification.click();
	}
	public void ClickHome() {
		Home.click();
	}
	public void ClickPhoto() {
		Photo.click();
	}
	public void ClickStatus() {
		Status.click();
	}

}
