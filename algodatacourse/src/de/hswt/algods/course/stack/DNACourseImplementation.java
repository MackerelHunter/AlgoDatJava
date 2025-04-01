/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hswt.algods.course.stack;

import de.hswt.algods.stackdna.core.DNA;
import de.hswt.algods.stackdna.core.DNAServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * 
 * @author Marco Luthardt
 */
@ServiceImplementation(id = "de.hswt.algo.stackdna.DNACourseImplementation", name = "Course implementation", position = 1)
@SuppressWarnings("unused")
public class DNACourseImplementation implements DNAServiceProvider {

	@Override
	public void executeUnitTest() {
		junit.textui.TestRunner.run(DNATest.class);
	}

	@Override
	public String reverseComplement(String strand) {
		DNA d = new DNAImpl(strand);
		return d.getStrand2();
	}
}
