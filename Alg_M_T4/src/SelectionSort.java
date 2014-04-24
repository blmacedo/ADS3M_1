public class SelectionSort {
	int aux1 = 0 ;
	int aux2 = 0 ;

	public int[] doSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int index = i;

			for (int j = i + 1; j < arr.length; j++) {
				aux2++;
				if (arr[j] < arr[index]) {

					index = j;
					aux1++;
					
				}

			}

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
			

		}
		System.out.print("SelectionSort" + "\n");
		System.out.print("nº de trocas:" + aux1 + "\n" +
						"nº de Comparações:" + aux2 + "\n");
		return arr;
	}
}


