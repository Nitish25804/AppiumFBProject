package com.appium.Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.offset.ElementOption;

public class HorizentalScrolling {
	@Test
	public void Horizontal() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "android 11");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability("appPackage","com.android.settings");
		cap.setCapability("appActivity", "com.android.settings.Settings");
		AppiumDriver driver=new AppiumDriver(new URL("http://127.0.1.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Display']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Brightness level']")).click();
		WebElement a=driver.findElement(By.id("com.android.systemui:id/slider"));
		TouchAction ta=new TouchAction(driver);
		ta.longPress(ElementOption.element(a)).moveTo(ElementOption.element(a,250,250)).release().perform();
		
	}

}
