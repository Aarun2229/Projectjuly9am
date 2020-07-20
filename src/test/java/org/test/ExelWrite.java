package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelWrite 
{
	public static void main(String[] args) throws IOException
	{
		File location = new File("C:\\Users\\user\\eclipse-workspace\\MavenProjectP\\ExelWrite\\Data1.xlsx");
		FileOutputStream out = new FileOutputStream(location);
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Book1");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("SusanthSingRajput");
		w.write(out);
		System.out.println("S IT's THE END");
	}

}

