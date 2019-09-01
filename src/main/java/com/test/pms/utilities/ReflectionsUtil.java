package com.test.pms.utilities;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;

public class ReflectionsUtil {
	
	public static By getBy(String methodName) {
		By by2 = null;
		
		try {
			Method methodInstance = By.class.getMethod(methodName);
			
				by2 = (By) methodInstance.invoke(By.class);
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(by2);
		return by2;
	}
	

}
