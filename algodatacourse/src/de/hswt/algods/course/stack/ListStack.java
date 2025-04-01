package de.hswt.algods.course.stack;

import de.hswt.algods.datastructures.Stack;

/**
 * @author Frank Lesske
 * @author <your name here>
 */
public class ListStack<T> implements Stack<T> {
	
	ListNode<T> first = null;

	public ListStack() {
		first = null;
	}
	
	@Override
	public Stack<T> empty() {		

		// TODO <implement>

		return null; // change this to an appropriate value
	}

	@Override
	public boolean isEmpty() {

		// TODO <implement>

		return false; // change this to an appropriate value
	}

	@Override
	public void pop() {

		// TODO <implement>

	}

	@Override
	public void push(T element) {

		// TODO <implement>

	}

	@Override
	public T top() {

		// TODO <implement>

		return null; // change this to an appropriate value
	}
	
	@Override
	public ListStack<T> clone() {

		// TODO <implement>

		return null; // change this to an appropriate value
	}
	
	@Override
	public boolean equals(Object obj) {

		// TODO <implement>

		return false; // change this to an appropriate value
	}

	@Override
	public int getSize() {

		// TODO <implement>

		return 0; // change this to an appropriate value
	}	
}
