package de.hswt.algods.course.stack;

import de.hswt.algods.stackam.core.ArithmeticMachineServiceProvider;
import de.hswt.algods.stackam.core.WrongSymbolException;
import de.hswt.atp.core.annotations.ServiceImplementation;

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
	
		// TODO <implement>

		return false; // change this to an appropriate value
	}

	@Override
	@SuppressWarnings("fallthrough")
	public String toPostfix() {
		
		// TODO <implement>

		return null; // change this to an appropriate value
	}

	@Override
	public int evaluateExpression(String postfix) {
		// TODO <implement>

		// save each stack to get a right looking stack visualization
		// saveStack(<your stack>);
		
		return 0; // change this to an appropriate value
	}
}
