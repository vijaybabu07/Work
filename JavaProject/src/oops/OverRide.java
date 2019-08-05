package oops;
class I1
{
	public void roi()
	{
		System.out.println("5");
	}
}
class I2 extends I1
{
	public void roi()
	{
		System.out.println("7");
	}
}
class I3 extends I2
{
	public void roi()
	{
		System.out.println("4");
	}
}
public class OverRide extends I3{
	public void roi()
	{
		System.out.println("1");
	}
	public static void main(String[] args) {
		I3 o=new I3();
		o.roi();

	}

}
