package login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@value='Log In']")
	WebElement Submit;
	
	public void loginFBMethod(String uid,String pwd)
	{
		username.sendKeys(uid);
		password.sendKeys(pwd);
		Submit.click();
	}

}
