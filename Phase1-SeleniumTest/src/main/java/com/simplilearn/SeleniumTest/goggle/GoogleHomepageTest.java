package com.simplilearn.SeleniumTest.goggle;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


/**
 * This class demonstrate test script for seach on google search engine.
 * Selenium Webdriver
 * @author Akhila
 *
 */


public class GoogleHomepageTest {
	
	public static void main(String[] args) {

		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/windows/chromedriver.exe";

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chromedriver.driver", driverPath);

		// step3: instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();

		// step4: launch browser
		driver.get(siteUrl);

		// step5 : Evaluate the Test
		
		if(siteUrl.equals(driver.getCurrentUrl())) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		
		System.out.println("Expected Url :: " + siteUrl);
		System.out.println("Actual Url :: " + driver.getCurrentUrl());
		
		
		// step6: Close browser
		//driver.close();
	}
}


