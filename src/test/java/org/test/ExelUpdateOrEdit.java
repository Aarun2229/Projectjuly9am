package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelUpdateOrEdit
{
	public static void main(String[] args) throws IOException
	{
		File location = new File("C:\\Users\\user\\eclipse-workspace\\MavenProjectP\\ExelWrite\\Data1.xlsx");
		FileInputStream stream = new FileInputStream(location);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Book1");
		Row r = s.getRow(0);
		Cell c =r.getCell(0);
		String value = c.getStringCellValue();
		if(value.equals("SusanthSingRajput"))
		{
			c.setCellValue("MSD 007");
		}
		FileOutputStream out = new FileOutputStream(location);
		w.write(out);
		System.out.println("He is alive");
			
		
	}

}

