package de.hswt.algods.course.sort;

import java.util.Collections;
import java.util.List;

import de.hswt.algods.sortcompare.core.SortCompareElement;
import de.hswt.algods.sortcompare.core.SortCompareServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * 
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author Christopher Hartmann
 * @author <your name here>
 */

@ServiceImplementation(id = "de.hswt.algo.sortcompare.course.SortcompareCourseImplementation", name = "Course implementation", position = 1)
public class SortCompareCourseImplementation extends SortCompareServiceProvider {

	// ---------- Bubble sort ----------

	@Override
	protected void bubbleSort() {
		List<SortCompareElement> elements = getElements();

	}

	// --------------------------------

	// ---------- Gnome sort ----------

	@Override
	protected void gnomeSort() {
		List<SortCompareElement> elements = getElements();

	}

	// ---------------------------------

	// ---------- Insert sort ----------

	@Override
	protected void insertSort() {
		List<SortCompareElement> elements = getElements();

	}

	// -------------------------------

	// ---------- Java sort ----------

	@Override
	protected void javaSort() {
		List<SortCompareElement> elements = getElements();
		Collections.sort(elements);
	}

	// --------------------------------

	// ---------- Merge sort ----------

	@Override
	protected void mergeSort(int lo, int hi) {

	}

	@Override
	protected void merge(int lo, int hi) {
		List<SortCompareElement> elements = getElements();
		int i, j, k, m, n = hi - lo + 1;
		k = 0;
		m = (lo + hi) / 2;

		// untere Haelfte in Array mergeSortContainer kopieren
		for (i = lo; i <= m; i++) {

		}

		// obere Haelfte in umgekehrter Reihenfolge in Array mergeSortContainer
		// kopieren
		for (j = hi; j >= m + 1; j--) {

		}

		// jeweils das naechstgroesste Element zurueckkopieren,
		// bis i und j sich ueberkreuzen
		while (i <= j) {

		}
	}

	// --------------------------------

	// ---------- Quick sort ----------

	@Override
	protected void quickSort(int l, int r) {
		List<SortCompareElement> elements = getElements();

		int left, right;
		SortCompareElement pivot;

	}

	// ------------------------------------

	// ---------- Selection sort ----------

	@Override
	protected void selectionSort() {
		List<SortCompareElement> elements = getElements();

	}

	// ---------------------------------

	// ---------- Shaker sort ----------

	@Override
	protected void shakerSort() {
		List<SortCompareElement> elements = getElements();

	}

	// --------------------------------

	// ---------- Shell sort ----------

	@Override
	protected void shellSort() {
		List<SortCompareElement> elements = getElements();

		int[] spalten = { 2147483647, 1131376761, 410151271, 157840433,
				58548857, 21521774, 8810089, 3501671, 1355339, 543749, 213331,
				84801, 27901, 11969, 4711, 1968, 815, 271, 111, 41, 13, 4, 1 };
	}
}
