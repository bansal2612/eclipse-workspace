package rbs;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebElement;
public class BasicProg1 {
	public static WebDriver driver;
	int res=200;
	HttpURLConnection huc=null;
	String url="";
	@BeforeMethod
	public void driverInitialize() throws TimeoutException, InterruptedException
	{
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1.exe");
		//driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/p/lightbox.html");
		/*
		 * Thread.sleep(3000); List<WebElement> ls=driver.findElements(By.tagName("a"));
		 * System.out.println("Number of links present is: " + ls.size()) ;
		 * Iterator<WebElement> it=ls.iterator(); while(it.hasNext()) {
		 * url=it.next().getAttribute("href"); System.out.println(url); if(url == null
		 * || url.isEmpty()){ System.out.
		 * println("URL is either not configured for anchor tag or it is empty");
		 * continue; } try { huc = (HttpURLConnection)(new URL(url).openConnection());
		 * huc.setRequestMethod("HEAD"); huc.connect(); res=huc.getResponseCode();
		 * if(res>=400) { System.out.println("Broken link"); } else{
		 * System.out.println(url+" is a valid link"); } } catch (MalformedURLException
		 * e) { // TODO: handle exception System.out.println(e.getMessage()); } catch
		 * (IOException e) { // TODO: handle exception
		 * System.out.println(e.getMessage()); } }
		 */
		
	}
	@Test11
	public void abc() 
	{
		driver.findElement(By.id("lightbox1")).click();
		driver.findElement(By.xpath("//*[@id='myModal']/span")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//a[text()=' Selenium143 ']")).isDisplayed(), true);
	}
	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}
}

