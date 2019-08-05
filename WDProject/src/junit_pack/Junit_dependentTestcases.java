package junit_pack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit_dependentTestcases {

	@BeforeClass 
	public static void precond(){
		System.out.println("This is Before Class");
	}
	@AfterClass
	public static void postcond(){
		System.out.println("This is After Class");
	}
	@Test
	public void t1(){
		System.out.println("This is Test 1");
	}
	@Test
	public void t2(){
		System.out.println("This is Test 2");
	}
	@Test
	public void t3(){
		System.out.println("This is Test 3");
	}
	//@Ignore
	@Test
	public void t4(){
		System.out.println("This is Test 4");
	}
	@Test
	public void t5(){
		System.out.println("This is Test 5");
	}
}
