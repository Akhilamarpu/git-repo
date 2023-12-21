package com.simplilearn.SeleniumTest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


/**
 * This class demonstrate Lauch FireFox Test.
 * Selenium Webdriver
 * @author Akhila
 *
 */

public class LauchChromeTest {
public static void main(String[] args) {
		
		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.google.com/";
		String driverPath = "Drivers/windows/chromedriver.exe";
		
		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// step3: instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		
		// step4: launch browser
		driver.get(siteUrl);
		
		// step5 : Evaluate the Test
		
		// step6: Close browser
		driver.close();
	}

}

