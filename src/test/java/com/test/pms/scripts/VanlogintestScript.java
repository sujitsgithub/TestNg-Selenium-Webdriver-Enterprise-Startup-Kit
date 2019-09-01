package com.test.pms.scripts;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.pms.driver.BaseTest;
import com.test.pms.utilities.Constant;

public class VanlogintestScript extends BaseTest{

	public static final Logger logger = Logger.getLogger(VanlogintestScript.class);
	
	
	@BeforeMethod
	
	public void loadApplication() {
		driver.get(Constant.appurl);
	}
	@Test
	
	public void loginTest() {
		
		logger.info("Vanlogin - testcase execution Starts ");
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("userName")));
		driver.findElement(By.id("userName")).sendKeys("geo.j@experionglobal.com");
        driver.findElement(By.id("password")).sendKeys("qwerty");
		driver.findElement(By.xpath("//button[@class='cgc-btn cgc-btn--primary btn-block btn']")).click();
		logger.info("Vanlogin - testcase execution ENDs ");
	}
	
	
	

}
