package com.pms.test.runner;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.TestNG;

import com.test.pms.threadlocal.PMSAppContext;
import com.test.pms.threadlocal.PMSThreadLocal;


public class TestRunner {

	
public static final Logger logger = Logger.getLogger(TestRunner.class);	

public static void main(String[] args) {
		initThreadLocal();
        logger.info("TestRunner Main- Execution Begins");
	
		List<String> list = new ArrayList<String>();
		list.add("D:\\Neethu\\Java_Class\\pms\\src\\test\\resources\\testsuite\\testng.xml");
		System.out.println("number of test suite files executed: " + list.size());
		TestNG tng = new TestNG();
		tng.setTestSuites(list);
		tng.run();
		logger.info("TestRunner Main- Execution Ends");
	

}

public static void initThreadLocal() {
	PMSAppContext context= new PMSAppContext();
	PMSThreadLocal.set(context);
}
}
