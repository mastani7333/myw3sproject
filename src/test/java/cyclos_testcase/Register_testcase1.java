package cyclos_testcase;

import org.testng.annotations.Test;

import cyclos_page_object.Cyclos_Page_Object_Class;

public class Register_testcase1 extends BaseClass 
{
	@Test
	public void test() throws InterruptedException
	{
	Cyclos_Page_Object_Class cb=new Cyclos_Page_Object_Class(driver);
	cb.clickLink();
	Thread.sleep(2000);
	cb.enterName("mastani");
	//Thread.sleep(2000);
	cb.enterLoginname("shaikmastani");
	cb.enterMail("shaiksyedm1313@gmail.com");
	cb.clickRadio();
	//Thread.sleep(2000);
	cb.clicknext();
	//Thread.sleep(2000);
	cb.EnterPass("Mastan1234");
	//Thread.sleep(2000);
	cb.cnfrmPassw("Mastan1234");
	//Thread.sleep(2000);
	cb.clickCheckbox();
	//Thread.sleep(2000);
	cb.clickSubmit();
	}
	
	
	

}
