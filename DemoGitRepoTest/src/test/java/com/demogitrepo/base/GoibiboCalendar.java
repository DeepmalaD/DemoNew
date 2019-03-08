package com.demogitrepo.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoibiboCalendar {

	
WebDriver driver;
	
	
	@Test()
	public void calendarTest() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Drivers_1\\chromedriver.exe");
	driver=new ChromeDriver();
	
	//System.setProperty("webdriver.gecko.driver", "F:\\Drivers_1\\geckodriver.exe");
	//driver=new FirefoxDriver();
	
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://www.goibibo.com/flights/");
	
//	driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]")).click();
	
	//driver.switchTo().frame(0);
//	driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("7798074222");
	
	
	//driver.findElement(By.xpath("//input[@id=\"gosuggest_inputSrc\"]")).sendKeys("Pune");
	//driver.findElement(By.id("id='gosuggest_inputSrc'")).sendKeys("Pune");

	//id="gosuggest_inputDest"
			
	
	driver.findElement(By.xpath("//*[@placeholder=\"Departure\"]")).click();
	
	WebElement dateWidget=driver.findElement(By.xpath("id=\"ui-datepicker-div\""));
	
	//dateWidget.findElements(By.tagName("tr"));
	
	String travelDate="Sat, 23 Feb";
	
	String Date1[]=travelDate.split(" ");
	
	String day=Date1[0];
	String date=Date1[1];
	String month=Date1[2];

	System.out.println(day);
	System.out.println(date);
	System.out.println(month);


	
	

}}
