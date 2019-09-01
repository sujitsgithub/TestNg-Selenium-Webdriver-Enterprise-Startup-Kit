package com.test.pms.reusablecomponents;

import com.test.pms.driver.Browser;

public class BrowserActions {

	public static void loadSite(String appurl) {
		Browser.driver().get(appurl);
		
	}
	
	

}
