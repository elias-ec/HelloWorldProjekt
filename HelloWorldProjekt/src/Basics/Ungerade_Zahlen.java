package Basics;

public class Ungerade_Zahlen {

	public static void main(String[] args) {
		// Ungerade Zahlen:
		for (int i = 1; i <= 100; i = i + 1) {
			if (i % 2 == 1) {   //Weitere Möglichkeit: i % 2 != 0 →!=...Art der Verneinung
				System.out.println(i);
			}
		}

	}
}