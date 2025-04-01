package de.hswt.algods.course.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import junit.framework.TestCase;
import de.hswt.algods.stackdna.core.DNA;

public class DNATest extends TestCase {

	public static void testDNA() {
		String s1 = "atctttg";
		DNA dna2 = new DNAImpl(s1);
		String s2 = dna2.getStrand2();
		assertTrue(s2.equalsIgnoreCase("CAAAGAT"));
	}

	public static void main(String[] args) {
		System.out.print("DNA-Eingabesequenz: ");

		String dnaStrand = "";
		try {
			BufferedReader inBuffer = new BufferedReader(new InputStreamReader(
					System.in));
			dnaStrand = inBuffer.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		DNA dna = new DNAImpl(dnaStrand);

		System.out.println("Reverse complement: " + dna.getStrand2());

		testDNA();
	}

}