public class BabylonRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wurzel von 9, Anfangsvermutung 5: " + rootLikeBabylon(9, 5, 0.00001));
		System.out.println("Wurzel von 3, Anfangsvermutung 2: " + rootLikeBabylon(3, 2, 0.00001));
		System.out.println("Wurzel von 3, Anfangsvermutung 2: " + rootLikeBabylon(0, 1, 0.00001));
	}
	
	static double rootLikeBabylon(double a, double x, double e) {
		if (x == 0) x = 1; // Sonderfall auffangen
		double xplusone = (x+(a/x))/2;
		// Abbruchkriterium kann nicht Funktion selbst enthalten, deswegen xplusone außerhalb von if-Schleife berechnen
		if (Math.abs(xplusone - x) <= e) {
			return xplusone;
		} else {
			return rootLikeBabylon(a, xplusone, e);
		}		
	}
}
