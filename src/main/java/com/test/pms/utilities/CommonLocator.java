package com.test.pms.utilities;

import java.io.Serializable;
import java.util.List;

public class CommonLocator implements Serializable{
	private List<Locator> locators ;

	public List<Locator> getLocators() {
		return locators;
	}

	public void setLocators(List<Locator> locators) {
		this.locators = locators;
	}

	@Override
	public String toString() {
		return "CommonLocator [locators=" + locators + "]";
	}
	

}
