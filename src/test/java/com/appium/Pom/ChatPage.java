package com.appium.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {
	WebDriver idriver;
	public ChatPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//android.view.View[@index='1' and @bounds='[171,697][1051,824]']")
	WebElement Friend;
	
	@FindBy(xpath="//android.widget.MultiAutoCompleteTextView[@index='3']")
	WebElement TypeMessege;
	
	@FindBy(xpath="//android.view.View[@index='5']")
	WebElement SentMessage;
	
	public void ClickFriend() {
		Friend.click();
	}
	
	public void TypeMessege(String Messege) {
		TypeMessege.sendKeys(Messege);
	}
	
	public void SendMessage() {
		SentMessage.click();
	}

}
