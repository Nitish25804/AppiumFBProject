package com.appium.Tests;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.appium.Pom.HomePage;
import com.appium.Pom.LandingPage;
import com.appium.Pom.NotificationPage;
import com.appium.Utility.BaseSetup;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
@Listeners(com.appium.Utility.ExtentListinerClass.class)
public class ForthNotificationSelect extends BaseSetup {
	
	@Test
	public void Test1() {
		LandingPage la=new LandingPage(driver);
		la.EnterEmail("nitis625@gmail.com");
		Log.info("Email Entered.....");
		la.EnterPass("nitish159");
		Log.info("Password Entered....");
		la.ClickEnter();
		Log.info("Submit Button Entered.....");
		la.ClickDeny();
		Log.info("Deny Button Entered....");
		HomePage hp=new HomePage(driver);
		hp.ClickNotification();
		Log.info("Notification Button Clicked....");
		NotificationPage np=new NotificationPage(driver);
		//np.ClickNotification();
		Log.info("Notification Selected....");
		
	}

}
