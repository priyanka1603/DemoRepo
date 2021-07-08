package com.automation.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screenshot_Scrollupdown {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace"
				+ "\\Automation pactice\\driver2\\chromedriver.exe");
		WebDriver scrnup = new ChromeDriver();
		scrnup.manage().window().maximize();
		//scrnup.get("https://www.google.com/search");
		WebElement search = scrnup.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("selenium training in chennai");
		Thread.sleep(3000);
		WebElement srclick = scrnup.findElement(By.xpath("//span[text()='selenium training in chennai']"));
		srclick.click();
		WebElement gtlink = scrnup.findElement(By.xpath("(//cite[contains(@class,'iUh30')])[3]"));
		gtlink.click();
		Thread.sleep(2000);
		WebElement course = scrnup.findElement(By.xpath("(//a[@data-toggle='modal'])[28]"));
		course.click();
		String cturl = scrnup.getCurrentUrl();
		System.out.println(cturl);
		String cttitle = scrnup.getTitle();
		System.out.println(cttitle);
		
		Thread.sleep(5000);
		WebElement up16 = scrnup.findElement(By.xpath("//p[text()='16.Daily work']"));
		JavascriptExecutor q16 = (JavascriptExecutor) scrnup;
		q16.executeScript("arguments[0].scrollIntoView();",up16 );
		
		TakesScreenshot ctsq = (TakesScreenshot) scrnup;
		File cts = ctsq.getScreenshotAs(OutputType.FILE);
		File que16 = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(cts, que16);
		
	    WebElement word = scrnup.findElement(By.xpath("(//div[@class='modal-body'])[29]"));
		System.out.println(scrnup.findElement(By.xpath("//p[text()='9. How good you are in java']")).getText());
		
		
		scrnup.navigate().to("https://www.cleartrip.com/register");
		WebElement reamil = scrnup.findElement(By.xpath("//input[@name='username1']"));
		reamil.sendKeys("priynaka161@gmail.com");
		System.out.println("priynaka161@gmail.com");
		System.out.println(scrnup.findElement(By.xpath("//dd[@class='hint']")).getText());
		
		
		/*scrnup.navigate().to("https://www.google.com/search");
		WebElement ser = scrnup.findElement(By.xpath("//input[@name='q']"));
		ser.sendKeys("Green technology"); 
		Thread.sleep(2000);
		WebElement sercl = scrnup.findElement(By.xpath("//span[text()='green technology']")); 
		sercl.click();
	    WebElement gtcl = scrnup.findElement(By.xpath("//span[text()='View all']")); 
		gtcl.click();
		Thread.sleep(3000);
		WebElement dgtcli = scrnup.findElement(By.xpath("(//div[@class='cXedhc'])[4]"));
		dgtcli.click(); 
		Thread.sleep(3000);
		WebElement gt = scrnup.findElement(By.xpath("(//a[@jsname='kj0dLd'])[4]"));
		gt.click();
		Thread.sleep(3000);
		
		WebElement mgt = scrnup.findElement(By.xpath("//span[text()='More Google reviews']"));
		mgt.click(); Thread.sleep(3000);
	    WebElement dwn = scrnup.findElement(By.xpath("(//span[@jscontroller='P7L8k'])[4]"));
		JavascriptExecutor j6 = (JavascriptExecutor) scrnup;
		j6.executeScript("arguments[0].scrollIntoView();", dwn);
		TakesScreenshot t6 = (TakesScreenshot) scrnup;
		File gtrew = t6.getScreenshotAs(OutputType.FILE);
		File sdwnrew = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice"
				+ "\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(gtrew, sdwnrew);
		*/
		
		
		/*scrnup.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		WebElement jobopenings = scrnup.findElement(By.xpath("//p[text()='Job Openings']"));
		Thread.sleep(2000);
		JavascriptExecutor jp = (JavascriptExecutor) scrnup;
		jp.executeScript("arguments[0].scrollIntoView();", jobopenings);
		Thread.sleep(3000);
		TakesScreenshot job = (TakesScreenshot) scrnup;
		File jobopen = job.getScreenshotAs(OutputType.FILE);
        File jobsave = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(jobopen, jobsave);
		*/
		
		/*scrnup.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		WebElement traini = scrnup.findElement(By.xpath("//b[text()='Best Selenium training institute in Adyar']"));
		JavascriptExecutor trai = (JavascriptExecutor) scrnup;
		trai.executeScript("arguments[0].scrollIntoView();", traini);
		Thread.sleep(2000);
		TakesScreenshot adyar = (TakesScreenshot) scrnup;
	    File seli = adyar.getScreenshotAs(OutputType.FILE);
	    File adyartrai = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
	    FileUtils.copyFileToDirectory(seli, adyartrai);
	    WebElement htc = scrnup.findElement(By.xpath("//a[@data-target='#interview28']")); 
	    JavascriptExecutor htcgl = (JavascriptExecutor) scrnup;
	    htcgl.executeScript("arguments[0].scrollIntoView();", htc);
	    htc.click();
	    Thread.sleep(2000);
	    WebElement htq = scrnup.findElement(By.xpath("//p[text()='Agile?']"));
	    JavascriptExecutor htques = (JavascriptExecutor) scrnup;
	    htques.executeScript("arguments[0].scrollIntoView();", htq);
	    Thread.sleep(3000);
	    TakesScreenshot ht = (TakesScreenshot) scrnup;
	    File htserv = ht.getScreenshotAs(OutputType.FILE);
	    File global = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot");
		FileUtils.copyFileToDirectory(htserv, global);*/
		
		/*scrnup.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		WebElement tp = scrnup.findElement(By.xpath("//a[@data-target='#test-paper-6']"));
		tp.click();
		Thread.sleep(2000);
		WebElement tak2 = scrnup.findElement(By.xpath("(//strong[text()='Task 2:'])[5]"));
		JavascriptExecutor t2 = (JavascriptExecutor) scrnup;
		t2.executeScript("arguments[0].scrollIntoView();", tak2);
		Thread.sleep(1000);
		TakesScreenshot task = (TakesScreenshot) scrnup;
		File ts2 = task.getScreenshotAs(OutputType.FILE);
		File t2sve = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(ts2, t2sve);
		*/
		
		/*scrnup.navigate().to("https://www.flipkart.com/");
		WebElement closebx = scrnup.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closebx.click();
		WebElement serbx = scrnup.findElement(By.xpath("//input[@type='text']"));
		serbx.sendKeys("iphone 12 pro max");
		WebElement srclick = scrnup.findElement(By.xpath("//button[@type='submit']"));
		srclick.click();
		Thread.sleep(2000);
		WebElement apple = scrnup.findElement(By.xpath("//div[@class='_2kHMtA']"));
		apple.click();
		Thread.sleep(5000);
		TakesScreenshot aple = (TakesScreenshot) scrnup;
		File scapl = aple.getScreenshotAs(OutputType.FILE);
		File saveapl = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\imp.png");
		FileUtils.copyFileToDirectory(scapl, saveapl);
		*/
		
		/*scrnup.navigate().to("https://www.amazon.in/");
		WebElement amserc = scrnup.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		amserc.sendKeys("motorola");
		WebElement amser = scrnup.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		amser.click();
		WebElement mclk = scrnup.findElement(By.xpath("(//span[contains(@class,'a-size-medium')])[4]"));
		mclk.click();
		Thread.sleep(5000);
		TakesScreenshot scmot = (TakesScreenshot) scrnup;
		File srnmot = scmot.getScreenshotAs(OutputType.FILE);
		File savemot = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(srnmot, savemot);*/
		
		/*scrnup.navigate().to("https://www.flipkart.com/");
		WebElement closeb = scrnup.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeb.click();
		WebElement ipmini = scrnup.findElement(By.xpath("//input[@type='text']"));
		ipmini.sendKeys("iphone 12 mini");
		WebElement flser = scrnup.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		flser.click();
		Thread.sleep(3000);
		TakesScreenshot purp = (TakesScreenshot) scrnup;
		File purple = purp.getScreenshotAs(OutputType.FILE);
		File prsave = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(purple, prsave);
		Thread.sleep(3000);
		WebElement phpurple = scrnup.findElement(By.xpath("//div[@class='_4rR01T']"));
		phpurple.click();
		*/
		
		/*scrnup.navigate().to("https://www.snapdeal.com/");
		WebElement hptyp = scrnup.findElement(By.xpath("//input[@name='keyword']"));
		hptyp.sendKeys("hp laptop");
		WebElement snser = scrnup.findElement(By.xpath("//button[contains(@class,'searchformButton')]"));
		snser.click();
		WebElement lapcl = scrnup.findElement(By.xpath("//a[text()='laptops']"));
		lapcl.click();
		Thread.sleep(3000);
		TakesScreenshot lap = (TakesScreenshot) scrnup;
		File lapsrc = lap.getScreenshotAs(OutputType.FILE);
		File lapsve = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(lapsrc, lapsve);
		*/
		
		/*scrnup.navigate().to("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		xWebElement advcll = scrnup.findElement(By.xpath("//button[@id='details-button']"));
		advcll.click();
		WebElement proceed = scrnup.findElement(By.xpath("//a[@id='proceed-link']"));
		proceed.click();
		WebElement alet1 = scrnup.findElement(By.xpath("//button[@id='alertButton']"));
		alet1.click();
		Thread.sleep(2000);
		scrnup.switchTo().alert().accept();
		
		WebElement alert2 = scrnup.findElement(By.xpath("//button[@id='timerAlertButton']"));
		alert2.click();
		Thread.sleep(7000);
		scrnup.switchTo().alert().accept();
		
		WebElement alert3 = scrnup.findElement(By.xpath("//button[@id='confirmButton']"));
		alert3.click();
		Thread.sleep(2000);
		scrnup.switchTo().alert().dismiss();
		
		WebElement alert4 = scrnup.findElement(By.xpath("//button[@id='promtButton']"));
		alert4.click();
		Thread.sleep(2000);
		scrnup.switchTo().alert().sendKeys("Priyanka");
		scrnup.switchTo().alert().accept();
		
		Thread.sleep(5000);
		TakesScreenshot alerts = (TakesScreenshot) scrnup;
		File altrr = alerts.getScreenshotAs(OutputType.FILE);
		File savealert = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(altrr, savealert);*/
		
		/*scrnup.navigate().to(" https://www.lvbank.com/search.aspx?zoom_query=");
		WebElement gto = scrnup.findElement(By.xpath("//a[text()='Go to Homepage']"));
		Thread.sleep(5000);
		scrnup.switchTo().alert().accept();
		*/
		
		
		
		
		
		
		
	}

}
