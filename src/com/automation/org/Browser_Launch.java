package com.automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
 
public class Browser_Launch {
	// chrome, firefox, edge, internet explorer, opera 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		System.setProperty( "webdriver.gecko.driver","C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Driver\\geckodriver.exe" );

		WebDriver driver1 = new FirefoxDriver();
		
		System.setProperty( "webdriver.ie.driver", "C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Driver\\IEDriverServer.exe");

		WebDriver driver2  = new InternetExplorerDriver();
		
		System.setProperty( "webdriver.opera.driver", 
			"C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Driver\\operadriver_win64\\operadriver.exe");
		
		WebDriver driver3 = new OperaDriver();
		
		 System.setProperty( "webdriver.edge.driver",
			 "C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Driver\\msedgedriver.exe");
		WebDriver driver4 = new EdgeDriver();
		 
		
		
	}

}
