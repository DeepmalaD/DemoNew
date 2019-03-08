package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase {

	//OR
	@FindBy(xpath= "//*[@class=\"btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left\"]")
    WebElement LoginButton;		
	
	
	
	//Initilize OR
	public LandingPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Action--LoginButton
	public  LoginPage LoginLanding() {
		LoginButton.click();
		
		return new LoginPage();
		
	}
	
}
