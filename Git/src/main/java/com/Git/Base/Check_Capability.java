

package com.Git.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_Capability {
	static WebDriver driver;
	DesiredCapabilities cp = new DesiredCapabilities();
	ChromeOptions op = new ChromeOptions();

	//	start-maximized: Opens Chrome in maximize mode
	//	incognito: Opens Chrome in incognito mode
	//	headless: Opens Chrome in headless mode
	//	disable-extensions: Disables existing extensions on Chrome browser
	//	disable-popup-blocking: Disables pop-ups displayed on Chrome browser
	//	make-default-browser: Makes Chrome default browser
	//	version: Prints chrome browser version
	//	disable-infobars: Prevents Chrome from displaying the notification 'Chrome is being controlled by automated software
		
	
	@BeforeTest
	public void check1()
	{
		op.addArguments("headless");
		cp.setCapability(ChromeOptions.CAPABILITY, op);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(op);
	}

	@Test
	public void  test()
	{
		driver.get("http://www.google.com");
		String Title=driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(Title, "Google");
		driver.close();
	}










}
