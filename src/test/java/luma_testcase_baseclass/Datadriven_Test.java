package luma_testcase_baseclass;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import luma_page_object.Luma_Page_Object_Class;
import luma_utility.Excel_Reading;

public class Datadriven_Test extends Luma_BaseClass
{
	@Test(dataProvider="sample1122")
	public void dataDrivenTest(String mail11,String pass11)
	{
	Luma_Page_Object_Class luma=new Luma_Page_Object_Class (driver);
	luma.enterEmail(mail11);
	luma.enterPass(pass11);
	luma.clickLogin();
	}
	@DataProvider(name="sample1122")
	String [][] getData() throws IOException{
		
		String path="D:\\testng workspace\\Luma\\src\\test\\java\\teastdata\\sample1122.xlsx";
		
		//it is identify the rowcount
		int rownum =Excel_Reading.getRowCount(path, "Sheet1");
		//identify the colcount
		int colcount=Excel_Reading.getCellCount(path,"Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {//it is represents rows
			
			for(int j=0;j<colcount;j++) {//it is represents the columns
				
				logindata[i-1][j]=Excel_Reading.getCellData(path, "Sheet1", i, j);//1,0
			}
			
		}
		return logindata;
	}

}
