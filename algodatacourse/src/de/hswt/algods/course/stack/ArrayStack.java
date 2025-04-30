package de.hswt.algods.course.stack;
import java.util.*;
import java.util.function.*;

import java.util.Iterator;
import de.hswt.algods.datastructures.Stack;

/**
 * @author Frank Lesske
 * @author <Julius :-)>
 */
public class ArrayStack<T> implements Stack<T> {

	// Array für den Stackinhalt
	private T[] inhalt; // alle Elemente sind vom Typ T
	// Index für das obere Stack-Ende
	private int index;

	
	public ArrayStack() {
		// erzeuge einen leeren Stack
		this(10);
	}

	
	public ArrayStack(int mSize) {
		// erzeuge einen Stack der Größe mSize
		inhalt = (T[]) new Object[mSize];
		index = -1; // 0 wäre das erste freie Element, -1 ist das oberste
	}

	/*
	 * Check if a stack is empty
	 */
	public boolean isEmpty() {
		// TODO <implement>
		return (index == -1);
		// return false; // change this to an appropriate value
	}
	
	//*** Meine eigene isFull-Funktion
	public boolean isFull() {
		return (inhalt.length-1 == index);
	}

	/*
	 * Add element c on top 
	 */
	public void push(T c) {
		if (isFull()) {
			inhalt = Arrays.copyOf(inhalt, inhalt.length+1);
		}
		index++;
		inhalt[index] = c;
	}
	
	/*
	 * Remove the top element
	 */
	
	public void pop() {
	
		// falls der Stack nicht leer ist, index dekrementieren
		if (!isEmpty()) {
			index--;
		}
	}

	/*
	 * Retrieve the top element
	 */
	public T top() {
		
		if (!isEmpty()) {
			return inhalt[index];
		}
		return null; // change this to an appropriate value
		// Man könnte auch eine angemessene Exception werfen, aber wir machen's uns einfach
	}

/*--------------------------------------------------------------
 * Additional methods needed for testing
 * --------------------------------------------------------------
 */
	
	/*
	 * Clone this stack)
	 */
	public ArrayStack<T> clone() {
		ArrayStack<T> clone = new ArrayStack<T>(this.inhalt.length);
		clone.index = this.index;
		clone.inhalt = Arrays.copyOf(this.inhalt, inhalt.length); // keine Deep Copy erwünscht
		return clone;
	}

	/*
	 *  Tests if two stacks contain the same elements in the same order.
	 */
	public boolean equals(ArrayStack<T> stack) {

		if (this.index != stack.index) {
			return false;
		}
		for (int i = 0; i <= index; i++) {
			if (this.inhalt[i] != stack.inhalt[i]) {
				return false;
			}
		}
		return true;
	}


	/*
	 * Construct an empty stack
	 */
	public Stack<T> empty() { // brauchen wir nicht, da wir schon den Konstruktor haben
		// TODO Auto-generated method stub
		return null;
	}


	/*
	 * Retrieve the current size of the stack
	 */
	public int getSize() {
		// TODO Auto-generated method stub
		return index+1;
	}

	

	
	
}