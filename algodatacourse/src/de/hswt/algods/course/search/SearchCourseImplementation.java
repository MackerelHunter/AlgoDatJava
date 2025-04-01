package de.hswt.algods.course.search;

import de.hswt.algods.search.core.Country;
import de.hswt.algods.search.core.SearchServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author <your name here>
 */
@ServiceImplementation(
		id = "de.hswt.algo.search.course.SearchCourseImplementation", 
		name = "Course implementation", position = 100)
public class SearchCourseImplementation extends SearchServiceProvider {

	@Override
	public String searchCountryBinary(Country[] clist, String country) {
		if (country == null)
			return null;
		
		// TODO <implement binary country search>
		
		
		return null; // nothing found
	}
	
}
