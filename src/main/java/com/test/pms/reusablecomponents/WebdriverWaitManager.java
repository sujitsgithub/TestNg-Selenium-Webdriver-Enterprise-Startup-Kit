package com.test.pms.reusablecomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.pms.driver.Browser;

public class WebdriverWaitManager {
	
	
	
	public void waitByElementTObeClickable(By by, long waitInSecs) {
		WebDriverWait wait= new WebDriverWait(Browser.driver(), waitInSecs);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	
}
