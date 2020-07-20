package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelRead 
{
	public static void main(String[] args) throws IOException
	{
		//location
		File location=new File("C:\\Users\\user\\eclipse-workspace\\MavenProjectP\\ExelRead\\Book1.xlsx");
		//read the value
		FileInputStream stream= new FileInputStream(location);
		
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet s = w.getSheet("Data1");
		
		Row r = s.getRow(5);
		
		Cell c = r.getCell(2);
		
		System.out.println(c);
		
		
		
		
	}

}
