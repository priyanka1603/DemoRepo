package com.automation.org;

import java.io.File;

import javax.tools.Diagnostic;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty( "webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Automation "
		+ "pactice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		  /*driver.get( "https://www.google.com/");	
		
		driver.navigate().to("https://www.youtube.com/");
		WebElement  youtube = driver.findElement(By.id("search"));
        youtube.sendKeys("java for beginners");
        
        driver.navigate().to("https://zoom.us/signin");
        WebElement  zoomid = driver.findElement(By.id("email"));
        zoomid.sendKeys("pkpi161@gmail.com");
        WebElement  zoompas = driver.findElement(By.name("password"));
        zoompas.sendKeys("fkwuervb542");
        
      driver.navigate().to("https://www.trivago.in/");
      WebElement  trivago = driver.findElement(By.id("querytext"));
        trivago.sendKeys("Pune");
        
        driver.navigate().to("https://internet-banking.dbs.com.sg/IB/Welcome");
        WebElement  Dbs = driver.findElement(By.id("UID"));
        Dbs.sendKeys("priyanka manohar");
        WebElement  dbspin = driver.findElement(By.name("PIN"));
        dbspin.sendKeys("bjdfueb46");*/
        
  
	}

}
