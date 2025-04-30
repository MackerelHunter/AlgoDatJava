package de.hswt.algods.course.stack;

import de.hswt.algods.datastructures.Stack;
import de.hswt.algods.stackdna.core.DNA;
import java.lang.StringBuilder;

public class DNAImpl implements DNA {

	private String strand1 = null;
	private String strand2 = null;

	public DNAImpl(String s1) {
		if (s1.length() < 1)
			throw new IllegalArgumentException(
					"Strand must be of length 1 or longer");
		strand1 = s1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.stackdna.core.DNA#getStrand1()
	 */
	@Override
	public String getStrand1() {
		return strand1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.stackdna.core.DNA#getStrand2()
	 */
	@Override
	public String getStrand2() {
		if (strand2 == null && strand1.length() > 0) {
			strand2 = reverseComplement(strand1);
		}
		return strand2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.stackdna.core.DNA#stringToStack(java.lang.String)
	 */
	@Override
	public Stack<Character> stringToStack(String original) {
		int size = original.length();
		Stack<Character> stack = new ArrayStack<Character>(size);
		for (int i = 0; i < size; i++) {
			stack.push(original.charAt(i));
		}
		return stack;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.stackdna.core.DNA#reverseComplement(java.lang.String)
	 */
	@Override
	public String reverseComplement(String original) {
		original = original.toLowerCase();
		original.replaceAll("[^acgt]", "?");
		Stack<Character> stack = stringToStack(original);
		String legend = "acgt?TGCA?";
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			char tmp = legend.charAt(legend.indexOf(stack.top())+5);
			sb.append(tmp);
			stack.pop();
		}
		return sb.toString();
	}
}
