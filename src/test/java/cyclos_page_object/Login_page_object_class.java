package cyclos_page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_object_class 
{ 
	WebDriver driver;
	public  Login_page_object_class (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='login-link']")
	WebElement loginlink;
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	@FindBy(xpath="//input[@type='password']")
	WebElement pass;
	@FindBy(xpath="//action-button[@actionkind='primary']")
	WebElement button;
	public void clickLogin()
	{
		loginlink.click();
	}
	public void setUserName(String uname)
	{
		username.sendKeys(uname);
		
	}
	public void setPassword(String passw)
	{
		pass.sendKeys(passw);
	}
	public void Clicksumbit()
	{
		button.click();
	}
}
