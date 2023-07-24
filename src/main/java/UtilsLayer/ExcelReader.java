package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass {
	public static XSSFWorkbook workbook;

	public ExcelReader(String path) {
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void getDataFromExcel(int sheetindex, int row ,int cell)
	{
		try {
			workbook.getSheetAt(sheetindex).getRow(row).getCell(cell).getStringCellValue();
		} catch (Exception e) {
			workbook.getSheetAt(sheetindex).getRow(row).getCell(cell).getRawValue();
		}
		
	}
	public static int getRowCount(int sheetindex)
	{
		return workbook.getSheetAt(sheetindex).getLastRowNum()+1;
	}
	public static int getCellCount(int sheetindex)
	{
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}
}
