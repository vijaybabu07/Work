package oops;
interface Drawable{
	public abstract void draw();
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Circle");
	}
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Rectangle");
	}
}

public class InterfaceEx {
	public static void main(String[] args) 
	{
		/*Circle c=new Circle();
		Drawable cc=c;
		cc.draw();*/
		Drawable c=new Circle();
		c.draw();
		Drawable r=new Rectangle();
		r.draw();
	}

}
