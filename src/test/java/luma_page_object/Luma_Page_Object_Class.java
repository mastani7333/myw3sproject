package luma_page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_Page_Object_Class 
{
	WebDriver driver;
	public Luma_Page_Object_Class (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@name='login[password]']")
	WebElement pass;
	@FindBy(xpath="//button[@class='action login primary']")
	WebElement login;
	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
	}
	public void enterPass(String password)
	{
		pass.sendKeys(password);
	}
	public void clickLogin()
	{
		login.click();
	}
	

}
