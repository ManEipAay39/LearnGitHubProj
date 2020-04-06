package Practice;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI {

	public static void main(String[] args)throws Exception {
                      //XSSFWorkbook
		FileInputStream f=new FileInputStream("C:\\Users\\manas\\Desktop\\Framework\\Test Data\\POI.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(f);
		XSSFSheet s=workbook.getSheet("Sheet1");
		System.out.println(s.getRow(0).getCell(0).getStringCellValue());
		System.out.println(s.getRow(0).getCell(1).getStringCellValue());
		
                      //HSSFWorkbook
		FileInputStream f1=new FileInputStream("C:\\Users\\manas\\Desktop\\Framework\\Test Data\\123.xls");
		HSSFWorkbook workbook1=new HSSFWorkbook(f1);
		HSSFSheet s1=workbook1.getSheet("Sheet1");
		System.out.println(s1.getRow(0).getCell(0).getStringCellValue());
		System.out.println(s1.getRow(0).getCell(1).getStringCellValue());
			

	}

}
