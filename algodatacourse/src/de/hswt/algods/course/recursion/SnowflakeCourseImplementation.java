package de.hswt.algods.course.recursion;

import de.hswt.algods.snowflake.core.SnowflakeServiceProvider;
import de.hswt.algods.snowflake.core.Turtle;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 *
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author <your name here>
 */
@ServiceImplementation(
		id = "de.hswt.algo.snowflake.course.SnowflakeCourseImplementation", 
		name = "Course implementation",
		position = 100)
public class SnowflakeCourseImplementation implements SnowflakeServiceProvider {

	public SnowflakeCourseImplementation() {
		super();
	}
	
	public void drawLine(Turtle turtle, float length) {
		turtle.penDown();
		turtle.forward(length);
		turtle.penUp();
	}

	
	public void drawOnePeak(Turtle turtle, float length) {
		drawLine(turtle, length / 3);
		turtle.turnLeft(60f);
		drawLine(turtle, length / 3);
		turtle.turnRight(120f);
		drawLine(turtle, length / 3);
		turtle.turnLeft(60f);
		drawLine(turtle, length / 3);
	}

	
	public void drawTwoPeaks(Turtle turtle, float length) {
		// To Do: implement a curve with two peaks
		drawOnePeak(turtle, length / 3);
		turtle.turnLeft(60f);
		drawOnePeak(turtle, length / 3);
		turtle.turnRight(120f);
		drawOnePeak(turtle, length / 3);
		turtle.turnLeft(60f);
		drawOnePeak(turtle, length / 3);
		
	}

	public void drawThreePeaks(Turtle turtle, float length) {
		// To Do: implement a curve with three peaks
		drawTwoPeaks(turtle, length / 3);
		turtle.turnLeft(60f);
		drawTwoPeaks(turtle, length / 3);
		turtle.turnRight(120f);
		drawTwoPeaks(turtle, length / 3);
		turtle.turnLeft(60f);
		drawTwoPeaks(turtle, length / 3);
	}

	public void drawMultiplePeaks(int n, Turtle turtle, float length) {
		if (n == 0) {
			drawLine(turtle, length);
		} else {
			// Der Trick ist es, mehrere Verzweigungen herbeizuführen, wie bei dem Binomialkoeffizienten
			drawMultiplePeaks(n-1, turtle, length/3);
			turtle.turnLeft(60f);
			drawMultiplePeaks(n-1, turtle, length/3);
			turtle.turnRight(120f);
			drawMultiplePeaks(n-1, turtle, length/3);
			turtle.turnLeft(60f);
			drawMultiplePeaks(n-1, turtle, length/3);
		}
	}
}	