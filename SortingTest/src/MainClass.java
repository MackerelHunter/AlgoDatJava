
public class MainClass {
	
	static int swapCounter, compareCounter;

	public static void main (String[] args) {
		int[] testArray = {2, 17, 18, 5, 21, 13, 7};
		int[] aufgabenArray = {8, 11, 34, 4, 9, 17, 6, 15, 2, 7, 22};
		//demonstrateInsertSort(testArray);
		quickSort(aufgabenArray, 0, aufgabenArray.length-1);
		printMyArray(aufgabenArray, 0, aufgabenArray.length-1);
		printSwapsAndCompares(swapCounter, compareCounter);
	}

	static void demonstrateInsertSort(int[] intArray) {
		int arrayLength = intArray.length;
		int compareCounter = 0;
		int swapCounter = 0;
		for (int step = 1; step < arrayLength; step++) {
			printMyArray(intArray, 0 , intArray.length-1);
			int sortMe = intArray[step];
			int whereAreWe = step;
			while (whereAreWe > 0 &&
					sortMe < intArray[whereAreWe-1]) {
				compareCounter++;
				swapCounter++;
				intArray[whereAreWe] = intArray[whereAreWe-1];
				printMyArray(intArray, 0, intArray.length-1);
				whereAreWe--;
			}
			swapCounter++;
			intArray[whereAreWe] = sortMe;
		}
		printMyArray(intArray, 0, intArray.length-1);
		printSwapsAndCompares(swapCounter, compareCounter);
	}

	static void demonstrateQuickSort (int[] intArray) {

	}

	/**
	 * @param intArray
	 * @param leftEnd
	 * @param rightEnd
	 */
	static void quickSort(int[] intArray, int leftEnd, int rightEnd) {
		printMyArray(intArray, leftEnd, rightEnd);
		if (rightEnd > leftEnd) {
			int pivot = intArray[rightEnd];
			int rightPosition = rightEnd;
			int leftPosition = leftEnd;
			while (rightPosition > leftPosition) {
				if (intArray[leftPosition] <= pivot) {
					compareCounter++;
					leftPosition++;
				} else {
					compareCounter++;
					swapCounter++;
					rightPosition--;
					int tmp = intArray[rightPosition];
					intArray[rightPosition] = intArray[leftPosition];
					intArray[leftPosition] = tmp;
				}
			}
			swapCounter++;
			intArray[rightEnd] = intArray[rightPosition];
			intArray[rightPosition] = pivot;
			quickSort(intArray, leftEnd, rightPosition-1);
			quickSort(intArray, rightPosition+1, rightEnd);
		}
	}

	static void printMyArray(int[] intArray, int start, int end) {
		System.out.print("[");
		for (int i = start; i <= end; i++) {
			System.out.printf("%3d, ", intArray[i]);
		}
		System.out.print("]\n");
	}

	static void printSwapsAndCompares(int swaps, int compares) {
		System.out.println("Vergleiche: " + compares + ", Vertauschungen: " + swaps);
	}
}
