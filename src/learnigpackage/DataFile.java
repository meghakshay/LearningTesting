package learnigpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFile {

	public String Exceldata(String SheetNum , int rowNum , int cellNum){
		String Cellvalue = null;
		try {
			FileInputStream fl = new FileInputStream("D:\\Testing\\eclipse-workspace\\data.xlsx");
			Workbook wb = WorkbookFactory.create(fl);
			Sheet s = wb.getSheet(SheetNum);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			Cellvalue = c.getStringCellValue();
			
			} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (EncryptedDocumentException e) 
		{
			e.printStackTrace();
		} 
		catch (InvalidFormatException e)
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return Cellvalue;
	}

}
