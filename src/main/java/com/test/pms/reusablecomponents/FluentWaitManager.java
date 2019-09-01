package com.test.pms.reusablecomponents;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.test.pms.driver.Browser;

public class FluentWaitManager {
	public static Wait<WebDriver> getFluentWait(long timeOutSeconds, long pollingTimeMillis) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Browser.driver())							
				.withTimeout(Duration.ofMillis(timeOutSeconds)) 			
				.pollingEvery(Duration.ofMillis(pollingTimeMillis)) 			
				.ignoreAll(Arrays.asList(Exception.class)).withMessage("This message happens because of the timeout reached");
		return wait;
	}
}
