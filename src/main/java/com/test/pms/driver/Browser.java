package com.test.pms.driver;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.test.pms.threadlocal.PMSAppContext;
import com.test.pms.threadlocal.PMSThreadLocal;



public class Browser {

	
	
	public static WebDriver driver () {
		PMSAppContext context = PMSThreadLocal.get();
		Map<String, Object> contextDataMap = context.getContextData();
		WebDriver driver=(WebDriver) contextDataMap.get("driver");
		return driver;
	}
	
	
	
}
