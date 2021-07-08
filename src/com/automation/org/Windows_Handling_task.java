package com.automation.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling_task {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Automation pactice\\driver2\\chromedriver.exe");
		WebDriver wind = new ChromeDriver();
		wind.manage().window().maximize();
		Actions ats2 = new Actions(wind);
		Robot rb2 = new Robot();
		JavascriptExecutor js2 = (JavascriptExecutor) wind;
		
		      //flipkart
		wind.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement serbx = wind.findElement(By.xpath("//input[@type='text']"));
		serbx.sendKeys("iphone 12");
		Thread.sleep(1000);
		WebElement serch = wind.findElement(By.xpath("//button[@type='submit']"));
		serch.click();
		Thread.sleep(3000);
		WebElement img = wind.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		img.click();
		Thread.sleep(3000);
		Set<String> pagetitle = wind.getWindowHandles();
		
		for (String titl : pagetitle) {
			System.out.println(titl);
			String curl = wind.switchTo().window(titl).getTitle();
			System.out.println(curl);	
		}
		String wintitle ="Iphone 12- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		
		for (String title : pagetitle) {
			if (wind.switchTo().window(title).equals(wintitle)) {
				break;	
				}
		}
		Thread.sleep(2000);
	    WebElement add = wind.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		add.click();
	    Thread.sleep(2000);
	    WebElement right = wind.findElement(By.xpath("//span[text()='Place Order']"));
	    ats2.moveToElement(right).build().perform();
	    ats2.contextClick(right).build().perform();
	    Thread.sleep(1000);
	    rb2.keyPress(KeyEvent.VK_DOWN);
	    rb2.keyRelease(KeyEvent.VK_DOWN);
	    rb2.keyPress(KeyEvent.VK_DOWN);
	    rb2.keyRelease(KeyEvent.VK_DOWN);
	    rb2.keyPress(KeyEvent.VK_DOWN);
	    rb2.keyRelease(KeyEvent.VK_DOWN);
	    rb2.keyPress(KeyEvent.VK_DOWN);
	    rb2.keyRelease(KeyEvent.VK_DOWN);
	    
		   //2. amazon
	/*	wind.navigate().to("https://www.amazon.in/");
		WebElement sr = wind.findElement(By.xpath("//input[@type='text']"));
		sr.sendKeys("iphone x");
		WebElement src = wind.findElement(By.xpath("//input[@type='submit']"));
		src.click();
		Thread.sleep(2000);
		WebElement phonecl = wind.findElement(By.xpath("//img[@class='s-image']"));
		phonecl.click();
		Set<String> amnext = wind.getWindowHandles();
		for (String tabid : amnext) {
			System.out.println(tabid);
			String tit = wind.switchTo().window(tabid).getTitle();
			System.out.println(tit);
		}
		Thread.sleep(2000);
		WebElement adit = wind.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		adit.click();
		Thread.sleep(4000);
		WebElement subt = wind.findElement(By.xpath("//a[@id='hlb-view-cart-announce']"));
		ats2.moveToElement(subt).build().perform();
		ats2.contextClick(subt).build().perform();
		Thread.sleep(2000);
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyRelease(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyRelease(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		String wintitle2 = "Amazon.in : iphone x";
		for (String title2: amnext) {
			if (wind.switchTo().window(title2).getTitle().equals(wintitle2)) {
				break;
			}
		}		
		Thread.sleep(2000);
		wind.close();
		*/
		     
		      //3.homedepot
		/*wind.navigate().to("https://www.homedepot.com/");
		Thread.sleep(1000);
		WebElement hserch = wind.findElement(By.xpath("//input[@class='SearchBox__input']"));
		hserch.sendKeys("ceilling fan");
		Thread.sleep(2000);
		WebElement hserchcl = wind.findElement(By.xpath("//button[@title='Submit Search']"));
		hserchcl.click();
		Thread.sleep(1000);
		WebElement himg = wind.findElement(By.xpath("//img[@class='stretchy']"));
		himg.click();
	
		Set<String> window2 = wind.getWindowHandles();
		for (String title3 : window2) {
			System.out.println(title3);
			String id3 = wind.switchTo().window(title3).getTitle();
			System.out.println(id3);
		}
		String wintitle3 = "Hugger 52 in. LED Indoor Brushed Nickel Ceiling Fan with Light Kit-AL383LED-BN - The Home Depot";
		for (String title3 : window2) {
			if (wind.switchTo().window(title3).getTitle().equals(wintitle3)) {
				break;
			}
		}
		Thread.sleep(3000);
		WebElement hadd = wind.findElement(By.xpath("(//span[@class='bttn__content'])[5]"));
		hadd.click();
		*/
		
		
		 // 4.GT
	/*	wind.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		WebElement gtcontact = wind.findElement(By.xpath("//a[text()='CONTACT US']"));
		ats2.contextClick(gtcontact).build().perform();
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyRelease(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyRelease(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_ENTER);
		rb2.keyRelease(KeyEvent.VK_ENTER);
		 Set<String> window3 = wind.getWindowHandles();
		
		for (String title4 : window3) {
			System.out.println(title4);
			String id4 = wind.switchTo().window(title4).getTitle();
			System.out.println(id4);
		}
		Thread.sleep(5000);
		WebElement omradd = wind.findElement(By.xpath("(//div[@class='address-block address-border'])[2]"));
		System.out.println(omradd.getText());

		*/
		
		//5.GT
		/*wind.navigate().to("http://www.greenstechnologys.com/oracle-training.html#sql");
		Thread.sleep(1000);
		WebElement gtclose = wind.findElement(By.xpath("//button[@class='close']"));
		gtclose.click();
		
		Thread.sleep(2000);
		WebElement interview1 = wind.findElement(By.xpath("//a[text()='Interview TestPaper 1']"));
		interview1.click();
		
		Set<String> window5 = wind.getWindowHandles();
		for (String title5 : window5) {
			System.out.println(title5);
			String id5 = wind.switchTo().window(title5).getTitle();
			System.out.println(id5);
		}
		Thread.sleep(2000);
		WebElement test1 = wind.findElement(By.xpath("//img[contains(@style,'-webkit-user-select:')]"));
		System.out.println(test1.getText());
		*/
		
		//6.GT
		/*wind.navigate().to("http://www.greenstechnologys.com/");
		WebElement gcontact = wind.findElement(By.xpath("//a[text()='CONTACT US']"));
		ats2.contextClick(gcontact).build().perform();
		Thread.sleep(1000);
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyRelease(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_DOWN);
		rb2.keyRelease(KeyEvent.VK_DOWN);
		rb2.keyPress(KeyEvent.VK_ENTER);
		rb2.keyRelease(KeyEvent.VK_ENTER);
		Set<String> window6 = wind.getWindowHandles();
		for (String title6 : window6) {
			System.out.println(title6);
			String id6 = wind.switchTo().window(title6).getTitle();
			System.out.println(id6);
		}
		Thread.sleep(3000);
		WebElement gtcours = wind.findElement(By.xpath("//a[text()='Courses ']"));
		ats2.moveToElement(gtcours).build().perform();
		Thread.sleep(1000);
		WebElement software = wind.findElement(By.xpath("//a[text()='Software Testing Training ']"));
		ats2.moveToElement(software).build().perform();
		Thread.sleep(1000);
		WebElement selnium = wind.findElement(By.xpath("//span[text()='Selenium']"));
		ats2.moveToElement(selnium).build().perform();
		Thread.sleep(1000);
		TakesScreenshot ts2 = (TakesScreenshot) wind;
		File scrn = ts2.getScreenshotAs(OutputType.FILE);
		File savescrn = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(scrn, savescrn);
		*/
		
	}
	

}
