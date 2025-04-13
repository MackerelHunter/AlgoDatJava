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
		int low = 0;
		int high = clist.length-1;
		while (high >= low) {
			int middle = (low + high)/2;
			String tempCountry = clist[middle].toString();
			if (tempCountry.compareToIgnoreCase(country)==0) {
				return clist[middle].getCapital();
			}
			if (tempCountry.compareToIgnoreCase(country)>0) {
				high = middle-1;
			}
			if (tempCountry.compareToIgnoreCase(country)<0) {
				low = middle+1;
			}
		}
		return null; // nothing found
	}
}
