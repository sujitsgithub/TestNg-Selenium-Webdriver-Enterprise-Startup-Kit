package com.pms.test.login;

import com.test.pms.utilities.CommonLocator;
import com.test.pms.utilities.Locator;

public class VanLoginTestAction {

	public static void login(CommonLocator vld, VanLoginData input) {
		// TODO Auto-generated method stub
		VanLoginTestUtil.inputUserName(vld.getLocators().get(0),input);
		VanLoginTestUtil.inputPassword(vld.getLocators().get(1),input);
		VanLoginTestUtil.submitLogin(vld.getLocators().get(2));
	}

}
