package cyclos_testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass
{
	public static WebDriver driver;
	@BeforeClass
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}
//	@AfterClass
//	public void closeApp()
//	{
//		driver.close();
//	}
	
}
