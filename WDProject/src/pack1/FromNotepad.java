package pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FromNotepad {

	public static void main (String[] args) throws Exception {
		FileReader f=new FileReader("E:\\Sel\\DDT\\test.txt");
		BufferedReader b=new BufferedReader(f);
		String s;
		while((s=b.readLine())!=null)
		{
			System.out.println(s);
		}
		
	}

}
