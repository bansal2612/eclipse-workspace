package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest  {
	private WebDriver driver;
@BeforeSuite
public void beforeSuite()
{
	System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
}
@AfterSuite
public void afterSuite() {
    if(null != driver) {
    	driver.close();
        driver.quit();
        
    }
}
public WebDriver getDriver() {
    return driver;
}
}
