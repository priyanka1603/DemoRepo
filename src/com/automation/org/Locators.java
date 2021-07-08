package com.automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty( "webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.google.com/");		
	//	driver.navigate().to("https://obsproject.com/");
		 
		/* driver.navigate().to("https://www.amazon.com/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.close(); */
		 
		// driver.navigate().to("https://www.amazon.com/");
 		 /*driver.navigate().to("https://www.facebook.com/");
		 WebElement  nameid = driver.findElement(By.id("email"));
		 nameid.sendKeys("pkpri161");
		 WebElement password = driver.findElement(By.name("pass"));
		 password.sendKeys("jwvdfyav");  
		 WebElement login = driver.findElement(By.name("login"));
		 login.click();*/	
				 
		driver.navigate().to("https://www.redbus.in/");
		WebElement  from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore");
		
		
		
		
		
		 

	}

}
