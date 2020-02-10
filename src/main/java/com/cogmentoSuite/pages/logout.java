package com.cogmentoSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cogmentiSuite.base.TestBase;
import com.cogmentoSuite.Util.TestUtil;

public class logout {
	
	TestBase tb = new TestBase();
	
	
	public void logoutSite() {
		
		WebElement signout1 = TestBase.driver.findElement(By.xpath("//div[@id='top-header-menu']//div[@role='listbox']/i")); 
		signout1.click();
		TestUtil.sleep(2000);
		TestBase.driver.findElement(By.xpath("//span[.='Log Out']")).click();
		TestUtil.sleep(2000);			  
	}
	
	public void tearDown() {
		TestBase.driver.quit();
	}

}
