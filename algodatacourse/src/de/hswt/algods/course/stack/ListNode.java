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
		return next;
	}
	
	@Override
	public void setNext(ListNode<T> elem) {
		next = elem;
	}

	@Override
	public void setData(T aData) {
		data = aData;
	}

	@Override
	public T getData() {
		return data;
	}
}
