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
 
public class Sceenhot_cl {

	public static void main(String[] args)
			throws IOException, Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace"
				+ "\\Automation pactice\\Driver\\chromedriver.exe");
		WebDriver screen =new ChromeDriver();
		screen.get("https://www.pexels.com/");
		screen.manage().window().maximize();
		
		                                                            
/*TakesScreenshot ts = (TakesScreenshot) screen;
		ts.getScreenshotAs(OutputType.FILE);
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		File screensv = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice"
				+ "\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(source, screensv);*/
	
		screen.navigate().to("https://unsplash.com/");
        WebElement advcl = screen.findElement(By.xpath("//button[@id='details-button']"));
        advcl.click();
        WebElement advok = screen.findElement(By.xpath("//a[text()='Proceed to unsplash.com (unsafe)']"));
        advok.click();
        WebElement searchun = screen.findElement(By.xpath("//input[@type='search']"));
        searchun.sendKeys("husky");
        WebElement seach = screen.findElement(By.xpath("//button[contains(@title,'Search Unsplash')]"));
        seach.click();
        Thread.sleep(7000);
        TakesScreenshot ts1 = (TakesScreenshot) screen;
        File stre = ts1.getScreenshotAs(OutputType.FILE);
        
        File tosve = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
        FileUtils.copyFileToDirectory(stre, tosve);
        
        
        String cnturl = screen.getCurrentUrl();
		System.out.println(cnturl);
		String cntitle = screen.getTitle();
		System.out.println(cntitle);
		
		

	}

}
