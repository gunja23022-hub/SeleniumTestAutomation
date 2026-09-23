package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	
	//Excel File -->Workbook-->Sheets--->Rows-->Cells
	
	
	@Test
	public static List<String> ReadDataFromExcelFile() throws IOException 
	
	{
		String path= System.getProperty("user.dir")+"\\testdata\\cred.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalRows=sheet.getLastRowNum();
		
		int totalCells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total rows "+totalRows);
		
		System.out.println("Total rows "+totalCells);
		
		List<String> list=new ArrayList<>();
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
		
		for(int c=0;c<totalCells;c++)
		{
			XSSFCell cell=currentRow.getCell(c);
			
			String cellValue=cell.toString();
			
			//System.out.print(cellValue+"\t");
			list.add(cellValue);
			
			System.out.println(list+"\t ");
		}
		
		System.out.println();
		}
		
		workbook.close();
		file.close();
		
		return list;
	}

}
