package de.hswt.algods.course.stack;

import de.hswt.algods.stackam.core.ArithmeticMachineServiceProvider;
import de.hswt.algods.stackam.core.WrongSymbolException;
import de.hswt.atp.core.annotations.ServiceImplementation;

import java.util.Arrays;

import de.hswt.algods.datastructures.Stack;

/**
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author <your name here>
 */
@ServiceImplementation(
		id = "de.hswt.algo.stack.course.ArithmeticMachineCourseImplementation", 
		name = "Course implementation", position = 200)
public class ArithmeticMachineCourseImplementation
extends ArithmeticMachineServiceProvider {

	// contains the current infix expression
	private StringBuffer infix;

	@Override
	@SuppressWarnings("fallthrough")
	public void scanExpression(String exp) throws WrongSymbolException {

		infix = new StringBuffer();
		if (exp == null) {
			return;
		}

		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
			switch (c) {
			case ' ' : break;
			case '+' : ;
			case '-' : ;
			case '*' : ;
			case '/' : ;
			case '(' : ;
			case ')' : 
				infix.append(c);
				break;
			case '0' : ;
			case '1' : ;
			case '2' : ;
			case '3' : ;
			case '4' : ;
			case '5' : ;
			case '6' : ;
			case '7' : ;
			case '8' : ;
			case '9' : 
				infix.append(c);
				break;
			default: throw new WrongSymbolException(c);					
			}
		}

	}

	@Override
	public boolean checkExpression() {
		Stack<Character> stack = new ListStack<Character>();
		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);
			switch (c) {
			case '(': stack.push(c); break;
			case ')': if (stack.isEmpty()) {
				return false;
			}
			stack.pop();
			default:
			}
		}
		return stack.isEmpty();
	}

	@Override
	@SuppressWarnings("fallthrough")
	public String toPostfix() {
		StringBuffer result = new StringBuffer();
		Stack<Character> stack = new ListStack<Character>();
		for (int i = 0; i < infix.length(); i++) {
			Character c = infix.charAt(i);
			if (Character.isDigit(c)) {
				result.append(c);
			} else if (c.toString().matches("[\\Q*-+/\\E]")){
				stack.push(c);
			} else if (c == ')') {
				result.append(stack.top());
				stack.pop();
			}
		}
		if (!stack.isEmpty()) result.append(stack.top()); // falls äußere Klammern fehlen, wird der letzte Operator noch angehängt
		return result.toString(); // change this to an appropriate value
	}

	@Override
	public int evaluateExpression(String postfix) { //Zeichen müssen in Zahlenwerte umgewandelt werden
		Stack<Integer> stack = new ListStack<Integer>();
		int value1, value2;
		for (int i = 0; i < postfix.length(); i++) {
			Character c = postfix.charAt(i);
			if (Character.isDigit(c)) {
				stack.push(Character.valueOf(c)-Character.valueOf('0'));
			}
			else {
				value2 = stack.top();
				stack.pop();
				value1 = stack.top();
				stack.pop();
				switch (c) {
				case '+': value1 += value2; break;
				case '-': value1 -= value2; break;
				case '*': value1 *= value2; break;
				case '/': value1 /= value2; break;
				}
				stack.push(value1);
			}
			saveStack(stack);
		}
		return stack.top();
	}
}

