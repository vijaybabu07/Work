package oops;
class P1{
	public void land()
	{
		System.out.println("land");
	}
}
class C1 extends P1
{
	public void cash()
	{
		System.out.println("cash");
	}
}


public class C2 extends P1{
	public void gold()
	{
		System.out.println("gold");
	}
	public static void main(String[] args) {
		C2 c2=new C2();
		c2.land();
		c2.gold();
		C1 c1=new C1();
		c1.land();
		c1.cash();
	}

}
