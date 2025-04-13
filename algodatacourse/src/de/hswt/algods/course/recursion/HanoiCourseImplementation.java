package de.hswt.algods.course.recursion;
	
import de.hswt.algods.hanoi.core.HanoiServiceProvider;
import de.hswt.algods.hanoi.core.Tower;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * 
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author <your name here>
 */
@ServiceImplementation(
		id = "de.hswt.algo.hanoi.course.HanoiCourseImplementation", 
		name = "Course implementation", position = 100)
public class HanoiCourseImplementation extends HanoiServiceProvider {

	@Override
	public void hanoi(int n, Tower a, Tower b, Tower c) {

		// TODO implement a recursive algorithm to shift all disks
		// from tower a to tower c using b as temporarily storage
		// use method "moveRing" from class HanoiServiceProvider
		
		if (n > 0) {
			hanoi(n-1, a, c, b);
			moveRing(a, c);
			hanoi(n-1, b, a, c);
		} else {
			moveRing(a, b);
		}
		
	}

}
