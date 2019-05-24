package com.crm.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class LandingPageTest extends TestBase{

	LandingPage landingpage;
	LoginPage login;
	
	
	@BeforeMethod
	
	public void SetUp() {
		initialization();
		landingpage=new LandingPage();
		System.out.println("helloa");

	}
	
	
	
	@Test
	public void LandingPage() {
		login=landingpage.LoginLanding();
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
