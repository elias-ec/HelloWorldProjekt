package sortieren;

public class QuickSort {

	static int[] zahlen = { 4, 6, 8, 2, 7, 9, 2, 5, 7, 6 };

	public static void main(String[] args) {
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);

		}
		//
		quicksort(0, zahlen.length - 1);
		//
		System.out.println("---");
		//
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}

	}

	private static void quicksort(int links, int rechts) {
		if (links < rechts) {
			int teiler = teile(links, rechts);
			quicksort(links, teiler - 1);
			quicksort(teiler + 1, rechts);
		}
	}

	private static int teile(int links, int rechts) {
		int i = links;
		int j = rechts - 1;
		int pivot = zahlen[rechts];
		//
		do {
			while (i < rechts - 1 && zahlen[i] < pivot) {
				i = i + 1;
			}
			while (j > links && zahlen[j] >= pivot) {
				j = j - 1;
			}
			if (i < j) {
				int help = zahlen[i];
				zahlen[i] = zahlen[j];
				zahlen[j] = help;

			}
		} while (i < j);
		//
		if (zahlen[i] > pivot) {
			int help = zahlen[i];
			zahlen[i] = pivot;
			zahlen[rechts] = help;
		}
		//
		return i;
	}
}
