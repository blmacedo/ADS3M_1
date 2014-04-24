import java.util.Random;

public class Principal {
	int tam = 30;
	int[] arr1 = new int[tam];
	int[] arr2 = new int[tam];
	int[] arr3 = new int[tam];

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
		SelectionSort sort1 = new SelectionSort();
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
		Random r = new Random();
		int numero;
		for (int i = 0; i < tam; i++) {
			numero = r.nextInt(100);
			arr1[i] = numero;
			arr2[i] = numero;

		}

	}

}
