package com.pms.test.login;

import static org.testng.Assert.assertEquals;

import com.test.pms.utilities.CommonLocator;
import com.test.pms.utilities.Locator;

public class VanLoginTestSteps {

	public static void verifyLoginPage(CommonLocator vld) {
		  String expectedTitle = "Username";
		  String actualTitle = VanLoginTestUtil.getLoginPageTitle(vld.getLocators().get(3));
		 assertEquals(actualTitle, expectedTitle);
	}

	public static void login(CommonLocator vld, VanLoginData input) {
		// TODO Auto-generated method stub
		VanLoginTestAction.login(vld,input);
		
	}

/*	public static void verifyHomePage() {
		String expectedTitle = "";
		  String actualTitle = VanLoginTestUtil.getHomePageTitle();
		  assertEquals(actualTitle, expectedTitle);
		
	}*/

	


}
