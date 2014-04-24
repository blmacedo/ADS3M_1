import java.util.Random;

public class Principal {
	Random r = new Random();
	SelectionSort sort1 = new SelectionSort();
	int[] arr1 = new int[5];
	int[] arr2 = new int[5];
	int[] arr3 = new int[5];

	public static void main(String[] args) throws Exception {
		(new Principal()).run(args);
	}

	public void run(String[] args) throws Exception {
		
		SorteioNumerico();
		for (int i : arr1) {

			System.out.print(i);
			System.out.print(", ");
		}
		System.out.print("\n\n");
		SelectionSortPrint();
		MergeSortPrint();
		
	}

	public void SelectionSortPrint() {
		
		int[] arr3 = sort1.doSelectionSort(arr1);
		

		for (int i : arr3) {

			System.out.print(i);
			System.out.print(", ");
		}
	}

	public void MergeSortPrint() {
		
		MergeSort mms = new MergeSort();
		mms.sort(arr2);
		
		
		for (int i : arr2) {

			System.out.print(i);
			System.out.print(", ");

		}
	}

	public void SorteioNumerico() {
		int numero;
		for (int i = 0; i < 5; i++) {
			numero = r.nextInt(10);
			// System.out.print(numero);
			arr1[i] = numero;
			arr2[i] = numero;
			// System.out.print(arr1[i]);

		}

	}

}
