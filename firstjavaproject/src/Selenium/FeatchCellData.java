package Selenium;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FeatchCellData {

	public static void main(String[] args) throws IOException {
		
	    FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\ExelAAA.xlsx");
	//    String Data = WorkbookFactory.create(file).getSheet("ABC").getRow(1).getCell(1).getStringCellValue();
	    
	   boolean Data = WorkbookFactory.create(file).getSheet("ABC").getRow(0).getCell(1).getBooleanCellValue();
	    
	    System.out.println(Data);

	}

}
