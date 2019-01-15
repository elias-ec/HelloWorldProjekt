package Basics;

public class Schleife2 {

	public static void main(String[] args) {
		// vor der Schleife
		System.out.println("vor");
		// während der Schleife
		for (int i = 0; i < 3; i++) {
			System.out.println("während");
		}
//nach der Schleife
		System.out.println("nach");
		//
		// innere und äußere Schleife
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 4; x++) {
				System.out.println("Wie oft?" + x);
			}
			System.out.println("Wie oft hiernach?" + i);
		}
	}

}
