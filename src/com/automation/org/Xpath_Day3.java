package com.automation.org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Day3 {

	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace"
				+ "\\Automation pactice\\driver2\\chromedriver.exe");
		WebDriver xd3 = new ChromeDriver();
		xd3.manage().window().maximize();
		
		/*xd3.get("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		WebElement contactus = xd3.findElement(By.xpath("//a[text()='CONTACT US']"));
		contactus.click();
		WebElement gname = xd3.findElement(By.xpath("//input[@type='text']"));
		gname.sendKeys("Priyanka");
		WebElement gmail = xd3.findElement(By.xpath("//input[@type='email']"));
		gmail.sendKeys("pkpri161@gmail.com");
		WebElement gphone = xd3.findElement(By.xpath("(//input[@type='text'])[2]"));
		gphone.sendKeys("8925415776");
		WebElement gcourse = xd3.findElement(By.xpath("//select[@name='courses']"));
		gcourse.click();
		WebElement gcors = xd3.findElement(By.xpath("//option[text()='Python']"));
		gcors.click();
		WebElement gbranch = xd3.findElement(By.xpath("//select[@name='branch']"));
		gbranch.click();
		WebElement gbelect = xd3.findElement(By.xpath("//option[text()='Tambaram']"));
		gbelect.click();
		String ctrn = xd3.getCurrentUrl();
		System.out.println(ctrn);
		String ctitl = xd3.getTitle();
		System.out.println(ctitl);
		WebElement gstsrt = xd3.findElement(By.xpath("//select[@name='time']"));
		gstsrt.click();
		WebElement gstsel = xd3.findElement(By.xpath("//option[text()='In a Month']"));
		gstsel.click();
		WebElement gcmnt = xd3.findElement(By.xpath("//textarea[@name='comments']"));
		gcmnt.sendKeys("xpath task");
		
		Thread.sleep(5000);
		TakesScreenshot ts2 = (TakesScreenshot) xd3;
		File atsve = ts2.getScreenshotAs(OutputType.FILE);
		File save2 = new File("C:\\Users\\user\\eclipse-workspace"
				+ "\\Automation pactice\\Screenshot");
		FileUtils.copyFileToDirectory(atsve, save2);*/
		
		
		/*xd3.navigate().to("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement afname = xd3.findElement(By.xpath("//input[@type='text']"));
		afname.sendKeys("Priyanka");
		WebElement lstname = xd3.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
		lstname.sendKeys("Manohar");
		WebElement auadd = xd3.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		auadd.sendKeys("No.1, kamarajar salai, manali, chennai -68");
		WebElement agmail = xd3.findElement(By.xpath("//input[@type='email']"));
		agmail.sendKeys("manohardevi2521@gmail.com");
		WebElement atphone = xd3.findElement(By.xpath("//input[@type='tel']"));
		atphone.sendKeys("7550143592");
		WebElement agender = xd3.findElement(By.xpath("//input[@value='FeMale']"));
		agender.click();
		WebElement athob = xd3.findElement(By.xpath("//input[@value='Movies']"));
		athob.click();
		Thread.sleep(5000);
		WebElement atskil = xd3.findElement(By.xpath("//select[@id='Skills']"));
		atskil.click();
		WebElement atkills = xd3.findElement(By.xpath("//option[text()='QuickBooks']"));
		atkills.click();
		WebElement atcont = xd3.findElement(By.xpath("//select[@id='countries']"));
		atcont.click();
		WebElement acountr = xd3.findElement(By.xpath("//option[text()='Austria']"));
		acountr.click();
		Thread.sleep(3000);
		WebElement atyear = xd3.findElement(By.xpath("(//select[@type='text'])[3]"));
		Select yer = new Select(atyear);
		yer.selectByVisibleText("2000");
		WebElement atmonth = xd3.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select mont = new Select(atmonth);
		mont.selectByVisibleText("July");
		WebElement atdte = xd3.findElement(By.xpath("(//select[@type='text'])[5]"));
		Select atdate = new Select(atdte);
		atdate.selectByVisibleText("21");
		WebElement atpass = xd3.findElement(By.xpath("//input[@id='firstpassword']"));
		atpass.sendKeys("p6293bbvocka");
		WebElement atconfpas = xd3.findElement(By.xpath("//input[@id='secondpassword']"));
		atconfpas.sendKeys("p6293bbvocka");
		TakesScreenshot ts3 = (TakesScreenshot) xd3;
		File autosve = ts3.getScreenshotAs(OutputType.FILE);
		File automate = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(autosve, automate);
		
		WebElement atrefreh = xd3.findElement(By.xpath("//button[@id='Button1']"));
		atrefreh.click();
		Thread.sleep(5000);*/
	//	xd3.close();
		
		/*xd3.navigate().to("https://www.toolsqa.com/practice-exercise/");
		Thread.sleep(3000);
		WebElement scrldwn = xd3.findElement(By.xpath("//a[text()='Selenium Training']"));	
		JavascriptExecutor js = (JavascriptExecutor) xd3;
		js.executeScript("arguments[0].scrollIntoView();", scrldwn);
		Thread.sleep(5000);
		TakesScreenshot js5 = (TakesScreenshot) xd3;
		File scnn = js5.getScreenshotAs(OutputType.FILE);
		File toscnn = new File("C:\\Users\\user\\eclipse-workspace\\Automation pactice\\Screenshot\\img.png");
		FileUtils.copyFileToDirectory(scnn, toscnn);
		Thread.sleep(5000);
		WebElement scrlup = xd3.findElement(By.xpath("//span[text()='ABOUT']"));
		WebElement trclick = xd3.findElement(By.xpath("//span[text()='Demo Site']"));
		js.executeScript("arguments[0].scrollIntoView();",trclick);
		trclick.click();
		Thread.sleep(5000);
		WebElement fomclick = xd3.findElement(By.xpath("(//div[contains(@class,'card')])[5]"));
		fomclick.click();
		WebElement practfrm = xd3.findElement(By.xpath("//span[text()='Practice Form']"));
		practfrm.click();
		
		Thread.sleep(2000);
		String aturl = xd3.getCurrentUrl();
		System.out.println(aturl);
		String atile = xd3.getTitle();
		System.out.println(atile);
		
		Thread.sleep(5000);
		WebElement tname = xd3.findElement(By.xpath("//input[@id='firstName']"));
		tname.sendKeys("Hema");
		WebElement tlastname = xd3.findElement(By.xpath("//input[@id='lastName']"));
		tlastname.sendKeys("Priyanka");
		WebElement temail = xd3.findElement(By.xpath("//input[@id='userEmail']"));
		temail.sendKeys("pkpri161@gmail.com");
		WebElement gend = xd3.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
		gend.click();
		WebElement mobi = xd3.findElement(By.xpath("//input[@id='userNumber']"));
		mobi.sendKeys("8925415776");
		Thread.sleep(3000);
		WebElement dob = xd3.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		WebElement mon = xd3.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		mon.click();
		WebElement tmon = xd3.findElement(By.xpath("//option[text()='March']"));
		tmon.click();
		WebElement yr = xd3.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		yr.click();
		WebElement tyr = xd3.findElement(By.xpath("//option[text()='2000']"));
		tyr.click();
		WebElement dte = xd3.findElement(By.xpath("(//div[@role='option'])[19]"));
		dte.click();
		Thread.sleep(3000);
		
		WebElement hobb = xd3.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
		hobb.click();
		
		WebElement crntadd = xd3.findElement(By.xpath("//textarea[@id='currentAddress']"));
		crntadd.sendKeys("No.1,kamaraja salai, manali, chennai-68");
		*/
		
		
		
		
		
		
		
		
		
	}

}
