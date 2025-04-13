package de.hswt.algods.course.search;

import de.hswt.algods.searchcompare.core.SearchCompareServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author <your name here>
 */
@ServiceImplementation(
		id = "de.hswt.algo.search.course.SearchCompareCourseImplementation", 
		name = "Course implementation", position = 100)
public class SearchCompareCourseImplementation extends SearchCompareServiceProvider {

	@Override
	protected int searchBinary(int[] data, int key) { // data ist sortiert, key ist die Zahl (nicht der Index) die wir suchen
		int low = 0;
		int high = data.length-1;
		while (high >= low) {
			int middle = (high + low)/2;
			if (data[middle] == key) { // "Wenn die Zahl am index middle gleich der Zahl key ist"
				return middle; // "Gib die Zahl middle (nicht die Zahl am index middle) zurück"
			}
			if (data[middle] > key) {
				high = middle-1; // Spart Zeit, da wir middle ja schon ausgeschlossen haben
			}
			if (data[middle] < key) {
				low = middle+1; // hier genauso
			}
		}
		return -1; // nothing found
	}
}
