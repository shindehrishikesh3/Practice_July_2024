package january1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Abcd
{


		public void geekforgeeks() throws IOException{ 
	              
	          FileInputStream file = new FileInputStream("D:\\Software Testing\\Projects\\Hrishi.xlsx"); 
	            XSSFWorkbook wb=new XSSFWorkbook(file); 
	            XSSFSheet sheet=wb.getSheet("Sheet1"); 
	       
	            // Iterate each row one by one 
	            Iterator<Row> rIterator = sheet.iterator(); 
	            while (rIterator.hasNext())  
	            { 
	                Row row = rIterator.next(); 
	                  
	                  // For each row, iterate through all the columns 
	                Iterator<Cell> Cell = row.cellIterator(); 
	                   
	                while (Cell.hasNext())  
	                { 
	                    Cell cell = Cell.next(); 
	                      	         
	                        System.out.print(cell.getStringCellValue()); 
	               
	                    System.out.print("|"); 
	                } 
	                System.out.println();               
	            } 
	            wb.close(); 
	            file.close(); 
	    } 
	

public static void main(String[] args) throws IOException 
{


	
	Abcd aa=new Abcd();
	aa.geekforgeeks();

	
	
	
}
}
