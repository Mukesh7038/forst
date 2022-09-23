package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exl_PrintAllTableData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\ExelAAA.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("ABC");
		
		for(int i=0;i<=sh.getLastRowNum()-1;i++) {
			
			for(int j=0; j<= sh.getRow(i).getLastCellNum()-1;j++) {
				
				String Data = sh.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(Data+" ");
			}
			System.out.println();
		}

	}

}
