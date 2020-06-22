package testINT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.testNG.Utility;

import jdk.jfr.internal.Logger;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExtentHtmlReporter extentHTMLReporter;
	public static ExtentReports extentReports;
	public static ExtentTest Logger;
	@BeforeMethod
	@Parameters("browser")
	public void driverInst(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Birlasoft\\QLab\\SeSirvaAutFinal\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\python\\drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		extentHTMLReporter=new ExtentHtmlReporter("./Reports/learnAutomation.html");
		extentReports=new ExtentReports();
		extentReports.attachReporter(extentHTMLReporter);
		Logger=extentReports.createTest("Start the Test case");
		
	}
	@Test
	public void getTest()
	{
		Logger.log(Status.INFO, "Opening the URL");
		driver.get("http://www.google.com");
		Assert.assertTrue(false);
		Logger.log(Status.PASS, "URL is opened");
		
	}
	@AfterMethod()
	public void afterTest(ITestResult testResult) throws IOException
	{
		if(ITestResult.FAILURE==testResult.getStatus())
		{
			String path=Utility.takeScreenShot(driver, testResult.getName());
			Logger.fail(testResult.getThrowable().getMessage());
			Logger.addScreenCaptureFromPath(path);
		}
		extentReports.flush();
		driver.quit();
		
	}
}
