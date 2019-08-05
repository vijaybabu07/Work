package oops;

public class Encaps {

	String name;
	
	public String getname() {
		return name;
	}
//execute Test.java
	public void setname(String name) {
		if(name.length()<3 || name.length()>10)
			throw new RuntimeException("name should be in between 3 and 10");
	}

}
