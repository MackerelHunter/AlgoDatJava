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
	protected int searchBinary(int[] data, int key) {

		// TODO <implement binary search>
		
		return -1; // nothing found
	}

}
