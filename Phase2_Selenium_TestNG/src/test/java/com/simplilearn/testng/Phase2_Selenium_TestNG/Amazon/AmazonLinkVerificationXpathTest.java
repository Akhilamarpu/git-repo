package com.simplilearn.testng.Phase2_Selenium_TestNG.Amazon;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonLinkVerificationXpathTest {

	WebDriver driver;
	WebDriverWait wait;
	String siteurl="https://www.amazon.in";
	String driverpath="drivers/windows/geckodriver.exe";
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.get(siteurl);
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
	}
	@AfterMethod
	public void close() {
		driver.quit();
	}
	@Test(description = "Test Amazon Mobile Phones Title Match")
	public void xpathLinkTest1() throws InterruptedException {
		WebElement mobileLink = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));

		System.out.println("Is link loaded :: " + mobileLink.isDisplayed());
		System.out.println("Is link is enabled :: " + mobileLink.isEnabled());

		mobileLink.click();

		String expectedTitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}

	@Test(description = "Test Today deals Title Match")
	public void xpathLinkTest2() throws InterruptedException {
		WebElement tdLink = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[5]"));

		System.out.println("Is link loaded :: " + tdLink.isDisplayed());
		System.out.println("Is link is enabled :: " + tdLink.isEnabled());

		tdLink.click();

		String expectedTitle = "Amazon.in - Deals";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}
}
