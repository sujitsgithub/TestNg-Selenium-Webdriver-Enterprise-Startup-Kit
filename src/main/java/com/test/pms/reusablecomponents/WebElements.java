package com.test.pms.reusablecomponents;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;


public class WebElements {
	public static WebElement getElementByFluenWait(long timeOutSeconds, long pollingTimeMillis, By by) {
		Wait<WebDriver> wait = FluentWaitManager.getFluentWait(timeOutSeconds,pollingTimeMillis);
		 WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(by);
		     }
		   });
			
		return webElement;
		
	}
	
	public static void clickAction() {
		
	}
}
