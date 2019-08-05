package pack1;

import java.io.FileOutputStream;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ToExcel {
	public static void main(String[] args) throws Exception{
		FileOutputStream f=new FileOutputStream("E:\\Sel\\Work\\WDProject\\src\\Output1.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(f);
		WritableSheet ws=wwb.createSheet("Res",1);
		Label l=new Label(0, 0, "Hi");
		ws.addCell(l);
		wwb.write();
		wwb.close();
	}
}
