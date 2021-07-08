package com.automation.org;

import java.awt.dnd.DragGestureEvent;
import java.util.spi.TimeZoneNameProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.SelectChannelEndPoint;

public class Locators_Xpath_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace"
				+ "\\Automation pactice\\Driver\\chromedriver.exe");
		WebDriver xpathch = new ChromeDriver();
		xpathch.manage().window().maximize();
		xpathch.get("https://www.google.com/");
		
		/* xpathch.navigate().to("https://twitter.com/");
		 Thread.sleep(5000);
		 WebElement  signup = xpathch.findElement(By.xpath("(//div[@dir='auto'])[3]"));
		 signup.click();
		 Thread.sleep(3000);
		 WebElement  twname = xpathch.findElement(By.xpath("(//input[@autocapitalize='sentences'])"));
		 twname.sendKeys("Priyanka");
		 WebElement twphone = xpathch.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]"));
		 twphone.sendKeys("9237992579");
		
		 WebElement twmonth = xpathch.findElement(By.id("Month"));
		 Select month = new Select(twmonth);
		 month.selectByVisibleText("March");
		 
		WebElement day = xpathch.findElement(By.xpath("(//select[@id='Day'])"));
	    Select day1 = new Select(day);
	    day1.selectByVisibleText("16");
	    
		WebElement twyear = xpathch.findElement(By.xpath("(//select[@id='Year'])"));
		Select year = new Select(twyear);
		year.selectByVisibleText("2000");
		
		
		xpathch.navigate().to("https://twitter.com/");
		Thread.sleep(5000);
		WebElement tlogin = xpathch.findElement(By.xpath("(//a[@role='link'])[2]"));
		tlogin.click();
		Thread.sleep(3000); //login
		WebElement tname = xpathch.findElement(By.xpath("//input[@autocapitalize='none']"));
		tname.sendKeys("Priyanka M");
		WebElement tpaswrd = xpathch.findElement(By.xpath("//input[@type='password']"));
		tpaswrd.sendKeys("8925fyt");
		WebElement twlogin = xpathch.findElement(By.xpath("//div[@role='button']"));
		twlogin.click();
	
		xpathch.navigate().to("https://www.icicibank.com/");
		Thread.sleep(5000);
		WebElement  icuser = xpathch.findElement(By.xpath("//a[@target='_self']"));
		icuser.click();
		Thread.sleep(3000);
		WebElement iciuser = xpathch.findElement(By.xpath("//input[@type='text']"));
		iciuser.click();
		WebElement iuserid = xpathch.findElement(By.xpath("//input[@title='User Id']"));
		iuserid.sendKeys("priyank162");
		WebElement ipaswrd = xpathch.findElement(By.xpath("(//input[@type='password'])[4]"));
	    ipaswrd.sendKeys("17647vfcz");
		
		Thread.sleep(3000);
		WebElement icbox = xpathch.findElement(By.xpath("//div[@class='selectedTxt']"));
		icbox.click();
		
		WebElement icselect = xpathch.findElement(By.xpath("//a[text()='Recharge']"));
		icselect.click();
		
		WebElement icheckbox = xpathch.findElement(By.xpath("//input[@type='checkbox']"));
		icheckbox.click(); 
		
		xpathch.navigate().to("https://www.lvbankonline.in/index.html?module=login");
		Thread.sleep(5000);
		
		WebElement ivuser = xpathch.findElement(By.xpath("//input[@name='username']"));
		ivuser.sendKeys("priyak162");
		Thread.sleep(3000);
		
		WebElement lvpas = xpathch.findElement(By.xpath("//input[@name='password']"));
	    lvpas.sendKeys("9845g4frvaknx");
	    
	     WebElement lvlang = xpathch.findElement(By.xpath("(//a[@role='presentation'])[3]"));
	    lvlang.click();
	    
	    Thread.sleep(2000);
	    WebElement lansel = xpathch.findElement(By.xpath("(//div[contains(@class,'oj-listbox-result-label')])[2]"));
		lansel.click();
	
		WebElement lvok = xpathch.findElement(By.xpath("(//span[@class='oj-button-text'])[3]"));
	    lvok.click();  */ 
		
	
	}

}
