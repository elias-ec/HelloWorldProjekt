package Basics;

public class Schleife {

	public static void main(String[] args) {
		// FOR-Schleife - 3 Teile
		// 1. Variabel Init (=Initialisieren)
		// 2. Bedingung
		// 3. In/De-Krement
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Zahl ist" + i);
		}
		System.out.println("");
		System.out.println("Eine Schleife die von 100-1 zählt:");//Arbeitsauftrag: Von 100-1 zählen
		// Zahl ist 100
		// Zahl ist 99
		// Zahl ist ...
		// Zahl ist 1
		for (int i = 100; i >= 1; i = i - 1) {
			System.out.println("Zahl ist" + i);
		}
	}

}
