package de.hswt.algods.course.pairalignment;

import de.hswt.algods.pairalignment.core.BacktrackingPath;
import de.hswt.algods.pairalignment.core.PairAlignmentData;
import de.hswt.algods.pairalignment.core.PairAlignmentElement;
import de.hswt.algods.pairalignment.core.PairAlignmentServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Franke Lesske
 * @author Marco Luthardt
 * @author <your name here>
 * 
 */
@ServiceImplementation(id = "de.hswt.algo.pairalignment.course.PairAlignmentCourseImplementation", name = "Course implementation", position=120)
public class PairAlignmentCourseImplementation extends
		PairAlignmentServiceProvider {

	@Override
	protected PairAlignmentElement[][] fillAlignmentTable(PairAlignmentData data) {
		char[] hSeq = data.getHorizontalSequenceAsArray();
		char[] vSeq = data.getVerticalSequenceAsArray();
		PairAlignmentElement[][] table = new PairAlignmentElement[hSeq.length][vSeq.length];

		// initialize first row and first column
		table[0][0] = new PairAlignmentElement(0);
		PairAlignmentElement element;
		int value;
		for (int i = 1; i < table.length; i++) {
			value = table[i - 1][0].getValue()
					+ getScore(hSeq[i], PairAlignmentData.GAPSYMBOL, data);
			element = new PairAlignmentElement(value);
			element.setIsDerivedFromTop(true);
			table[i][0] = element;
		}

		// TODO <first: implement the the initialization of the first row>
		// TODO <second: fill each row of the matrix from left to right>

		return table;
	}

	@Override
	protected int getScore(char one, char two, PairAlignmentData data) {

		// TODO <implement the calculation of the score>

		return 0;
	}

	@Override
	protected void backtracking(int row, int column, PairAlignmentData data,
			PairAlignmentElement[][] table, BacktrackingPath path) {
		
		//Get the element at the position row,column
		PairAlignmentElement tableCell = table[row][column];

		// push the current position to a the path stack
		path.putPosition(row, column, tableCell.getValue(),
				data.getHorizontalSequenceAsArray()[row], data.getVerticalSequenceAsArray()[column]);

		// reached the upper left corner of the alignment table,
		// which is the end condition for the recursion
		if (row == 0 && column == 0) {

			// create an alignment from the path and add it
			// to a list of backtracked alignments
			path.createAlignment();
			path.popPosition();
			return;
		}
		// Hint: you need to distinguish from which direction the current cell
		// is derived.

		// TODO <implement the recursive calls>

		// remove the current position from the path
		path.popPosition();
	}

}
