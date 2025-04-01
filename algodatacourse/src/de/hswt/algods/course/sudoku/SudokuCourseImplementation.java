package de.hswt.algods.course.sudoku;

import java.io.InputStream;
import java.util.ArrayList;

import de.hswt.algods.sudoku.core.SudokuMatrix;
import de.hswt.algods.sudoku.core.SudokuServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author <your name here>
 */
@ServiceImplementation(id = "de.hswt.algo.sudoku.course.SudokuCourseImplementation", name = "Course implementation", position=120)
public class SudokuCourseImplementation extends SudokuServiceProvider {

	
	@Override
	protected boolean solve(int row, int column) {
		int[][] matrix = getMatrix();
		// reached the end of the matrix, return true to signal the end
		if (row > (matrix.length - 1) || column > matrix[0].length - 1) {
			return true;
		}

		// TODO <implement the check of validity for row and column of the given
		// element>
		// Class variables you need: matrix (2D 9x9 (row x column) int array
		// which represents a sudoku)

		// no valid number found, return false
		matrix[row][column] = 0;
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.sudoku.core.SudokuServiceProvider#isValid(int, int)
	 */
	@Override
	protected boolean isValid(int row, int column) {
		int[][] matrix = getMatrix();
		int k = matrix[row][column];

		/*
		 * Class variables you need: matrix (2D 9x9 (row x column) int array
		 * which represents a sudoku).
		 */

		// TODO <implement the check of validity for row and column of the given
		// element>

		// check row
		for (int i = 0; i < matrix[row].length; i++) {
			// check

		}

		// check column
		// ...

		return true;
	}

	@Override
	protected ArrayList<SudokuMatrix> getSudokus() {
		ArrayList<SudokuMatrix> sudokus = new ArrayList<SudokuMatrix>();

		InputStream in = SudokuCourseImplementation.class
				.getResourceAsStream("sudoku17");

		if (in == null) {
			return sudokus;
		}
		
		
		
	

		// TODO <implement the sudoku source file parsing>

		return sudokus;
	}
}
