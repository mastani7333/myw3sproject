package luma_testcase_baseclass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import luma_utility.Reading_Data;

public class Luma_BaseClass 
{
	Reading_Data rd=new Reading_Data ();
	String URL=rd.getUrl();
	String email1=rd.getmail();
	String pass1=rd.getpass();
	public static WebDriver driver;
	@BeforeClass
	public void openApp()
	{
	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);

		

	}

}
