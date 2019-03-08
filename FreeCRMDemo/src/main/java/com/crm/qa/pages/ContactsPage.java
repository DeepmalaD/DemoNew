package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase 
{

	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement NewButton;
	
		
	@FindBy(name="first_name")	
	public WebElement FirstName;
	
	
	@FindBy(name="last_name")	
	public WebElement LastxName;
	
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement SaveButton;
	
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);

		
	}
	
	
	public void  createNewContact(String ftName, String ltName) {
		
		FirstName.sendKeys(ftName);
		FirstName.sendKeys(ltName);
		
		SaveButton.click();

		
	}
	
	
	
}
