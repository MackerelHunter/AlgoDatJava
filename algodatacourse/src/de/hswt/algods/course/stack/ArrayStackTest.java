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
public class ArrayStackTest extends TestCase {
	
	public void testStackTest() {
		
		ArrayStack<Character> stack = new ArrayStack<Character>(10);

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

		// TODO <implement test case 4>

		//--- Testfall 5: push(pop(s),top(s)) = s

		// TODO <implement test case 5>

	}
}
