package de.hswt.algods.course.oop;

/**
 * Simulation eines 5000m Rennnens mit einem Teilnehmerfeld
 * 
 * @author Frank Lesske
 * @author <your name here>
 */
public class Rennen {
	// Instanzvariablen
	private Laeufer[] feld;
	
	/**
	 * Methode mit der Laeufer (gleichzeitig) zu einem Rennen angemeldet
	 * werden
	 */
	public void anmelden(Laeufer[] einFeld) {
		feld = einFeld;
	}

	/**
	 * Das Rennen wird gestartet und somit durchgefuehrt.
	 */
	public void start() {
		// beim Start faengt jeder Laeufer an zu rennen
		// Implementierung fehlt
		// TODO
	}

	/**
	 * Durchfuehrung der Siegerehrung mit Bestimmung der Plazierung.
	 */
	public void siegerEhrung() {
		// es sollen die besten 6 Laeufer ausgegeben werden (mit Hilfe der
		// Methode drucke in Klasse Laeufer)
		// TODO
	}
}
