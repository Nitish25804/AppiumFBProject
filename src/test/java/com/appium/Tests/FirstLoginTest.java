package com.appium.Tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.appium.Pom.LandingPage;
import com.appium.Utility.BaseSetup;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.screenrecording.BaseStartScreenRecordingOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;

public class FirstLoginTest extends BaseSetup{
	
	@Test
	public void Test1() throws IOException {
		LandingPage la=new LandingPage(driver);
		la.EnterEmail("nitis625@gmail.com");
		Log.info("Email Entered....");
		la.EnterPass("nitish159");
		Log.info("PassWord Entered....");
		la.ClickEnter();
		Log.info("Submit Button Clicked....");
		la.ClickDeny();
		Log.info("Deny Button Clicked....");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dimension size=driver.manage().window().getSize();
		int startx=(int) (size.width*0.4);
		int endx=(int) (size.width*0.2);
		int starty=(int) (size.height*0.4);
		int endy=(int) (size.height*0.4);
		TouchAction ta=new TouchAction((MobileDriver)driver);
		ta.press(PointOption.point(startx,starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(8)))
		.moveTo(PointOption.point(endx,endy)).release().perform();
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File d=new File("C:\\Users\\nitis\\OneDrive\\Desktop\\new.bmp");
		  FileHandler.copy(f,d);
		  
	}
	
}
