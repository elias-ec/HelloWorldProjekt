package Basics;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zahlen = { 3, 1, 9, 5, 2, 8, 6, 5 };
//
		System.out.println(zahlen[0]);
		System.out.println(zahlen[1]);
//
		System.out.println(zahlen.length); // Wieviele Zahlen man hat
		//
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
	}

}
