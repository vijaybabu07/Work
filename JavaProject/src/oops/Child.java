package oops;
class GP{
	public void land()
	{
		System.out.println("land");
	}
}
class Parent extends GP{
	public void buildings()
	{
		System.out.println("buildings");
	}
}

public class Child extends Parent{
	public void cash()
	{
		System.out.println("cash");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.buildings();
		c.cash();
		c.land();

	}

}
