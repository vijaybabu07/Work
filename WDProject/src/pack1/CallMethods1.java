package pack1;

public class CallMethods1 {

	public static void main(String[] args) {
		ReusableMethods1 m=new ReusableMethods1();
		m.applaunch("http://demo.borland.com/InsuranceWebExtJS/");
		m.element_present("signup:fname", true);
		m.element_present("signup:lname", false);
		m.links_count("a",4);
		m.app_title_length(21);
		m.url_contains(".com");
		m.title_startswith("K");
	}
}
