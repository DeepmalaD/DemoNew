package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

//Page Factory- OR:
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(xpath="//*[@class=\"ui fluid large blue submit button\"]")
	WebElement Login;
	
	//Initializing the page Object
	//constructor for calling method
	//init--initialize element
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	

	
	
	//Actions
	public String ValidateLoginPageTitle() {
		String Title=driver.getTitle();
		return Title;
	}
	
	
	//Login
	public HomePage Login(String UserName, String Password) {
		username.sendKeys(UserName);
		password.sendKeys(Password);
		Login.click();
		
		return new HomePage();
		
		
	}
	
}
