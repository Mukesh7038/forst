package PARAMETERIZATION;

import static org.apache.poi.ss.usermodel.CellType.BLANK;
import static org.apache.poi.ss.usermodel.CellType.BOOLEAN;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXL_FetchDiffTypeOfDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\Std_info.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("XYZ");

		// System.out.println(sh.getLastRowNum());

		// System.out.println(sh.getRow(0).getLastCellNum());

		for (int i = 0; i <=sh.getLastRowNum(); i++) {

			for (int j = 0; j <= sh.getRow(i).getLastCellNum()-1; j++) {

				Cell cellinfo = sh.getRow(i).getCell(j);
				CellType datatype = cellinfo.getCellType();

				if (datatype == BLANK) {
					CellType Data = BLANK;
					Data.toString();
					System.out.print("**"+Data+"** | ");
				} else if (datatype == STRING) {
					System.out.print(cellinfo.getStringCellValue() + " | ");
				} else if (datatype == BOOLEAN) {
					System.out.print(cellinfo.getBooleanCellValue() + " | ");
				} else if (datatype == NUMERIC) {
					System.out.print(cellinfo.getNumericCellValue() + " | ");
				}
			}
			System.out.println();
		}

	}

}
