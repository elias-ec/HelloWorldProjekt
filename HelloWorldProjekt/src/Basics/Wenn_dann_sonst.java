package Basics;

public class Wenn_dann_sonst {

	public static void main(String[] args) {
		// Wenn, dann ... →sonst ...

		// Wenn -dann:
		if (1 < 3) {
			System.out.println("1 < 3");
		}
		//
		boolean trifft_zu = true;
		// boolean ist eine Variabel, die speichert, ob etwas "true or false" ist
		// (→siehe Variabeln)
		if (trifft_zu == true) {
			System.out.println("Juhu!");
		}
		// wenn dann sonst:
		int zahl = 2;
		if (zahl == 1) {
			System.out.println("ungerade");
		} else {
			System.out.println("gerade");
		}

	}
}