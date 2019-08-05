package junit_pack;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class JUnit_Sample {
	@Before
	public void a()
	{
		System.out.println("This is Before");
	}
	@After
	public void b()
	{
		System.out.println("This is after");
	}
	@Test
	public void t1()
	{
		System.out.println("This is test 1");
	}
	@Test
	public void t2()
	{
		System.out.println("This is test 2");
	}
	@Ignore
	@Test
	public void t3()
	{
		System.out.println("This is test 3");
	}
	@Test
	public void t4()
	{
		System.out.println("This is test 4");
	}

}
