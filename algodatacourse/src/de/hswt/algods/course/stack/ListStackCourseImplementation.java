package de.hswt.algods.course.stack;

import de.hswt.algods.datastructures.Stack;
import de.hswt.algods.stack.core.StackServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 *
 * @author Marco Luthardt
 */
@ServiceImplementation(
		id = "de.hswt.algo.stack.ListStackCourseImplementation", 
		name = "ListStack course implementation", position = 200)
public class ListStackCourseImplementation implements StackServiceProvider {

	@Override
	public void executeUnitTest() {
		junit.textui.TestRunner.run(ListStackTest.class);
	}

	@Override
	public Stack<Character> getStack() {
		return new ListStack<Character>();
	}
}
