
public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		System.out.println(multLikePeasant(5,5));
	}
	
	public static void diverseTests() {
		System.out.println(pow(10, 2));
		for (int i = 0; i <= 32; i++) {
			//System.out.println(pow(2,i));
			System.out.println(powRecursive(2, i));
		}
		einMalEins((byte)20);
		int[] testArray = new int[20];
		for (int i : testArray) {
			testArray[i] = (int) (Math.random()*101);
			//System.out.print(testArray[i]);
		}
	}
	
	public static void arrayTest() {
		System.out.println(arraySum(testArray));
		float[] polyTestArray = {1,1,2,1,2,1};
		int polyTestVariable = 2;
		int polyTestExponent = 5;
		System.out.println("Polynomauswertung normal: " + poly(polyTestArray, polyTestExponent, polyTestVariable));
		System.out.println((1*pow(2,0)+1*pow(2,1)+2*pow(2,2)+1*pow(2,3)+2*pow(2,4)+1*pow(2,5)));
	}
	
	public static long pow(int x, int n) {
		// 0-Check nicht nötig, da wir bei n=0 die for-Schleife gar nicht betreten (
		//		if (n == 0) {
//			return 1;
//		}
		long ergebnis = 1;
		for (int i = 0; i < n; i++) {
			ergebnis *= x;
		}
		return ergebnis;
	}
	
	public static long powRecursive(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x*powRecursive(x, n-1);
	}
	
	public static void einMalEins(byte ende) {
		for (int i = 1; i <= ende; i++) {
			for (int j = 1; j <= ende; j++) {
				System.out.print(i + "x" + j + "=" + i*j + ", ");
			}
		System.out.println("\n");
		}
	}
	
	public static int arraySum(int[] a) {
		int arraySum = 1;
		for (int i = 0; i < a.length; i++) {
			arraySum += a[i];
		}
		return arraySum;
	}
	
	public static float poly(float[] factorArray, int exponent, float variable) {
		//float result = 0; //besser mit a[0] inialisieren; spart eine Addition
		float result = factorArray[0];
		for (int i = 1; i <= exponent; i++) {
			result += factorArray[i]*powRecursive((int)variable, i);
		}
		return result;
	}
	
//	public static float hornerPoly(float[] factorArray, int exponent, float variable) {
//		float result = 1;
//		for (int i = exponent; i > 0; i--) {
//			result 
//		}
//	}
	
	//more efficient with large numbers
//	public static long binPower(int base, int exponent) {
//		String binString = Integer.toBinaryString(exponent);
//		int length = binString.length();
//		char c = binString.charAt(0); // first character
//		long result = 1;
//	}
	
	public static long multLikePeasant(int base, int exponent) {
		if (exponent == 0) return 1;
		long result = 1;
		while (exponent > 0) {
			if((exponent%2)!=0) {
				result *= base;
			}
			base = (int) Math.pow(base, 2);
			exponent /= 2;
		}
		return result;
	}

}


