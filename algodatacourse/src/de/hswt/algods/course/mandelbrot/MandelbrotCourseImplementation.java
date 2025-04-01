package de.hswt.algods.course.mandelbrot;

import java.util.ArrayList;

import de.hswt.algods.mandelbrot.core.MandelbrotPixel;
import de.hswt.algods.mandelbrot.core.MandelbrotServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author <your name here>
 */
@ServiceImplementation(id = "de.hswt.algo.mandelbrot.course.MandelbrotCourseImplementation", name = "Course implementation", position = 100)
public class MandelbrotCourseImplementation implements
		MandelbrotServiceProvider {

	private int limit = 100; // limit number to decide whether the sequence
								// diverges or not

	private float aMin = -2.2F; // minimum value for the real part
	private float bMin = -1.5F; // minimum value for the imaginary part

	private float aMax = 0.8F; // maximum value for the real part
	private float bMax = 1.5F; // maximum value for the imaginary part

	private int xMax = 500; // number of steps in x direction
	private int yMax = 500; // number of steps in y direction

	private float deltaA = (aMax - aMin) / xMax;
	private float deltaB = (bMax - bMin) / yMax;

	private int nMax = 255; // maximal number of iterations

	@Override
	public ArrayList<MandelbrotPixel> getMandelbrotPixel(int xMax, int yMax,
			float aMin, float bMin, float deltaA, float deltaB, int nMax,
			int limit) {

		// To change any value comment out the accordant assigning line in this
		// method and set the desired value to the class variable.

		this.limit = limit;

		this.aMin = aMin;
		this.bMin = bMin;

		this.xMax = xMax;
		this.yMax = yMax;

		this.deltaA = deltaA;
		this.deltaB = deltaB;

		this.nMax = nMax;

		return getMandelbrotPixel();
	}

	public ArrayList<MandelbrotPixel> getMandelbrotPixel() {

		ArrayList<MandelbrotPixel> pixel = new ArrayList<MandelbrotPixel>();

		// first loop: change c to x-direction stepwise
		for (int i = 0; i <= xMax; i++) {
			double A = aMin + i * deltaA;
			// second loop: change c to y-direction stepwise
			for (int j = 0; j <= yMax; j++) {
				double B = bMin + j * deltaB;

				int n = 0; // loop counter for inner loop

				// inner loop: check if iterated calculation of z
				// using c = (A,B) (see exercise sheet 1) is diverging within
				// nmax iterations;
				// the end of the inner loop is reached when either the
				// absolute value of the n-th z (calculated from real and
				// imaginary part)
				// exceeds the limit (then n holds the corresponding number of
				// iterations)
				// or when n = nmax (the sequence is assumed to converge)

				// TODO <implement the inner loop>

				pixel.add(new MandelbrotPixel(j, i, n));
			}
		}
		return pixel;
	}
}
