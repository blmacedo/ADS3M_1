public class MergeSort {
	int aux1 = 0 ;
	int aux2 = 0 ;
	private int[] array;
	private int[] tempMergArr;
	private int length;

	public void sort(int inputArr[]) {

		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
		System.out.print("\n" + "\n" + "MergeSortPrint" + "\n");
		System.out.print("nº de trocas:" + aux2 + "\n" +
				"nº de Comparações:" + aux1  + "\n");
		
		

	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {

			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			
			doMergeSort(lowerIndex, middle);

			doMergeSort(middle + 1, higherIndex);
	
			mergeParts(lowerIndex, middle, higherIndex);

		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {

			tempMergArr[i] = array[i];

		}

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {
			aux1++;

			if (tempMergArr[i] <= tempMergArr[j]) {

				array[k] = tempMergArr[i];
				i++;
				
				

			} else {

				array[k] = tempMergArr[j];
				j++;
				aux2++;
			}

			k++;
		}

		while (i <= middle) {

			array[k] = tempMergArr[i];
			k++;
			i++;

		}

	}

}
