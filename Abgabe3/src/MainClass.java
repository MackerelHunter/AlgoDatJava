public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Name gefunden: " + demonstrateBinarySearch());
	}
	
	static String demonstrateBinarySearch() {
		
		String[] testArray = new String[] {"Anna", "Bertha", "Claudia", "Doris", "Eva",
				"Franziska", "Gabi", "Hanna", "Ina", "Jana", "Karin", "Lena", "Monika", "Nadine"};
		int low = 0;
		int high = testArray.length-1;
		String key = "Monika";
		System.out.println("Gesuchter Name: " + key);
		while (high >= low) {
			int middle = (low + high)/2;
			String tempName = testArray[middle];
			System.out.printf("Position: %2d, Name an Position: %10s, Obergrenze: %2d,"
					+ " Untergrenze: %2d \n", middle, tempName, high, low);
			if (tempName.compareToIgnoreCase(key)==0) {
				return testArray[middle];
			}
			if (tempName.compareToIgnoreCase(key)>0) {
				high = middle-1;
			}
			if (tempName.compareToIgnoreCase(key)<0) {
				low = middle+1;
			}
		}
		return null; // nothing found
	}
}
