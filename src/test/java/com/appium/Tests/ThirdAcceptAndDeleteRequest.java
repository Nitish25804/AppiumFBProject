package com.appium.Tests;

import org.testng.annotations.Test;

import com.appium.Pom.FriendPage;
import com.appium.Pom.HomePage;
import com.appium.Pom.LandingPage;
import com.appium.Utility.BaseSetup;

public class ThirdAcceptAndDeleteRequest extends BaseSetup{
	
	@Test
	public void TestAccept() {
		LandingPage lp=new LandingPage(driver);
		lp.EnterEmail("nitis625@gmail.com");
		lp.EnterPass("nitish159");
		lp.ClickEnter();
		lp.ClickDeny();
		HomePage hp=new HomePage(driver);
		hp.ClickRequest();
		FriendPage fp=new FriendPage(driver);
		fp.ClickAccept();
	}
	
	@Test
	public void TestDelete() {
		LandingPage lp=new LandingPage(driver);
		lp.EnterEmail("nitis625@gmail.com");
		lp.EnterPass("nitish159");
		lp.ClickEnter();
		lp.ClickDeny();
		HomePage hp=new HomePage(driver);
		hp.ClickRequest();
		FriendPage fp=new FriendPage(driver);
		fp.ClickDelete();
	}

}
