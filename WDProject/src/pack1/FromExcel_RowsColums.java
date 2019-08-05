package pack1;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class FromExcel_RowsColums {

	public static void main(String[] args) throws Exception{
		FileInputStream f=new FileInputStream("E:\\Sel\\Work\\WDProject\\src\\Details.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet1");
		int rows=s.getRows();
		System.out.println(rows);
		int cols=s.getColumns();
		System.out.println(cols);
		/*for(int r=0;r<rows;r++)
		{
			System.out.println(s.getCell(0, r).getContents());
		}*/
		for(int c=0;c<cols;c++)
		{
			for(int r=0;r<rows;r++)
			{
				System.out.println(s.getCell(c, r).getContents());
			}
		}
	}

}
