package de.hswt.algods.course.sort;


import de.hswt.algods.sort.core.SortElement;
import de.hswt.algods.sort.core.SortServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author <your name here>
 */
@ServiceImplementation(id = "de.hswt.algo.sort.course.SortCourseImplementation", name = "Course implementation", position = 100)
public class SortCourseImplementation extends SortServiceProvider {

	// ---------- Bubble sort ----------

	@Override
	protected void bubbleSort() {
		SortElement[] elements = getElements();
		int n = elements.length;
		for (int outer = n-1; outer > 0; outer--) {
			for (int inner = 0; inner < outer; inner++) {
				// if (elements[inner].compareTo(elements[inner+1] > 0) { // Mit compareTo-Methode
				if (elements[inner].compareTo(elements[inner+1]) > 0) {
					swap(inner, inner+1); // Swap hat Zugriff auf die Elemente des Arrays
				}
			}
		}

		// TODO <implement bubble sort>
		// sort the array "elements" which is an instance variable

	}

	// --------------------------------

	// ---------- Insert sort ----------

	@Override
	protected void insertSort() {
		SortElement[] elements = getElements();
		int sortLength = elements.length;
		for (int outer = 1; outer < sortLength; outer++) {
			SortElement toBeSorted = elements[outer];
			int currentPosition = outer;
			while (currentPosition > 0 &&
					toBeSorted.compareTo(elements[currentPosition-1]) < 0) {
				replace(currentPosition, elements[currentPosition-1]);
				currentPosition--;
			}
			replace(currentPosition, toBeSorted);
		}
	}

	// --------------------------------

	// ---------- Merge sort ----------

	@Override
	protected void mergeSort(int lo, int hi) {
		SortElement[] elements = getElements();
		if (hi <= lo) {
			return;
		}
		int middle = (lo + hi) / 2;
		mergeSort(lo, middle);
		mergeSort(middle+1, hi);
		merge(lo, hi);
		// TODO <implement merge sort>

	}

	@Override
	protected void merge(int lo, int hi) {
		//System.out.println("hier angekommen");
		SortElement[] elements = getElements();
		int middle = (lo+hi)/2;
		int i, j; //counter müssen persistieren
		SortElement[] tempArray = new SortElement[elements.length]; //glaube, Hilfsfolge muss genau so lang sein, da wir immer mit der ganzen zu sortierenden Folge arbeiten
		for (i = middle+1; i > lo; i--) {
			tempArray[i-1] = elements[i-1];
		}
		for (j = middle; j < hi; j++) {
			tempArray[hi + middle - j] = elements[j+1]; //schreibt die obere Hälfte der Elemente rückwärts in die Hilfsfolge
		}
		for (int k = lo; k <= hi; k++) { // durchläuft einfach nur einmal unseren Hilfsarray, k ist reine Zählvariable
			if (tempArray[j].compareTo(tempArray[i]) < 0) { //j und i sind hier am Anfang lo und hi und nähern sich dann an
				elements[k] = tempArray[j--];
			} else {
				elements[k] = tempArray[i++];
			}
			updateView();
		}

		// TODO <implement merge function>
		// source is the array "elements" which is an instance variable
		// use the instance variable "mergeSortContainer" as help array

	}

	// --------------------------------

	// ---------- Quick sort ----------

	@Override
	protected void quickSort(int l, int r) {
		SortElement[] elements = getElements();
		if (l < r) {
			int leftPosition = l;
			int rightPosition = r;
			SortElement pivot = elements[r]; // wir nehmen das rechteste Element als Pivot
			while (leftPosition < rightPosition) {
				if (elements[leftPosition].compareTo(pivot) <= 0) {
					leftPosition++;
				} else {
					rightPosition--; //ganz am Anfang wechseln wir vom Pivot-Element zu dem links daneben
					swap(leftPosition, rightPosition); // egal, ob das Element, was von rechts nach links getauscht wurde, größer als der Pivot ist. Wird eh gleich wieder zurück getauscht
				}
			}
			swap(leftPosition, r);
			quickSort(l, leftPosition-1);
			quickSort(leftPosition+1, r);
		}
		// TODO <implement quick sort>
		// sort the array "elements" which is an instance variable

	}

	// ------------------------------------

	// ---------- Selection sort ----------

	@Override
	protected void selectionSort() {
		SortElement[] elements = getElements();
		for (int outer = 0; outer < elements.length; outer++) {
			// SortElement minElement = elements[outer];
			int minElIndex = outer; //speichert den Index des niedrigsten Elements
			for (int inner = elements.length-1; inner >= outer; inner--) { //durchlaufen einen immer kleiner werdenden Teil
				if (elements[minElIndex].compareTo(elements[inner]) > 0) {
					minElIndex = inner;
				}
			}
			swap(minElIndex, outer);
		}

		// TODO <implement selection sort>
		// sort the array "elements" which is an instance variable

	}

	// ---------------------------------

	// ---------- Shaker sort ----------

	@Override
	protected void shakerSort() {
		SortElement[] elements = getElements();
		int upper = elements.length-1;
		int lower = 0;
		while (upper > lower) {
			for (int inner1 = lower; inner1 < upper; inner1++) {
				if (elements[inner1].compareTo(elements[inner1+1]) > 0) {
					swap(inner1, inner1+1);
				}
			}
			upper--;
			for (int inner2 = upper; inner2 > lower; inner2--) {
				if (elements[inner2].compareTo(elements[inner2-1]) < 0) {
					swap(inner2, inner2-1);
				}
			}
			lower++;
		}

		// TODO <implement shaker sort>
		// sort the array "elements" which is an instance variable

	}

	// --------------------------------

	// ---------- Shell sort ----------

	@Override
	protected void shellSort() {
		SortElement[] elements = getElements();

		int[] spalten = { 1743392200, 581130733, 193710244, 64570081, 21523360,
				7174453, 2391484, 797161, 265720, 88573, 29524, 9841, 3280,
				1093, 364, 121, 40, 13, 4, 1 };
		
		int arrayLength = elements.length;
		for (int abstand : spalten) {
			for (int outer = abstand; outer < arrayLength; outer++) {
				SortElement toBeSorted = elements[outer];
				int inner = outer;
				while (inner >= abstand && // Diese Bedingung muss zuerst gecheckt werden, sonst out of bounds
						toBeSorted.compareTo(elements[inner-abstand]) <= 0) {
					replace(inner, elements[inner-abstand]);
					inner -= abstand;
				}
				replace(inner, toBeSorted);
			}
		}

		// TODO <implement shell sort>
		// sort the array "elements" which is an instance variable

	}

	// ------------------------------------

	// ---------- Helper Methods ----------

	@Override
	protected void swap(int first, int second) {
		SortElement[] elements = getElements();

		synchronized (elements) {
			int last = elements.length - 1;
			if (first < 0 || second < 0 || first > last || second > last) {
				return;
			}

			SortElement temp = elements[first];
			elements[first] = elements[second];
			elements[second] = temp;

			// increment swaps counter
			incrementSwaps();
		}

		// view update
		updateView();

	}

	@Override
	protected void replace(int index, SortElement newElement) {
		SortElement[] elements = getElements();
		elements[index] = newElement;

		// increment swaps counter
		incrementSwaps();

		// view update
		updateView();
	}

}