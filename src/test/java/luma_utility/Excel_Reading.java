package luma_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reading 
{
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException
	{
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(xlsheet);
		int rowCount=sheet.getLastRowNum();
		wb.close();
		fis.close();
		return rowCount;
	}
	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(xlsheet);
		 row=sheet.getRow(rownum);
		int cellcount=row.getLastCellNum();
		return cellcount;
		
	}
	public static String getCellData(String xlfile,String xlsheet ,int rownum,int cellnum) throws IOException
	{
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(xlsheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(cellnum);
		String data;
		try {
			DataFormatter formatter=new DataFormatter();
			String celldata=formatter.formatCellValue(cell);
			return celldata;
		}catch(Exception e)
		{
			data="";
		}
		wb.close();
		fis.close();
		return data;
		
	}
	public static void setCellData(String xlfile,String xlsheet,int rownum,int cellnum) throws IOException
	{
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(xlsheet);
		row=sheet.getRow(rownum);
		cell=row.createCell(cellnum);
		cell.setCellValue(cellnum);
		fos=new FileOutputStream(xlfile);
		wb.write(fos);
		fis.close();
		fos.close();
	}

}
