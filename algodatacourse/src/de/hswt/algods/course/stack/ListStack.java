package de.hswt.algods.course.stack;

import de.hswt.algods.datastructures.Stack;

/**
 * @author Frank Lesske
 * @author Julius Radl
 */
public class ListStack<T> implements Stack<T> {

	private ListNode<T> first = null;

	public ListStack() {
		first = null;
	}

	@Override
	public Stack<T> empty() {		
		return new ListStack();
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public void pop() {
		if (!isEmpty()) {
			first = first.getNext(); //entferne oberstes Element und setze Zeiger auf Nachfolger
		}
	}

	@Override
	public void push(T element) {
		ListNode<T> neu = new ListNode<T>(element); // Neues ListNode erzeugen mit Inhalt element
		neu.setNext(first); // first ist reiner Zeiger, die auf nächsten Knoten zeigt, kein ListNode selbst
		first = neu; // first auf neu zeigen lassen
	}

	@Override
	public T top() {
		if (isEmpty()) {
			return null;
		}
		return first.getData();
	}

	@Override
	public ListStack<T> clone() {
		ListStack<T> clone = new ListStack<>(); // Den Clone-Stack erzeugen
		ListNode<T> tmp = first; // Zeiger, mit dem wir den Original-Stack durchlaufen
		ListNode<T> previous = null;
		while (tmp != null) {
			ListNode<T> node = new ListNode<T>();
			node.setData(tmp.getData()); // wir befüllen den neuen Knoten mit den Daten aus tmp
			if (tmp == first) { //erstes Element wird kopiert
				clone.first = node; // Wir zeigen mit first auf den neuen Knoten, wenn es der erste ist
			} else {
				previous.setNext(node); // Wir lassen den Vorgänger-Knoten auf den neuen Knoten zeigen
			}
			previous = node; // Jetzt wird der neue Knoten des Clone-Stacks zum vorherigen Knoten des nächsten Durchlaufs
			tmp = tmp.getNext(); // Wir wandern im Originalstack eins nach vorne
		}
		return clone;
	}

	@Override
	public boolean equals(Object obj) { // Könnte eigentlich auch mit ListStack funktionieren
		if (obj instanceof ListStack) {
			ListStack<T> stack2 = (ListStack<T>)obj;
			ListNode<T> tmp1 = first;
			ListNode<T> tmp2 = stack2.first;
			while(tmp1 != null || tmp2 != null) { // Es reicht nicht, tmp1 zu prüfen, sonst hören wir vielleicth auf, wenn tmp1 null ist, d.h. der erste ListStack zu Ende ist, aber der zweite noch weiter läuft
				if(tmp1.getData() != tmp2.getData()) { // wenn eins von beiden null ist, aber das andere nicht, geben wir false zurück (die ListStacks sind unterschiedlich lang)
					return false;
				}
				tmp1 = tmp1.getNext();
				tmp2 = tmp2.getNext();
			}
		}
		return true;
	}

	@Override
	public int getSize() {
		int counter = 0;
		ListNode<T> tmp = first;
		while (tmp != null) {
			counter++;
			tmp = tmp.getNext();
		}
		return counter;
	}	
}
