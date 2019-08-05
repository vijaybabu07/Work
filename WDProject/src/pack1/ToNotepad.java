package pack1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ToNotepad {

	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("E:\\Sel\\DDT\\OP.txt");
		BufferedWriter b=new BufferedWriter(fw);
		b.write("vijay");
		b.newLine();
		b.append("abc");
		b.newLine();
		b.append("xyz");
		b.close();
		

	}

}
