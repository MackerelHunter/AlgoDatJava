package de.hswt.algods.course.stack;

import de.hswt.algods.datastructures.ListElement;

/**
 * @author Frank Lesske
 * @author <your name here>
 */
public class ListNode<T> implements ListElement<T, ListNode<T>> {

	private T data;
	private ListNode<T> next;

	public ListNode() {
		data = null;
		next = null;
	}
	public ListNode(T e){
		data = e;
		next = null;
	}
	
	
	@Override
	public ListNode<T> getNext() {

		// TODO <implement>

		return null; // change this to an appropriate value
	}
	
	@Override
	public void setNext(ListNode<T> elem) {
		
		// TODO <implement>

	}

	@Override
	public void setData(T aData) {
	
		// TODO <implement>

	}

	@Override
	public T getData() {

		// TODO <implement>

		return null; // change this to an appropriate value
	}
}
