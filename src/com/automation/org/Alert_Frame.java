package com.automation.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert_Frame {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace"
				+ "\\Automation pactice\\driver2\\chromedriver.exe");
		 
		WebDriver alt = new ChromeDriver();
		alt.manage().window().maximize();
		alt.navigate().to("https://www.google.com/");
		
		/*alt.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement gclk = alt.findElement(By.name("login_page"));
		alt.switchTo().frame(gclk);
		WebElement log = alt.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		log.sendKeys("pri1612j");
		alt.switchTo().parentFrame();
		Thread.sleep(3000);
		
		TakesScreenshot hdf = (TakesScreenshot) alt;
		File logpg = hdf.getScreenshotAs(OutputType.FILE);
		File logsave = new  File("C:\\Users\\user\\eclipse-workspace"
				+ "\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(logpg, logsave);
		*/
			
	/*	alt.navigate().to("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		WebElement adv = alt.findElement(By.xpath("//button[@id='details-button']"));
		adv.click();
		WebElement pro = alt.findElement(By.xpath("//a[@id='proceed-link']"));
		pro.click();
		Thread.sleep(2000);
		WebElement name = alt.findElement(By.id("fldLoginUserId"));
		name.sendKeys("Priyanka");
		WebElement cpas = alt.findElement(By.xpath("//input[@type='password']"));
		cpas.sendKeys("82nbveu66hfvh");
		WebElement ref = alt.findElement(By.xpath("//img[@title='Refresh']"));
		ref.click();
		Thread.sleep(3000);
		WebElement clan = alt.findElement(By.xpath("//select[@id='fldlanguage']"));
		Select calan = new Select(clan);
		calan.selectByVisibleText("Marathi");
		WebElement chek = alt.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		chek.click();
		Thread.sleep(3000);
		TakesScreenshot canara = (TakesScreenshot) alt;
		File autosve = canara.getScreenshotAs(OutputType.FILE);
		File savein = new File("C:\\Users\\user\\eclipse-workspace"
				+ "\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(autosve, savein);
		
		Thread.sleep(2000);
		WebElement litver = alt.findElement(By.xpath("//a[@class='nw-user']"));
		litver.click();
	*/
		
		/*alt.navigate().to("https://retail.onlinesbi.com/retail/login.htm");
		WebElement advv = alt.findElement(By.xpath("(//button[contains(@class,'secondary-button')])[2]"));
		advv.click();
		WebElement prr = alt.findElement(By.xpath("(//a[@href='#'])[5]"));
		prr.click();
		WebElement con = alt.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']"));
		con.click();
		*/
		
		
		
		
	}

}
