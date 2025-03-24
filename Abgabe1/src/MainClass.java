
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polyTest();
		exponentiationTest();
	}
	
	static void polyTest() {
		float[] factorArray = {1,1,2,1,2,1};
		int maxExponent = 5;
		float variable = 2;
		System.out.println("Polynomauswertung normal: " + poly(factorArray, maxExponent, variable));
		System.out.println("Polynomauswertung per Horner-Schema: " + hornerPoly(factorArray, maxExponent, variable));
		
	}
	
	static void exponentiationTest() {
		System.out.println("Potenz via Exponentiation: " + binPower(13, 3));
	}
	//Aufgabe 7a)
	static float poly(float[] factorArray, int maxExponent, float variable) {
		float result = factorArray[0];
		for (int i = 1; i <= maxExponent; i++) {
			result += factorArray[i]*Math.pow(variable, i);
		}
		return result;
	}
	//Aufgabe 7b)
	static float hornerPoly(float[] factorArray, int maxExponent, float variable) {
		float result = factorArray[maxExponent];
		for (int i = maxExponent-1; i >= 0; i--) {
			result = (result * variable) + factorArray[i];
		}
		return result;
	}
	
	//Aufgabe 8b)
	static long binPower(int exponent, int base) {
		String binaryExponent = Integer.toBinaryString(exponent);
		//result als base initialisieren, da das erste Zeichen der Binärzahl 1 sein muss
		long result = base;
		for (int i = 1; i < binaryExponent.length(); i++) {
			//Folgende Zeile darf nicht in die if-Abfrage; es wird immer quadriert
			result = (long) Math.pow(result,2);
			if (binaryExponent.charAt(i)=='1') {
				result *= base;
			}
		}
		return result;
	}
}
