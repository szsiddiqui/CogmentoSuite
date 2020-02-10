package com.cogmentiSuite.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cogmentoSuite.Util.TestUtil;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	

	public void load(FileInputStream fs) {
		
	}
	public void initialization() {
		Properties prop = new Properties();
		FileInputStream fs = null;
		try {
			fs = new FileInputStream("/Saleem/eclipse-workspace/CogmentoSuite/src/main/java/com/cogmentoSuite/config/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Saleem/eclipse-workspace/CogmentoSuite/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(url);;
		
	}

}
