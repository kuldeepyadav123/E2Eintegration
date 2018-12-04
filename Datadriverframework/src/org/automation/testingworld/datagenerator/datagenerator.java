package org.automation.testingworld.datagenerator;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class datagenerator {
	@DataProvider(name="Excel")
	public static  Object[][] testDataGenerator() throws IOException
	{
		FileInputStream file = new FileInputStream(".//TestData//testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet loginsheet = workbook.getSheet("login");
		int numberofData = loginsheet.getPhysicalNumberOfRows();
		Object[][] testdata = new Object[numberofData][2];
		
		for (int i=0;i<numberofData;i++)
			
		{
			XSSFRow row = loginsheet.getRow(i);
		    XSSFCell username = row.getCell(0);
		    XSSFCell password = row.getCell(1);
		    testdata [i][0]=username.getStringCellValue();
		    testdata [i][1]= password.getStringCellValue();
		    
		}
		return testdata;
	}

}



