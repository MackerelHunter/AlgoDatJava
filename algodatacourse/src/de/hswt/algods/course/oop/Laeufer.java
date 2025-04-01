package de.hswt.algods.course.oop;

import java.util.Random;

import de.hswt.algods.oop.core.Printer;

/**
 * Vordefinierte Klasse Laeufer
 * 
 * @author Frank Lesske
 * @author <your name here>
 */
public class Laeufer {
	// Instanzvariablen
	private int zeitOffset; // um wieviel langsamer als der Weltrekord
	private Random random; // Zufallsgenerator
	private String name;
	private final Printer out;

	/**
	 * Konstruktor
	 */
	public Laeufer(Printer out) {
		// initialisiere die Instanzvariablen
		zeitOffset = 0;
		random = new Random();
		this.out = out;
	}

	/**
	 * Methode setName fehlt noch
	 */
	public void setName(String aName) {
		// TODO <set name>
	}

	/**
	 * Simulation eines Laufes - die Endzeit wird zufaellig bestimmt.
	 */
	public void run() {
		// TODO <run>
	}

	/**
	 * Get-Methode fuer den offset
	 * 
	 * @return den offset-Wert
	 */
	public int getOffset() {
		// TODO <return offset>
		return -1;
	}

	/**
	 * Methode zum Ausdrucken des Ergebnisses (d.h. Platz und Zeit)
	 */
	public void drucke(int platz) {
		out.println(platz + "-ter Platz: " + name + " in " + formatZeit());
	}

	/**
	 * Initerne Methode zum Formatieren der Zeit
	 */
	private String formatZeit() {
		StringBuffer buf = new StringBuffer(10);
		buf.append("1");
		if (zeitOffset < 3000) {
			buf.append("2:");
			buf.append(3 + (zeitOffset / 1000));
		} else {
			buf.append("3:");
			buf.append((zeitOffset / 1000) - 3);
		}
		int temp = zeitOffset % 1000;
		buf.append(temp / 100);
		buf.append(",");
		temp = temp % 100;
		buf.append(temp / 10);
		temp = temp % 10;
		buf.append(temp);
		return buf.toString();
	}

}
