package de.hswt.algods.course.oop;

import de.hswt.algods.oop.core.OOPServiceProvider;
import de.hswt.algods.oop.core.Printer;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * Do not touch the code in this class. It is only an entry point for the
 * framework. Nothing has to be implemented in this file.
 * 
 * @author Marco Luthardt
 */
@ServiceImplementation(id = "de.hswt.algo.oop.course.OOPCourseImplementation", name = "Course implementation", position = 100)
public class OOPCourseImplementation implements OOPServiceProvider {

	@Override
	public void competition(Printer out) {
		Meisterschaft.start(out);
	}

}
