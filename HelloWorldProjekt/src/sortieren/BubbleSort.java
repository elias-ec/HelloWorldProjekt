package sortieren;

public class BubbleSort {

	public static void main(String[] args) {
		// Bubblesort Array
//Länge der Reihe
		int[] zahlen = { 3, 1, 9, 5, 2, 8, 6, 5, 18 };
		System.out.println("Die Reihe hat " + zahlen.length + " Zahlen");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
		//
		System.out.println("Bubblesort");
		//
		// Bubblesort
		for (int z = zahlen.length; z > 1; z--) {
			for (int s = 0; s < z - 1; s++) {
				if (zahlen[s] > zahlen[s + 1]) {
					int a = zahlen[s];
					zahlen[s] = zahlen[s + 1];
					zahlen[s + 1] = a;

				}
			}
		}
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}

	}
}
