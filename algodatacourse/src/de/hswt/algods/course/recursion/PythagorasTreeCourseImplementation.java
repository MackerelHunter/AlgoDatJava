package de.hswt.algods.course.recursion;

import java.awt.Color;
import java.util.Random;

import de.hswt.algods.pythagoras.core.PythagorasTreeBranch;
import de.hswt.algods.pythagoras.core.PythagorasTreeServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author <your name here>
 */
@ServiceImplementation(id = "de.hswt.algo.pythagoras.course.PythagorasTreeCourseImplementation", name = "Course implementation", position = 100)
public class PythagorasTreeCourseImplementation extends
		PythagorasTreeServiceProvider {

	private final Random random = new Random();

	private final double tanphi = 0.6;

	@Override
	public void paintTreeBranch(int step, double x1, double y1, double x2,
			double y2) {
		Color color = new Color(random.nextInt(255), random.nextInt(255),
				random.nextInt(255));
		PythagorasTreeBranch branch = null;

		// Create a new branch. A branch is graphically depicted as
		// a square and a color.

		// You need to calculate the four corners of the square,
		// starting with the lower left point with coordinates x1, y1
		// and the lower right point, with coordinates x2 and y2.
		// TODO instantiate 4 points of type PythagorasTreePointDouble
		// as e.g. by p1 = new PythagorasTreePointDouble(x1,y1);
		// then create a new instantiation of PythagorasTreeBranch
		// as e.g. branch = new PythagorasTreeBranch(color, ....)
		// using the calculated points and the random color.

		// add branch to tree and update view
		addBranchToTree(branch);

		// now compute the two coordinates (v,w) as described in the exercise
		// sheet
		// TODO <implement computation: double v = ...>
		// w is calculated analogous to v

		// unless the maximum of steps is reached, continue painting using
		// recursion
		if (step < getBranchesMax()) {

			// make the recursive calls with incremented step amount and new
			// coordinates
			// Attention: each branch has two child branches
			// TODO <implement recursion>

		}
	}
}