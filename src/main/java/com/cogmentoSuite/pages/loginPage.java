package com.cogmentoSuite.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.cogmentiSuite.base.TestBase;
import com.cogmentoSuite.main.TestLogin;

public class loginPage extends TestBase {
	
	TestLogin tl = new TestLogin();
	logout logout = new logout();


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
	 */
	
	// PageFactoy PF
	
	@FindBy(xpath="//input[@name='email']") WebElement login_email ;
	
	@FindBy(xpath="//input[@name='password']") WebElement login_pwd ;
	
	@FindBy(xpath="//div[@id='ui']/div//form/div/div[.='Login']") WebElement loginbtn ;
	
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	

	
	
	
	@Test
	public void userLogin() {

		tl.loginTest();
		System.out.println("I am here at stage: 2");
		//loginPage.this.login_email.sendKeys("szsiddiqui@yahoo.com");

		login_email.sendKeys("szsiddiqui@yahoo.com");
		login_pwd.sendKeys("BusyQA12345");
		loginbtn.click();
		System.out.println("I am here at stage: 3");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logout.logoutSite();
		logout.tearDown();
		
	}
	
}
