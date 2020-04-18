package com.Git.Base;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 public static  WebDriver driver;
	 static Properties prop;

	public BaseTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"E:\\softwares\\eclipse\\Git\\src\\main\\java\\com\\Git\\config\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}}

	public void initialisation() {

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));


	}
}
