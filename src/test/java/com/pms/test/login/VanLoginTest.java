package com.pms.test.login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pms.json.util.JSONManager;
import com.test.pms.driver.BaseTest;
import com.test.pms.reusablecomponents.BrowserActions;
import com.test.pms.utilities.CommonLocator;
import com.test.pms.utilities.Constant;
import com.test.pms.utilities.Locator;

public class VanLoginTest extends BaseTest {
	CommonLocator vld = null;
	VanLoginData input =null;
	
	@BeforeMethod	
	public void loadApplication() {
		vld =	(CommonLocator) JSONManager.readJson("D:\\Neethu\\Java_Class\\pms\\src\\test\\resources\\UI Map\\login.json", CommonLocator.class);
		input=  (VanLoginData) JSONManager.readJson("D:\\Neethu\\Java_Class\\pms\\src\\test\\resources\\Test Data\\loginInput.json", VanLoginData.class);
		System.out.println(vld);
		System.out.println(input);
		BrowserActions.loadSite(Constant.appurl);
		
	}
	@Test	
	public void loginTest() {
		VanLoginTestSteps.verifyLoginPage(vld);
		VanLoginTestSteps.login(vld,input);
		//VanLoginTestSteps.verifyHomePage();
		
		
	}

}
