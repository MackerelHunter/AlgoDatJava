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

		// TODO <implement bubble sort>
		// sort the array "elements" which is an instance variable

	}

	// --------------------------------

	// ---------- Insert sort ----------

	@Override
	protected void insertSort() {
		SortElement[] elements = getElements();

		// TODO <implement insert sort>
		// sort the array "elements" which is an instance variable

	}

	// --------------------------------

	// ---------- Merge sort ----------

	@Override
	protected void mergeSort(int lo, int hi) {
		SortElement[] elements = getElements();

		// TODO <implement merge sort>

	}

	@Override
	protected void merge(int lo, int hi) {
		SortElement[] elements = getElements();

		// TODO <implement merge function>
		// source is the array "elements" which is an instance variable
		// use the instance variable "mergeSortContainer" as help array

	}

	// --------------------------------

	// ---------- Quick sort ----------

	@Override
	protected void quickSort(int l, int r) {
		SortElement[] elements = getElements();

		// TODO <implement quick sort>
		// sort the array "elements" which is an instance variable

	}

	// ------------------------------------

	// ---------- Selection sort ----------

	@Override
	protected void selectionSort() {
		SortElement[] elements = getElements();

		// TODO <implement selection sort>
		// sort the array "elements" which is an instance variable

	}

	// ---------------------------------

	// ---------- Shaker sort ----------

	@Override
	protected void shakerSort() {
		SortElement[] elements = getElements();

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