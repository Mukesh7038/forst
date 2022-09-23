package PARAMETERIZATION;

import java.io.FileInputStream;


import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exl_PrintwholeRow {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\ExelAAA.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("ABC");
		
		int CellCount = sh.getLastRowNum();
		
		for(int i=0; i<=CellCount;i++) {
			
			String Data = sh.getRow(i).getCell(0).getStringCellValue();    // By Putting row ==i && Cell==0 we can PRINT CELL
			
			System.out.print(Data+" ");
		}
	}

}
