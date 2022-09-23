package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ext_getrowsize {
	
	public static void main(String[] args) throws IOException  {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\ExelAAA.xlsx");
		
	//	int Data = WorkbookFactory.create(file).getSheet("ABC").getLastRowNum();
		
	//  short Data = WorkbookFactory.create(file).getSheet("ABC").getRow(0).getLastCellNum();
		
		CellType Data = WorkbookFactory.create(file).getSheet("ABC").getRow(1).getCell(1).getCellType();
		
		System.out.println(Data);
	}

}
