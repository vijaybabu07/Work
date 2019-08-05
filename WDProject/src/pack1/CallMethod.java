package pack1;

public class CallMethod {

	public static void main(String[] args) {
		Methods m=new Methods();
		m.launchApp("http://demo.borland.com/InsuranceWebExtJS/");
		m.launchApp("http://google.com");
		m.closeApp();
		
	}

}
