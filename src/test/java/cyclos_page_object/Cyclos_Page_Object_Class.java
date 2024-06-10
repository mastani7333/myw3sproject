package cyclos_page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cyclos_Page_Object_Class
{
	WebDriver driver;
	
	public Cyclos_Page_Object_Class(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='register-link']")
	WebElement registerlink;
	//@FindBy(id="id_1")
	@FindBy(xpath="//input-field//div//input[@class='form-control w-100 ng-pristine ng-invalid ng-touched']")
	WebElement name;
	//@FindBy(id="2")
	@FindBy(xpath="//input-field//div//input[@class='form-control w-100 ng-untouched ng-pristine ng-invalid']")
	WebElement loginame;
	//@FindBy(id="id_3")
	@FindBy(xpath="//label-value//div//div//input-field//input[@class='form-control w-100 ng-untouched ng-pristine ng-invalid']")
	WebElement email;
//@FindBy(xpath="//url-field//input[@class='form-control w-100 ng-untouched ng-pristine ng-valid']")
//	WebElement website;
	@FindBy(xpath="//label[text()=' Female ']")
	WebElement radio;
//	@FindBy(xpath="//button[@id='business_type']")
//	WebElement select1;
//	Select sc= new Select(select1);
    @FindBy(xpath="//span[text()='Next']")
	WebElement nextbutton;
	@FindBy(xpath="//input-field//label-value//div//div//input[@class='form-control w-100 ng-pristine ng-invalid ng-touched']")
	WebElement pass;
	@FindBy(xpath="//input-field//label-value//div//div//input[@class='form-control w-100 ng-untouched ng-pristine ng-invalid']")
	WebElement cnfrmpass;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	@FindBy(xpath="//span[text()='Submit']")
	WebElement button;
	
			
	
	public void clickLink()
	{
		registerlink.click();
	}
	public void enterName(String name1)
	{
		name.sendKeys(name1);
	}
	public void enterLoginname(String logname)
	{
		loginame.sendKeys(logname);
	}
	public void enterMail(String mail)
	{
		email.sendKeys(mail);
	}
//	public void entersite(String site)
//	{
//		website.sendKeys(site);
//	}
	public void clickRadio()
	{
		radio.click();
	}
//	public void selectList()
//	{
//		select1.click();
//		sc.selectByVisibleText(" Furniture ");
//	}
	
	public void clicknext()
	{
		nextbutton.click();
	}
	public void EnterPass(String password)
	{
		pass.sendKeys(password);
	}
	public void cnfrmPassw(String conform)
	{
		cnfrmpass.sendKeys(conform);
	}
	public void clickCheckbox()
	{
		checkbox.click();
	}
	public void clickSubmit()
	{
		button.click();
	}
	

}
