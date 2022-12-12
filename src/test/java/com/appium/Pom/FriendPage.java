package com.appium.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FriendPage {
	WebDriver idriver;
	public FriendPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//android.view.View[@index='0' and @bounds='[380,767][532,820]']")
	WebElement Accept;
	
	@FindBy(xpath="//android.view.View[@index='0' and @bounds='[798,1062][921,1115]']")
	WebElement Delete;
	
	public void ClickAccept() {
		Accept.click();
	}
	
	public void ClickDelete() {
		Delete.click();
	}

}
