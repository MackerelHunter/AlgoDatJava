/*
 * Created on 02.11.2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package de.hswt.algods.course.stack;


import junit.framework.TestCase;

/**
 * @author Frank Lesske
 * @author <your name here>
 */
public class ListStackTest extends TestCase {

	public void testStackTest() {

		ListStack<Character> stack = new ListStack<Character>();

		//--- Testfall 1: isEmpty(Stack())
		
		assertTrue(stack.isEmpty());
		

		//--- Testfall 2: ! isEmpty(push(s,x))

		for (int i = 0; i < 15; i++) stack.push('a');
		assertTrue(!stack.isEmpty());

		//--- Testfall 3: top(push(s,x)) = x

		stack.push('b');
		char top = stack.top();

		assertEquals(top,'b');

		//--- Testfall 4: pop(push(s,x)) = s

		ListStack<Character> oldStack4 = stack.clone(); // wir müssen uns den Stack irgendwie merken, aber die Referenz zu kopieren, reicht nicht
		stack.push('x');
		stack.pop();
		//jetzt sollte inhaltlich der stack dem oldstack entsprechen
		assertTrue(stack.equals(oldStack4));

		//--- Testfall 5: push(pop(s),top(s)) = s

		ListStack<Character> oldStack5 = stack.clone();
		Character tempElement = stack.top();
		stack.pop();
		stack.push(tempElement);;
		assertTrue(stack.equals(oldStack5));
	}
}
