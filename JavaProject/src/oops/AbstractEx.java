package oops;
abstract class FirstRelease{
	public void classroom()
	{
		System.out.println("class room training");
	}
	public abstract void online();
	public abstract void corporate();
	
}
abstract class SecondRelease extends FirstRelease{
	public void online()
	{
		System.out.println("online training");
	}
	/*public void corporate()
	{
		System.out.println("corporate training");
	}*/
}
public class AbstractEx extends SecondRelease{
	public void corporate()
	{
		System.out.println("corporate training");
	}
	public static void main(String[] args) {
		AbstractEx o=new AbstractEx();
		o.classroom();
		o.online();
		o.corporate();	

	}

}
