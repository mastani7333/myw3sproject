package luma_testcase_baseclass;

import org.testng.annotations.Test;

import luma_page_object.Luma_Page_Object_Class;

public class Luma_Login_testCase extends Luma_BaseClass 
{
	@Test
	public void test() throws InterruptedException
	{
	Luma_Page_Object_Class luma=new Luma_Page_Object_Class (driver);
	luma.enterEmail(email1);
	Thread.sleep(2000);
	luma.enterPass(pass1);
	Thread.sleep(2000);
	luma.clickLogin();
	}
	

}
