package com.crm.qa.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://www.goibibo.com/flights/");
	
	//driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]")).click();
	
	//driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("7798074222");
	
	
	//driver.findElement(By.xpath("//input[@id=\"gosuggest_inputSrc\"]")).sendKeys("Pune");
	//driver.findElement(By.id("id='gosuggest_inputSrc'")).sendKeys("Pune");

	//id="gosuggest_inputDest"
	
	
	driver.findElement(By.xpath("//*[@placeholder=\"Departure\"]")).sendKeys("Sat, 23 Feb");
	
	//WebElement dateWidget=driver.findElement(By.xpath("//*[@class=\"DayPicker DayPicker--en\""));
	//dateWidget.sendKeys("Sat, 23 Feb");
	//List rows=dateWidget.findElements(By.tagName("tr"));
	
	String travelDate="Sat, 23 Feb";
	
	String Date1[]=travelDate.split(" ");
	
	String day=Date1[0];
	String date=Date1[1];
	String month=Date1[2];

	System.out.println(day);
	System.out.println(date);
	System.out.println(month);
	
	
	
	
	//*[@id="fare_20190223"]  
	//*[@id="fare_20190228"]   
	//*[@id="fare_20190222"]
	
			
	String beforeXpath="//*[@id=\"fare_201902";
	String afterXpath="\"]";
	
	/*
	for(int row=2;row<=6;row++) {
		
		for(int col=1;col<=7;col++)
		{
			
		//	driver.findElement(By.xpath("beforeXpath+"))
			
		}
		
	}
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
	
	
	
	
	
}}
