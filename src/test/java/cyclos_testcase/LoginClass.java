package cyclos_testcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import cyclos_page_object.Login_page_object_class;

public class LoginClass extends BaseClass 
{
	@Test
	public void loginstep()
	{
	Login_page_object_class lp=new Login_page_object_class(driver);
	lp.clickLogin();
	lp.setUserName("demo");
	lp.setPassword("1234");
	lp.Clicksumbit();
	}
			
}
