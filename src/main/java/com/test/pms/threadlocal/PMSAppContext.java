package com.test.pms.threadlocal;

import java.util.HashMap;
import java.util.Map;

public class PMSAppContext {
	
	private  final Map<String, Object> contextData = new HashMap<>();
	

	public Map<String, Object> getContextData() {
		return contextData;
	}
}
