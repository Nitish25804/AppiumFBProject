package com.appium.Tests;

import org.testng.annotations.Test;

import com.appium.Pom.HomePage;
import com.appium.Pom.LandingPage;
import com.appium.Utility.BaseSetup;

public class FifthClickStatus extends BaseSetup{
	
	@Test
	public void PlayStatus() {
		LandingPage la=new LandingPage(driver);
		la.EnterEmail("nitis625@gmail.com");
		la.EnterPass("nitish159");
		la.ClickEnter();
		la.ClickDeny();
		HomePage hm=new HomePage(driver);
		hm.ClickStatus();
	}

}
