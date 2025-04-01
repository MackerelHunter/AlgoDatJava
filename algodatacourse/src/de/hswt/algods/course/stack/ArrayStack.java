package de.hswt.algods.course.stack;

import java.util.Iterator;
import de.hswt.algods.datastructures.Stack;

/**
 * @author Frank Lesske
 * @author <your name here>
 */
public class ArrayStack<T> implements Stack<T> {



	
	public ArrayStack() {
		// erzeuge einen leeren Stack
	}

	
	public ArrayStack(int mSize) {
		// erzeuge einen Stack der Größe mSize
	}

	/*
	 * Check if a stack is empty
	 */
	public boolean isEmpty() {
		// TODO <implement>

		return false; // change this to an appropriate value
	}

	/*
	 * Add element c on top 
	 */
	public void push(T c) {

		// TODO <implement>

	}

	/*
	public Stack<T> empty() {
		return null;
	}*/

	/*
	 * Remove the top element
	 */
	
	public void pop() {
	
		// TODO <implement>

	}

	/*
	 * Retrieve the top element
	 */
	public T top() {
		
		// TODO <implement>

		return null; // change this to an appropriate value
	}

/*--------------------------------------------------------------
 * Additional methods needed for testing
 * --------------------------------------------------------------
 */
	
	/*
	 * Clone this stack)
	 */
	public ArrayStack<T> clone() {

		// TODO <implement>

		return null; // change this to an appropriate value
	}

	/*
	 *  Tests if two stacks contain the same elements in the same order.
	 */
	public boolean equals(ArrayStack<T> stack) {

		// TODO <implement>

		return false; // change this to an appropriate value
	}


	/*
	 * Construct an empty stack
	 */
	public Stack<T> empty() {
		// TODO Auto-generated method stub
		return null;
	}


	/*
	 * Retrieve the current size of the stack
	 */
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
}