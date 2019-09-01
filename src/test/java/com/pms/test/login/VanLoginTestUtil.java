package com.pms.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.pms.reusablecomponents.WebElements;
import com.test.pms.utilities.CommonLocator;
import com.test.pms.utilities.Locator;
import com.test.pms.utilities.ReflectionsUtil;

public class VanLoginTestUtil {

	public static String getLoginPageTitle(Locator locator) {
		WebElement ele = WebElements.getElementByFluenWait(30, 2, By.xpath(locator.getLocatorName()));
		String title =  ele.getAttribute("innerHTML");
		//System.out.println("inner HTML is:" + title);
		return title;
	}

	public static void inputUserName(Locator locator, VanLoginData input ) {
		WebElement userNameElement = WebElements.getElementByFluenWait(60, 2, By.id(locator.getLocatorName()));
		//WebElement userNameElement = WebElements.getElementByFluenWait(30, 2, ReflectionsUtil.getBy(locator.getLocatorName()));
		userNameElement.sendKeys(input.getUsername());
	}

	public static void inputPassword(Locator locator, VanLoginData input) {
		WebElement passwordElement = WebElements.getElementByFluenWait(60, 2, By.id(locator.getLocatorName()));
		passwordElement.sendKeys(input.getPassword());
		
	}

	public static void submitLogin(Locator locator) {
		WebElement loginBtnElement = WebElements.getElementByFluenWait(60, 2, By.xpath(locator.getLocatorName()));
		loginBtnElement.click();
	}

	public static String getHomePageTitle() {
		WebElement ele = WebElements.getElementByFluenWait(30, 2, By.id("id"));
		String title =  ele.getAttribute("innerHTML");
		return title;
	}

}
