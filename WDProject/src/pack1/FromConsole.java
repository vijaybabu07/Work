package pack1;

import java.util.Scanner;

public class FromConsole {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a");
		int a=s.nextInt();
		System.out.println("Enter b");
		int b=s.nextInt();
		System.out.println(a+b);
		/*System.out.println("enter any string");
		String str=s.next();
		System.out.println("Entered string is "+str);*/
		System.out.println("enter any string with spaces");
		String str_space=s.nextLine();
		System.out.println("Entered string is "+str_space);
		

	}

}
