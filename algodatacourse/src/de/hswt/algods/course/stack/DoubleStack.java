package de.hswt.algods.course.stack;

import java.lang.StringBuilder;
import java.util.*;

public class DoubleStack<T> {

	private T[] content;
	private int index1;
	private int index2;
	private static final int DEFAULT_EXTENSION = 5;

	public DoubleStack(int size1, int size2) {
		content = (T[]) new Object[size1 + size2];
		index1 = -1;
		index2 = content.length;
	}

	public DoubleStack() {
		this(10, 10);
	}

	public boolean isEmpty1() {
		return index1 == -1;
	}

	public boolean isEmpty2() {
		return index2 == content.length;
	}

	public boolean isCompletelyEmpty() {
		return isEmpty1() && isEmpty2();
	}

	public boolean isFull() {
		return (index2 - index1) == 1;
	}

	public void extend(int extension) {
		int originalLength = content.length;
		content = Arrays.copyOf(content, content.length + extension);
		for (int i = originalLength-1; i >= index2; i--) {
			content[i+extension] = content[i];
		}
		index2 += extension;
		System.out.println("Stack extended!");
	}

	public void push1(T elem) {
		if (isFull()) {
			extend(DEFAULT_EXTENSION);
		}
		index1++;
		content[index1] = elem;
	}

	public void push2(T elem) {
		if (isFull()) {
			extend(DEFAULT_EXTENSION);
		}
		index2--;
		content[index2] = elem;
	}

	public void pop1() {
		if (!isEmpty1()) {
			index1--;
		}
	}

	public void pop2() {
		if (!isEmpty2()) {
			index2++;
		}
	}

	public T top1() {
		if (!isEmpty1()) {
			return content[index1];
		}
		return null;
	}

	public T top2() {
		if (!isEmpty2()) {
			return content[index2];
		}
		return null;
	}

	public T[] getContent() {
		return content;
	}

	public static void main(String[] args) {
		DoubleStack<Integer> bigStack = new DoubleStack<>(10,10);
		for (int i = 1; i <= 7; i++) {
			//bigStack.push1(i);
			bigStack.push1(i);
		}
		for (int i = 1; i <= 4; i++) {
			bigStack.push2(i);
		}
		System.out.println(Arrays.deepToString(bigStack.getContent()));
		System.out.println("Oberstes Element vom Stack 2: " + bigStack.top2());
		System.out.println("Oberstes Element vom Stack 1: " + bigStack.top1());
		for (int i = 10; i <= 20; i++) {
			bigStack.push2(i);
		}
		System.out.println(Arrays.deepToString(bigStack.getContent()));
		System.out.println("Oberstes Element vom Stack 2: " + bigStack.top2());
		System.out.println("Oberstes Element vom Stack 1: " + bigStack.top1());
		while (!bigStack.isEmpty1()) {
			bigStack.pop1();
		}
		while (!bigStack.isEmpty2()) {
			bigStack.pop2();
		}
		System.out.println(Arrays.deepToString(bigStack.getContent()));
		System.out.println("Oberstes Element vom Stack 2: " + bigStack.top2());
		System.out.println("Oberstes Element vom Stack 1: " + bigStack.top1());
		
		DoubleStack<Character> talkStack = new DoubleStack<>(5,5);
		String s1 = "Heute";
		String s2 = "Morgen";
		String s3 = "Übermorgen";
		for (int i = 0; i < s1.length(); i++) {
			talkStack.push1(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			talkStack.push2(s2.charAt(i));
		}
		System.out.println(Arrays.deepToString(talkStack.getContent()));
		for (int i = 0; i < s3.length(); i++) {
			talkStack.push2(s3.charAt(i));
		}
		System.out.println(Arrays.deepToString(talkStack.getContent()));
		StringBuilder sb = new StringBuilder();
		while (!talkStack.isEmpty1()) {
			sb.append(talkStack.top1());
			talkStack.pop1();
		}
		sb.reverse();
		System.out.println("String aus Stack 1: " + sb.toString());
		sb.setLength(0);
		while (!talkStack.isEmpty2()) {
			sb.append(talkStack.top2());
			talkStack.pop2();
		}
		sb.reverse();
		System.out.println("String aus Stack 2: " + sb.toString());
		sb.setLength(0);
	}

}
