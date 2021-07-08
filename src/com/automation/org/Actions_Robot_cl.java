package com.automation.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Robot_cl {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Automation pactice\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement dntchnge = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		dntchnge.click();
		Thread.sleep(3000);
		
		WebElement bestselr = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
		Actions acn = new Actions(driver);
		acn.contextClick(bestselr).build().perform();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement cs = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		acn.contextClick(cs).build().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement gft = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		acn.contextClick(gft).build().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement reg = driver.findElement(By.xpath("//a[text()='Registry']"));
	   acn.contextClick(reg).build().perform();
	   rb.keyPress(KeyEvent.VK_DOWN);
	   rb.keyRelease(KeyEvent.VK_DOWN);
	   Thread.sleep(1000);
	   rb.keyPress(KeyEvent.VK_ENTER);
	   rb.keyRelease(KeyEvent.VK_ENTER);
	   Thread.sleep(2000);
	 
		WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
		acn.contextClick(sell).build().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement amcov = driver.findElement(By.xpath(" //a[@id='swm-link']"));
		acn.contextClick(amcov).build().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File amsve = ts.getScreenshotAs(OutputType.FILE);
	    File saveto = new File("C:\\Users\\user\\eclipse-workspace"
	    		+ "\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(amsve, saveto);
		
		
		
		
		
		
		
		
		
		
		
	}

}
