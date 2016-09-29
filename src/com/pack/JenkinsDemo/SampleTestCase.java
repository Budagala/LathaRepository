package com.pack.JenkinsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUP()
	{
		
		driver=new HtmlUnitDriver();
		driver.get("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void verifyGooglePageTitle()
	{
		
		//Assert.assertTrue(driver.getTitle().contains("Google"));
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@AfterClass
	public void tearDown()
	{
		
		driver.quit();
	}

}
