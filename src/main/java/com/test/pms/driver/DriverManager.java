package com.test.pms.driver;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {
	public static final Logger logger = Logger.getLogger(DriverManager.class);
	public static WebDriver getchromeDriver() {
		logger.info("DriverManager getchromeDriver - Entered" );
		ChromeOptions options = new ChromeOptions();
		options.addArguments(Arrays.asList("--test-type", "test-type=browser", "--disable-default-apps",
				"--enable-precise-memory-info", "--js-flags=--expose-gc", "--disable-infobars", "--start-maximized",
				"--ignore-certificate-errors", "--disable-popup-blocking", "--allow-running-insecure-content",
				"--disable-notifications", "--disable-save-password", "--disable-translate",
				"--always-authorize-plugins"));
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.manage().window().fullscreen();
		logger.info("DriverManager getchromeDriver - END" );
		return driver;

	}

	public static WebDriver getGeckoDriver() { // firefox driver

		
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	public static WebDriver getIEDriver() { 
		WebDriver driver = new InternetExplorerDriver();
		return driver;
	}
	public static WebDriver getEdgeDriver() { 
		//WebDriver driver = new MicrosoftWebDriver();
		 
		return null;
	}
	

}
