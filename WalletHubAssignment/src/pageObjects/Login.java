package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.BasePage;

public class Login extends BasePage {
	
	@FindBy(name="email")
	WebElement userName;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(id="u_0_b")
	WebElement LoginButton;

	public Login(WebDriver driver) {
		super(driver);
	
	}
	
	public void setUNandPWD(String UN, String PWD)
	{
		userName.sendKeys(UN);
		password.sendKeys(PWD);
	}
	public void clickLogin()
	{
	LoginButton.click();	
	}
	

}
