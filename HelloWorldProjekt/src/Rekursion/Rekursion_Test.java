package Rekursion;

public class Rekursion_Test {

	public static void main(String[] args) {
		// Rekursion Test
		rekursiv(1);

	}

	public static void rekursiv(int zahl) {
		if (zahl > 1000000)
			return;
		//
		int ergebnis = zahl * 5;
		System.out.println(ergebnis);
		//
		rekursiv(ergebnis);

	}
}
