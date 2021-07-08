package com.automation.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actions_Robot_task {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Automation pactice\\driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions acs = new Actions(driver);
		Robot rb1 = new Robot();
	    TakesScreenshot ts1 = (TakesScreenshot) driver;
	    JavascriptExecutor j3 = (JavascriptExecutor) driver;
		/*driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement b1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));//bank
		WebElement amt1 = driver.findElement(By.xpath("//ol[@id='bank']"));//amt1
		acs.dragAndDrop(b1, amt1).build().perform();
		
		Thread.sleep(3000);
		WebElement b2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));//5000
		WebElement  amt2 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		acs.dragAndDrop(b2, amt2).build().perform();
		
		Thread.sleep(3000);
		WebElement ban1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));//sales
		WebElement at1 = driver.findElement(By.xpath("//ol[@id='loan']"));
		acs.dragAndDrop(ban1, at1).build().perform();
		
		Thread.sleep(3000);
		WebElement ban2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));//5000
		WebElement at2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		acs.dragAndDrop(ban2, at2).build().perform();
		
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0 , 2000)");
		
		Thread.sleep(3000);
	  
		File tsve = ts1.getScreenshotAs(OutputType.FILE);
		File saveto = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot");
		FileUtils.copyFileToDirectory(tsve, saveto);
		*/
		
		/*driver.navigate().to("http://www.amazon.in");
		WebElement shop = driver.findElement(By.xpath("//a[@role='button']"));
		acs.click(shop).build().perform();
		Thread.sleep(3000);
		WebElement mobil = driver.findElement(By.xpath("//a[@data-ref-tag='nav_em_1_1_1_13']"));
		acs.moveToElement(mobil).build().perform();
		mobil.click();
		
		WebElement powrb = driver.findElement(By.xpath("//a[text()='Power Banks']"));
		acs.click(powrb).build().perform();
		*/
		
		/*driver.navigate().to("https://www.flipkart.com/");
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		Thread.sleep(2000);
		WebElement appli = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[7]"));
	    acs.moveToElement(appli).build().perform();
	    WebElement homeappli = driver.findElement(By.xpath("//a[text()='Home Appliances']"));
		acs.click(homeappli).build().perform();
		Thread.sleep(2000);
		WebElement furn = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));
		acs.moveToElement(furn).build().perform();
		Thread.sleep(1000);
		WebElement chairs = driver.findElement(By.xpath("//a[text()='Dining Tables & Chairs']"));
		acs.click(chairs).build().perform();
		*/
		
	  /*  driver.navigate().to("https://www.gettyimages.in/");
		Thread.sleep(2000);
		WebElement edit = driver.findElement(By.xpath("//a[@data-nav='nav_Editorial']"));
		acs.click(edit).build().perform();
		WebElement entertain = driver.findElement(By.xpath("//a[text()='Entertainment']"));
		acs.click(entertain).build().perform();
		Thread.sleep(3000);
		File sae = ts1.getScreenshotAs(OutputType.FILE);
		File getsave = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(sae, getsave);
	  */
		
	   /* driver.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
	    Thread.sleep(2000);
	    WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
	    acs.moveToElement(course).build().perform();
	    Thread.sleep(2000);
	    WebElement sof = driver.findElement(By.xpath("//a[text()='Software Testing Training ']"));
	    acs.moveToElement(sof).build().perform();
	    WebElement selenium = driver.findElement(By.xpath("//a[text()='Selenium Training']"));
	    acs.click(selenium).build().perform();
	    */
	    
	  /* driver.navigate().to("https://www.homedepot.com/");
	    WebElement alldep = driver.findElement(By.xpath("//a[text()='All Departments']"));
		acs.moveToElement(alldep).build().perform();
		Thread.sleep(1000);
		WebElement heat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
	    acs.moveToElement(heat).build().perform();
	    Thread.sleep(3000);
	    WebElement air = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
	    acs.moveToElement(air).build().perform();
	    Thread.sleep(1000);
	    WebElement port = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
	    acs.click(port).build().perform();
	    */
	    
	               //facebook
	    /* driver.navigate().to("https://www.facebook.com/");
	    Thread.sleep(2000);
	    WebElement eng = driver.findElement(By.xpath("//a[text()='English (UK)']"));
	    eng.click(); 
	    Thread.sleep(3000);   
	    WebElement id = driver.findElement(By.xpath("//input[@type='text']"));
	    id.sendKeys("manohardevi2521@gmail.com"); 
	    rb1.keyPress(KeyEvent.VK_CONTROL);
	    rb1.keyPress(KeyEvent.VK_A);
	    rb1.keyPress(KeyEvent.VK_C);
	    Thread.sleep(2000);
	    rb1.keyRelease(KeyEvent.VK_CONTROL);
	    rb1.keyRelease(KeyEvent.VK_A);
	    rb1.keyRelease(KeyEvent.VK_C);
	    Thread.sleep(1000);
	    WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	    pass.click();
	    Thread.sleep(1000);
	    rb1.keyPress(KeyEvent.VK_CONTROL);
	    rb1.keyPress(KeyEvent.VK_V);
	    rb1.keyRelease(KeyEvent.VK_CONTROL);
	    rb1.keyRelease(KeyEvent.VK_V);
	    */
	    
	         //google
	  /*  driver.navigate().to("https://www.google.co.in/webhp");
	    WebElement gbox = driver.findElement(By.xpath("//a[@class='gb_C']"));
	    acs.click(gbox).build().perform();
	    driver.switchTo().frame(0);
	    Thread.sleep(2000);
	    WebElement gamil = driver.findElement(By.xpath("//span[text()='Gmail']"));
	    Thread.sleep(1000);
	    acs.click(gamil).build().perform();
	  */
	    
	       //gt1
	    driver.navigate().to("http://www.greenstechnologys.com/");
	    WebElement para = driver.findElement(By.xpath("//font[text()='GREENS TECHNOLOGY']"));
	    Thread.sleep(1000);
	    acs.doubleClick(para).doubleClick(para).build().perform();
	    Thread.sleep(1000);
	    acs.contextClick().build().perform();
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    rb1.keyPress(KeyEvent.VK_ENTER);
	    rb1.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	         //gt2
	    /*driver.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
	    WebElement cts = driver.findElement(By.xpath("(//a[@data-toggle='modal'])[28]"));
	    cts.click(); 
	    Thread.sleep(3000);
	    WebElement q1 = driver.findElement(By.xpath("//p[text()='1. Tell about yourself']"));
	    acs.doubleClick(q1).doubleClick(q1).build().perform();
	    Thread.sleep(1000);
	    acs.contextClick(q1).build().perform();
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    rb1.keyPress(KeyEvent.VK_ENTER);
	    rb1.keyRelease(KeyEvent.VK_ENTER);
	    */
	    
	         //gt3
	   /* driver.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
	    Thread.sleep(2000);
	    WebElement head = driver.findElement(By.id("head-wrapper"));
	    acs.contextClick(head).build().perform();
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    rb1.keyPress(KeyEvent.VK_ENTER);
	    rb1.keyRelease(KeyEvent.VK_ENTER);
	    */
	    
	    
	       //gt4  wrap
	   /* driver.navigate().to("http://www.greenstechnologys.com/selenium-course-content.html");
	    Thread.sleep(5000);
	    WebElement scoll = driver.findElement(By.xpath("//b[text()='I/O Streams:']"));
	    Thread.sleep(2000);
	    
	    j3.executeScript("arguments[0].scrollIntoView();",scoll );
	    
	    WebElement intro = driver.findElement(By.xpath("//span[text()='Introduction']"));
	    WebElement bcls = driver.findElement(By.xpath("//span[text()='Boolean classes']"));
	    Thread.sleep(2000);
        acs.click(intro).dragAndDrop(intro, bcls).build().perform();
        Thread.sleep(2000);
	    acs.contextClick(bcls).build().perform();
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(300);
	    rb1.keyPress(KeyEvent.VK_ENTER);
	    rb1.keyRelease(KeyEvent.VK_ENTER);
	    */
	    
	    
	         //amazon
	   /* driver.navigate().to("https://www.amazon.in/");
	    Thread.sleep(2000);
	    WebElement account = driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
	    acs.moveToElement(account).build().perform();
	    WebElement sig = driver.findElement(By.xpath("//span[text()='Sign in']"));
	    sig.click();
	    Thread.sleep(2000);
	    WebElement create = driver.findElement(By.id("createAccountSubmit"));
	    create.click();
	    Thread.sleep(1000);
	    WebElement mil = driver.findElement(By.xpath("//input[@id='ap_email']"));
	    mil.sendKeys("manohardevi2521@gmail.com");
	    rb1.keyPress(KeyEvent.VK_CONTROL);
	    rb1.keyPress(KeyEvent.VK_A);
	    rb1.keyPress(KeyEvent.VK_C);
	    Thread.sleep(1000);
	    rb1.keyRelease(KeyEvent.VK_CONTROL);
	    rb1.keyRelease(KeyEvent.VK_A);
	    rb1.keyRelease(KeyEvent.VK_C);
	    Thread.sleep(1000);
	    WebElement paswr = driver.findElement(By.xpath("//input[@type='password']"));
	    paswr.click();
	    rb1.keyPress(KeyEvent.VK_CONTROL);
	    rb1.keyPress(KeyEvent.VK_V);
	    rb1.keyRelease(KeyEvent.VK_CONTROL);
	    rb1.keyRelease(KeyEvent.VK_V);
	    */
	    
	           //swiggy
	   /* driver.navigate().to("https://www.swiggy.com/restaurants/login-besant-nagar-adyar-chennai-8308");
	    Thread.sleep(1000);
	    WebElement sgn = driver.findElement(By.xpath("//span[text()='Sign In']"));
	    sgn.click();
	    Thread.sleep(1000);
	    WebElement cre = driver.findElement(By.xpath("//a[text()='create an account']"));
	    cre.click();
	    WebElement mobil = driver.findElement(By.id("mobile"));
	    mobil.sendKeys("8925415776");
	    Thread.sleep(1000);
	    acs.doubleClick(mobil).build().perform();
	    acs.contextClick(mobil).build().perform();
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    rb1.keyPress(KeyEvent.VK_ENTER);
	    rb1.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    WebElement psw = driver.findElement(By.xpath("//input[@name='password']"));
	    acs.contextClick(psw).build().perform();
	    rb1.keyPress(KeyEvent.VK_UP);
	    rb1.keyRelease(KeyEvent.VK_UP);
	    rb1.keyPress(KeyEvent.VK_UP);
	    rb1.keyRelease(KeyEvent.VK_UP);
	    rb1.keyPress(KeyEvent.VK_UP);
	    rb1.keyRelease(KeyEvent.VK_UP);
	    rb1.keyPress(KeyEvent.VK_UP);
	    rb1.keyRelease(KeyEvent.VK_UP);
	    rb1.keyPress(KeyEvent.VK_UP);
	    rb1.keyRelease(KeyEvent.VK_UP);
	    Thread.sleep(1000);
	    rb1.keyPress(KeyEvent.VK_ENTER);
	    rb1.keyRelease(KeyEvent.VK_ENTER);
	    */
	    
	  /*  driver.navigate().to("https://www.flipkart.com/");
	    WebElement elec = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[5]"));
	    acs.moveToElement(elec).build().perform();
	    WebElement game = driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[3]"));
	    acs.moveToElement(game).build().perform();
	    Thread.sleep(1000);
	    WebElement gamekey = driver.findElement(By.xpath("//a[text()='Gaming Keyboards']"));
	    gamekey.click();
	    Thread.sleep(2000);
	    WebElement keyb = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])"));
	    acs.moveToElement(keyb).build().perform();
	    acs.contextClick(keyb).build().perform();
	    Thread.sleep(3000);
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    rb1.keyPress(KeyEvent.VK_DOWN);
	    rb1.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(500);
	    rb1.keyPress(KeyEvent.VK_ENTER);
	    rb1.keyRelease(KeyEvent.VK_ENTER);
	    */
	    
	    
	}

}
