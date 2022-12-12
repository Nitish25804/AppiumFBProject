package com.appium.Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.appium.Pom.ChatPage;
import com.appium.Pom.HomePage;
import com.appium.Pom.LandingPage;
import com.appium.Utility.BaseSetup;
@Listeners(com.appium.Utility.ExtentListinerClass.class)
public class SecondTestSendMessege extends BaseSetup{
	
	@Test
	public void Test2() {
		LandingPage lp=new LandingPage(driver);
		lp.EnterEmail("nitis625@gmail.com");
		Log.info("Email Entered....");
		lp.EnterPass("nitish159");
		Log.info("PassWord Entered....");
		lp.ClickEnter();
		Log.info("Click Submit....");
		lp.ClickDeny();
		Log.info("Click Deny....");
		HomePage hp=new HomePage(driver);
		hp.ClickChat();
		Log.info("Chat Button Clicked....");
		ChatPage cp =new ChatPage(driver);
		cp.ClickFriend();
		Log.info("Friend Selected....");
		cp.TypeMessege("Hii");
		Log.info("Messege Typed....");
		cp.SendMessage();
		Log.info("Messege Sent....");
	}

}
