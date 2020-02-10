package com.cogmentoSuite.main;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import com.cogmentiSuite.base.TestBase;

public class TestLogin {
	//@Test(priority = -1)
	TestBase tb = new TestBase();
	
	public void loginTest() {
		
		tb.initialization();
		
		
		System.out.println("System is going to Login on congmento site...");
		
			
		
		  
		/*
		 * WebElement username =
		 * TestBase.driver.findElement(By.xpath("//input[@name='email']"));
		 * username.sendKeys("szsiddiqui@yahoo.com"); sleep(3000);
		 * 
		 * 
		 * WebElement pwd =
		 * TestBase.driver.findElement(By.xpath("//input[@name='password']"));
		 * pwd.sendKeys("BusyQA12345"); sleep(3000);
		 * 
		 * WebElement loginbtn = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='ui']/div//form/div/div[.='Login']")); loginbtn.click();
		 * 
		 * sleep(4000);
		 */
		 /*
		 * WebElement home =
		 * TestBase.driver.findElement(By.xpath("//div[@id='main-nav']/a[@href='/home']"
		 * )); home.click(); sleep(3000);
		 * 
		 * WebElement calendar = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/calendar']")); calendar.click();
		 * sleep(3000);
		 */
		
		/*
		 * WebElement contacts = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/contacts']")); contacts.click();
		 * sleep(3000);
		 * 
		 * WebElement companies = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/companies']")); companies.click();
		 * sleep(3000);
		 * 
		 * WebElement deals = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/deals']")); deals.click(); sleep(3000);
		 * 
		 * WebElement tasks = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/tasks']")); tasks.click(); sleep(3000);
		 * 
		 * WebElement cases = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/cases']")); cases.click(); sleep(3000);
		 * 
		 * WebElement calls = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/calls']")); calls.click(); sleep(3000);
		 * 
		 * WebElement documents = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/documents']")); documents.click();
		 * sleep(3000);
		 * 
		 * WebElement email = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/email']")); email.click(); sleep(3000);
		 * 
		 * WebElement campaigns = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/campaigns']")); campaigns.click();
		 * sleep(3000);
		 * 
		 * WebElement forms = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='main-nav']/a[@href='/forms']")); forms.click(); sleep(3000);
		 * 
		 */
		/*
		 * WebElement signout1 = TestBase.driver.findElement(By.xpath(
		 * "//div[@id='top-header-menu']//div[@role='listbox']/i")); signout1.click();
		 * sleep(2000);
		 * 
		 * 
		 * TestBase.driver.findElement(By.xpath("//span[.='Log Out']")).click();
		 * sleep(2000);
		 * 
		 * TestBase.driver.quit();
		 */
		
		System.out.println("I am here...");
	}

	public void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void tearDown() {
		TestBase.driver.quit();
	}

}
