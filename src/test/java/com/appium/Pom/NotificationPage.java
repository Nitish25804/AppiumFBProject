package com.appium.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationPage {
	
	WebDriver idriver;
	public NotificationPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//android.view.View[@index='0' and @bounds='[184,900][913,1006]']")
	WebElement SelectNotification;
	
	public void ClickNotification() {
		SelectNotification.click();
	}

}
