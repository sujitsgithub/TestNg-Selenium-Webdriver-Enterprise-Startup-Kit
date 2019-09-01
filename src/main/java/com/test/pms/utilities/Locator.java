package com.test.pms.utilities;

import java.io.Serializable;

public class Locator implements Serializable {
	
	private String locatorName;
	private String locatorType;
	private String input;
	
	
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getLocatorName() {
		return locatorName;
	}
	public void setLocatorName(String locatorName) {
		this.locatorName = locatorName;
	}
	public String getLocatorType() {
		return locatorType;
	}
	public void setLocatorType(String locatorType) {
		this.locatorType = locatorType;
	}
	@Override
	public String toString() {
		return "Locator [locatorName=" + locatorName + ", locatorType=" + locatorType + "]";
	}

}
