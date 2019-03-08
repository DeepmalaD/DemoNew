package com.crm.qa.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest  extends TestBase{

	public LoginPage login;
    public HomePage home;
	
public 	HomePageTest() {
	super();
}
	
	
@BeforeMethod
public void Setup() throws InterruptedException {
	
	initialization();
	login=new LoginPage();
	home=new HomePage();
	
	String u1=prop.getProperty("username");
	String p1=prop.getProperty("password");

	login.Login(u1, p1);
	
	Thread.sleep(10000);
	
}
	


@Test(priority=1)
public void ValidateHomeTitle() {
	
	String HomeTitle=driver.getTitle();
	System.out.println(HomeTitle);
}



@Test(priority=2)
public void ContactsPageNavigation () throws InterruptedException {
	
	home.clickContactsLink();
	Thread.sleep(10000);

	
}
	
@AfterClass
public void tearDown() {
	
	driver.quit();
}
	
	
}
