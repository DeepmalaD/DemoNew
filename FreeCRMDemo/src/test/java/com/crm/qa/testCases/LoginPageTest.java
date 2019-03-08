package com.crm.qa.testCases;


import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	
	LoginPage logoinpage;
	
	public LoginPageTest() {
		
		super();//it will call TestBase Class constructor
		
	}
	
	
	@BeforeMethod
	
	public void SetUp(){
		
		initialization();
	   logoinpage=new LoginPage();
	}
	
	
	@Test(priority=1,enabled=false)
	public  void loginpagetitle() {
		System.out.println("as");
		String title=logoinpage.ValidateLoginPageTitle();
        Assert.assertEquals("Login or Register", title);		
	}
	
	@Test(priority=2)
	public void CRMLogin() throws InterruptedException {
		
		
		String u1=prop.getProperty("username");
		String p1=prop.getProperty("password");

		logoinpage.Login(u1, p1);
		
		Thread.sleep(10000);
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	

}
