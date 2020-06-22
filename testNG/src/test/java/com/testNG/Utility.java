package com.testNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	
	public static String takeScreenShot(WebDriver driver, String ScreenshotName)
	{
		String path =System.getProperty("user.dir") + "\\Reports\\ScreenShots\\" + ScreenshotName + System.currentTimeMillis() + ".png";
		try  {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File f=ts.getScreenshotAs(OutputType.FILE);			
			File dest=new File(path);
			FileUtils.copyFile(f, dest);
			System.out.println("Screenshot taken");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Screenshot not taken" + e.getMessage());
		}
		return path;
		
	}
}
