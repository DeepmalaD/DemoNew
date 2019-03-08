package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement ContactsLink;
			
public 	HomePage() {
	
	PageFactory.initElements(driver, this);
	
}
	
public ContactsPage clickContactsLink() {
	ContactsLink.click();
	return new ContactsPage();
	
}	
	
	
}
