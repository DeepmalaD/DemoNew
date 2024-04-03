package com.demogitrepo.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Calendar_JS {

	WebDriver driver;
	
	
	@Test
	public void calendarTest() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Drivers_1\\chromedriver.exe");
	driver=new ChromeDriver();
	//testing commit from github desktop
	
	//System.setProperty("webdriver.gecko.driver", "F:\\Drivers_1\\geckodriver.exe");
	//driver=new FirefoxDriver();
	
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://www.spicejet.com/");

//WebElement fromCity=	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
WebElement fromCity=driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']"));

//fromCity.click();
System.out.println("hello1");

WebDriverWait wait=new WebDriverWait(driver,20);

wait.until(ExpectedConditions.visibilityOf(fromCity));


//fromCity.sendKeys("Bhopal (BHO)");
Select s=new Select(fromCity);
s.selectByVisibleText("Bhopal (BHO)");
System.out.println("hello");


System.out.println("hello");

Thread.sleep(2000);
	
WebElement toCity=	driver.findElement(By.name("ctl00$mainContent$ddl_destinationStation1"));
toCity.sendKeys("Pune (PNQ)")	;


	
	}
	
	
}
