package luma_utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Reading_Data 
{
	Properties pro;
	public Reading_Data( )
	{
		File f=new File("D:\\testng workspace\\Luma\\configuration\\data.properties");
		try {
			FileInputStream fs=new  FileInputStream(f);
			pro=new Properties();
			pro.load(fs);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String getUrl()
	{
		String URl=pro.getProperty("appurl");
		return URl;
	}
	public String getmail()
	{
		String mail=pro.getProperty("email");
		return mail;
	}
	public String getpass()
	{
		String pass=pro.getProperty("password");
		return pass;
	}

}
