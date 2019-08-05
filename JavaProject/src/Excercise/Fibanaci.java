package Excercise;

public class Fibanaci {

	public static void main(String[] args) {
		int f = 0, s = 1, t;
		System.out.println(f + "\n" + s);
		for (int i = 1; i < 10; i++) {
			t = f + s;
			System.out.println(t);
			f = s;
			s = t;

		}

	}

}
