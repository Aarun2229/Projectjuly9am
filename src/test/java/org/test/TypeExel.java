package org.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TypeExel
{
	public static void main(String[] args) throws IOException
	{
		//location
		File location=new File("C:\\Users\\user\\eclipse-workspace\\MavenProjectP\\ExelRead\\Book1.xlsx");
		//read the value
		FileInputStream stream= new FileInputStream(location);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Data1");
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row row = s.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
				Cell c = row.getCell(j);
				int type = c.getCellType();
				if(type==1)
				{
					String value = c.getStringCellValue();
					System.out.println(value);

				}
				else if(type==0)
				{
					if(DateUtil.isCellDateFormatted(c))
					{
						Date datevalue = c.getDateCellValue();
						SimpleDateFormat simple = new SimpleDateFormat("dd-mm-yyyy");
						String value = simple.format(datevalue);
						System.out.println(value);

					}
					else
					{
						double numericvalue = c.getNumericCellValue();
						long l=(long)numericvalue;
						String value=String.valueOf(l);
						System.out.println(value);

					}
				}

				
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
			

