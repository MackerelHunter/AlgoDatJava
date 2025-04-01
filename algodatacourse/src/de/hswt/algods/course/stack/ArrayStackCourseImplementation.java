package de.hswt.algods.course.stack;

import de.hswt.algods.datastructures.Stack;
import de.hswt.algods.datastructures.StackPrivate;
import de.hswt.algods.stack.core.StackServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * 
 * @author Marco Luthardt
 */
@ServiceImplementation(
		id = "de.hswt.algo.stack.course.ArrayStackCourseImplementation", 
		name = "ArrayStack course implementation", position = 200)
public class ArrayStackCourseImplementation implements StackServiceProvider {

	@Override
	public void executeUnitTest() {
		junit.textui.TestRunner.run(ArrayStackTest.class);
	}

	@Override
	public Stack<Character> getStack() {
		return new ArrayStack<Character>(10);
	}
}
