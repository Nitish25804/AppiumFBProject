package com.appium.Utility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseSetup {
	 public AppiumDriver<RemoteWebElement> driver;
	 public WebDriverWait wait;
	 public static Logger Log;
	@BeforeClass
	public void Setup() throws MalformedURLException {
		  DesiredCapabilities cap=new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 30");
		  cap.setCapability("appPackage", "com.facebook.lite");
		  cap.setCapability("appActivity", "com.facebook.lite.MainActivity");
		  cap.setCapability("autoGrantPermissions", "true");
		  cap.setCapability("appium:ensureWebviewsHavePages", true);
		  cap.setCapability("appium:nativeWebScreenshot", true);
		  cap.setCapability("appium:newCommandTimeout", 3600);
		  cap.setCapability("appium:connectHardwareKeyboard", true);
		  driver=new AppiumDriver<RemoteWebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		  wait = new WebDriverWait(driver, 10);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Log=LogManager.getLogger("AndroidTest");
	}
	@AfterClass
	public void TearDown() {
		//driver.quit();
		//driver.close();
	}
	public void CaptureScreenshot(WebDriver driver,String testName) throws IOException {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "//Screenshot//" + testName + ".png");
		FileUtils.copyFile(src, dest);
	}
	
}
