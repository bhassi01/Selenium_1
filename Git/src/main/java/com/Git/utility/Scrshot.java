package com.Git.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Git.Base.BaseTest;

public class Scrshot extends BaseTest{
	
	public void TakeScreenshot(String methodname) {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile= new File ("C:\\Users\\Ad\\git\\Selenium_1\\Git\\src\\main\\java\\com\\Git\\utility\\Failed_Screenshots_"+methodname+"_" +".jpg");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
