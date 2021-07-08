package com.automation.org;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLDivElement;
import org.yaml.snakeyaml.emitter.Emitable;

public class Locators_task {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
System.setProperty( "webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspa"
		+ "ce\\Automation pactice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.google.com/");		
		
		/*driver.navigate().to("https://www.facebook.com/");
		 WebElement  nameid = driver.findElement(By.id("email"));
		 nameid.sendKeys("pkpri161");
		 WebElement password = driver.findElement(By.name("pass"));
		 password.sendKeys("jwvdfyav");  
		 WebElement login = driver.findElement(By.name("login"));
		 login.click();
				 
		driver.navigate().to("https://www.redbus.in/");
		WebElement  from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore"); 
		WebElement dateclik = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		dateclik.click();
		WebElement dte = driver.findElement(By.xpath("//td[text()='31']"));
		dte.click();
		
		//xpathch.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		WebElement hdfcid = xpathch.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		hdfcid.sendKeys("694tguwg9r");
		Thread.sleep(2000);
		WebElement hdcontinue = xpathch.findElement(By.name("fldLoginUserId"));
		//hdcontinue.sendKeys("jufgeif674");
	
		
		driver.navigate().to("https://www.google.com/");
        WebElement  search = driver.findElement(By.name("q"));
		search.sendKeys("Greens Technology ");
		
		driver.navigate().to("https://www.swiggy.com");
		WebElement location = driver.findElement(By.name("location"));
		location.sendKeys("manali");
		Thread.sleep(3000);
		WebElement loclck = driver.findElement(By.xpath("//span[text()="
				+ "'Manali, Chennai, Tamil Nadu, India']"));
		loclck.click();
		
		driver.navigate().to("https://www.snapdeal.com/login");
		WebElement  semail = driver.findElement(By.id("userName"));
		semail.sendKeys("8925415776");
		
		driver.navigate().to("http://adactinhotelapp.com/");
		WebElement  adusername = driver.findElement(By.name("username")); 
		adusername.sendKeys("pkpi161161");
		WebElement  adpasswrd = driver.findElement(By.id("password"));
		adpasswrd.sendKeys("bqkueref");
		 
		driver.navigate().to("https://www.instagram.com/accounts/login/");
 		Thread.sleep(3000);
		WebElement  username = driver.findElement(By.xpath("//input[@name='username']")); // not working
		username.sendKeys(" 8925415776");
		WebElement  ipassword = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		ipassword.sendKeys("jhsgdfe");
		WebElement inlogin = driver.findElement(By.xpath("(//div[contains(@class,'Igw0E')])[5]"));
		inlogin.click();
		
		driver.navigate().to("https://www.irctc.co.in/"); // no id / name available
		Thread.sleep(5000);
		Thread.sleep(3000);
		WebElement irok = driver.findElement(By.xpath("//button[@type='submit']"));
		irok.click();
		Thread.sleep(2000);
		WebElement irfrom = driver.findElement(By.xpath("//input[@role='searchbox']"));
		irfrom.sendKeys("Chennai");
		WebElement irto = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
	    irto.sendKeys("Pune");
	    Thread.sleep(2000);
	    WebElement irdopdwn = driver.findElement(By.xpath("(//div[@role='button'])[2]"));
	    irdopdwn.click();
	    WebElement irclass = driver.findElement(By.xpath("//span[text()='LOWER BERTH/SR.CITIZEN']"));
	    irclass.click();
	    Thread.sleep(3000);
	    WebElement iok = driver.findElement(By.xpath("//span[contains(@class,'ui-button-text')]"));
		iok.click();*/
		
		
	
	
	}

}
