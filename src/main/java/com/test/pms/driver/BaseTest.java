package com.test.pms.driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.test.pms.threadlocal.PMSAppContext;
import com.test.pms.threadlocal.PMSThreadLocal;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseTest {

	public static final Logger logger = Logger.getLogger(BaseTest.class);

	protected WebDriver driver = null;
	
	
	@BeforeTest
	@Parameters({ "browserType" })
	public void initDriverLocation(String browser) {
		logger.info("BaseTest initDriverLocation - Entered , browserType=" +  browser);
		switch (browser) {
		case DriverConstants.CHROME:
			WebDriverManager.chromedriver().setup();
			break;

		case DriverConstants.FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			break;
		case DriverConstants.EDGE:
			WebDriverManager.edgedriver().setup();
			break;
		case DriverConstants.IE:
			WebDriverManager.iedriver().setup();
			break;

		default:
			WebDriverManager.chromedriver().setup();

			break;
		}
		logger.info("BaseTest initDriverLocation - END , browserType=" +  browser);
	}
	
	@BeforeClass
	@Parameters({ "browserType" })
	public void initWebDriver(String browser) {
		
		logger.info("BaseTest initWebDriver - Entered , browserType=" +  browser);
		switch (browser) {
		case DriverConstants.CHROME:
			driver= DriverManager.getchromeDriver();
			break;

		case DriverConstants.FIREFOX:
			driver= DriverManager.getGeckoDriver();
			break;
		case DriverConstants.EDGE:
			driver= DriverManager.getEdgeDriver();
			break;
		case DriverConstants.IE:
			driver= DriverManager.getIEDriver();
			break;

		default:			
			driver= DriverManager.getchromeDriver();
			break;
		}
		logger.info("BaseTest initWebDriver - Entered , browserType=" +  browser);
		//this.registerWebdriverListener();
		this.setDriverToThreadLocal();
	}
	
	
	
	//@AfterMethod
	/*public void afterTestCaseMethod(ITestResult result) {
		logger.error("after test method execution - ");
		logger.error("Total time taken for execution : "+(new Date().getTime() - startTime));
		if(null != testCaseMethodName) {
		result.setAttribute("testCaseName", testCaseMethodName);
		}else {
		result.setAttribute("testCaseName", result.getName());
		}
		ScreenshotManager.triggerScreenshot(driver, result);

		}
*/
	/*protected abstract void setTestCaseMethodName(String testMethodName) ;
	
	private void registerWebdriverListener() {
		swdeListener = new  MyWebdriverEventListner(); //Created Webdriver Listener
		// Initializing EventFiringWebDriver using  WebDriver instance
		eventFiredriver = new EventFiringWebDriver(this.driver);
		eventFiredriver.register(swdeListener); //Registering  Webdriver Listener
	}*/
	@AfterClass
	public void destroyDriver() {
		if(this.driver!=null) {
			//this.driver.quit();
		}
		PMSAppContext context = PMSThreadLocal.get();
		context.getContextData().put("driver",null);
	}
	
	private void setDriverToThreadLocal() {
		logger.info("BaseTest initThreadLocal - Entered , driver=" +  this.driver);
		PMSAppContext context = PMSThreadLocal.get();
		context.getContextData().put("driver",this.driver);
		PMSThreadLocal.set(context);
		logger.info("BaseTest initThreadLocal - END , QrpAppContext=" +  context);
	}
}
