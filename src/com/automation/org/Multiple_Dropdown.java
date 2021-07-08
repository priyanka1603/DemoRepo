package com.automation.org;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown  {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Automation pactice\\driver2\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.seleniumeasy.com/test/");
		WebElement adv = drive.findElement(By.xpath("//button[@id='details-button']"));
		adv.click();
		WebElement proceed = drive.findElement(By.xpath("//a[@id='proceed-link']"));
		proceed.click();
		Thread.sleep(2000);
		WebElement close = drive.findElement(By.xpath("//a[@title='Close']"));
		close.click();
		WebElement inputform = drive.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	    inputform.click();
		WebElement slec = drive.findElement(By.xpath("//a[text()='Select Dropdown List']"));
		slec.click();
		Thread.sleep(1500);
		WebElement selecdemo = drive.findElement(By.xpath("//select[@id='select-demo']"));
		Select sl = new Select(selecdemo);
		sl.selectByVisibleText("Wednesday");
		WebElement multi = drive.findElement(By.xpath("//select[@id='multi-select']"));
		Select sl2 = new Select(multi);
		boolean multiple = sl2.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> option = sl2.getOptions();
		for (WebElement optionlist : option) {
		String text = optionlist.getText();
		System.out.println(text);
		}
		int size = option.size();
		System.out.println(size);
        
		for (int i = 0; i < size ; i++) {
			if (i == 3 || i == 6 || i == 7) {
				sl2.selectByIndex(i);
			}
		}
		List<WebElement> selected = sl2.getAllSelectedOptions();
		for (WebElement for2 : selected) {
			String onlyselect = for2.getText();
			System.out.println(onlyselect);
		}
		
		WebElement firstsel = sl2.getFirstSelectedOption();
		System.out.println(firstsel.getText());
		
		
		
		
		
	}

}
