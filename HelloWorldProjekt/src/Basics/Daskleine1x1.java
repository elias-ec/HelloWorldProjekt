package Basics;

public class Daskleine1x1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print((0 + i) + "er\t");
			for (int y = 1; y <= 10; y++) {

				System.out.print("\t" + (i * y));

			}
			System.out.println();

		}

	}
}