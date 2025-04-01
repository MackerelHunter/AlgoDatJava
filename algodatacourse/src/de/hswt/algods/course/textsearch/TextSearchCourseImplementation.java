package de.hswt.algods.course.textsearch;

import java.util.ArrayList;

import de.hswt.algods.stringprocessing.core.StringMatchingElement;
import de.hswt.algods.stringprocessing.core.StringMatchingServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author Christopher Hartmann
 * @author <your name here>
 */
@ServiceImplementation(id = "de.hswt.algo.textmining.course.TextMiningCourseImplementation", name = "Course implementation", position = 120)
public class TextSearchCourseImplementation extends
		StringMatchingServiceProvider {

	// ---------- Knuth Morris Pratt algorithm ----------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.textsearch.core.StringMatchingServiceProvider#knuthMorrisPratt
	 * (String, String)
	 */
	@Override
	protected ArrayList<StringMatchingElement> knuthMorrisPratt(String text,
			String pattern) {
		// initialize
		ArrayList<StringMatchingElement> results = new ArrayList<StringMatchingElement>();
		int[] patternMatches = new int[pattern.length()];

		// set all fields to StringMatchingServiceProvider.UNPROCESSED
		initArrayAsUnprocessed(patternMatches);

		int textIndex = 0, patternIndex = 0;
		int patternLength = pattern.length(), textLength = text.length();
		System.out.println(pattern);

		// the algorithm part
		int[] l = calcMargins(pattern);

		/*
		 * classes you need: StringMatchingElement
		 * 
		 * Constants you need: StringMatchingServiceProvider.MATCH
		 * StringMatchingServiceProvider.MISMATCH
		 * StringMatchingServiceProvider.UNPROCESSED
		 * 
		 * Class variables you need: pattern (String representation of the
		 * pattern) text (String representation of the text)
		 * 
		 * To add a line to the UI, add a object of StringMatchingElement to the
		 * results array list.
		 */

		// TODO <implement the Knuth Morris Pratt algorithm>

		return results;
	}

	private int[] calcMargins(String p) {
		// dummy implementation
		return new int[p.length() + 1];

		// TODO <replace the dummy implementation>
		// calculate the sizes of the largest edges
	}

	// ----------------------------------

	// ---------- Naive Search ----------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.textsearch.core.StringMatchingServiceProvider#naiveSearchExample
	 * ((String, String))
	 * 
	 * The implementation is not important, it is not used in the application
	 * and should only provide an example of how to us the
	 * StringMatchingServiceProvider so that someone can get an idea of how to
	 * implement a another algorithm.
	 */
	@Override
	protected ArrayList<StringMatchingElement> naiveSearchExample(String text,
			String pattern) {
		// initialize
		ArrayList<StringMatchingElement> results = new ArrayList<StringMatchingElement>();
		int[] patternMatches = new int[pattern.length()];

		// set all fields to StringMatchingServiceProvider.UNPROCESSED
		initArrayAsUnprocessed(patternMatches);

		int textIndex = 0, pIndex;
		int textLength = text.length();
		int patternLength = pattern.length();

		// the algorithm part
		while (textIndex <= textLength - patternLength) {
			pIndex = 0;
			while (pIndex < patternLength
					&& pattern.charAt(pIndex) == text
							.charAt(textIndex + pIndex)) {
				patternMatches[pIndex] = MATCH;

				// add an entry in the results table of the UI
				results.add(new StringMatchingElement(textIndex, patternMatches));
				pIndex++;
			}

			// if it is not a complete pattern match, add a mismatch to the end
			if (pIndex < patternLength) {
				patternMatches[pIndex] = MISMATCH;

				// add an entry in the results table of the UI
				results.add(new StringMatchingElement(textIndex, patternMatches));
			}

			// reset the pattern matches array to
			// StringMatchingServiceProvider.UNPROCESSED
			initArrayAsUnprocessed(patternMatches);

			// next position in text
			textIndex++;
		}

		return results;
	}
}
