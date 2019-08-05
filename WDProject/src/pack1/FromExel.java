package pack1;

import java.io.File;
import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class FromExel {

	public static void main(String[] args) throws Exception {
		/*File f1 = new File("src/names.xls");
		System.out.println(f1.getAbsolutePath());*/
		
		
		//FileInputStream f=new FileInputStream(f1.getAbsolutePath());
		FileInputStream f=new FileInputStream("src/names.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet1");
		System.out.println(s.getCell(0, 4).getContents());
	}
}
