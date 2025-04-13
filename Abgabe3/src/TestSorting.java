import java.util.Arrays;

/**
 * @author Frank Lesske
 *         < hier Namen angeben >
 * */

public class TestSorting {

	/*
	 * Tests, whether a given DataCollection (array of DataRecord-Objects) is sorted.
	 */
	public static boolean isSorted(DataRecord[] daten) {
		for (int i = 0; i < daten.length-1; i++) {		
			
			/* 
			Da die Name im Array von Anfang an lexikographisch unsortiert sind,
			gehe ich davon aus, dass wir die Keys vergleichen sollen. Ansonsten
			wäre das hier meine Implementierung.
			
			if (daten[i].getName().compareToIgnoreCase(daten[i+1].getName()) > 0) {
				return false;
			}
			*/
			
			if (daten[i].getKey().compareTo(daten[i+1].getKey()) > 0) {
				return false;
			}
		} 
		return true;
	}

	//------------------------------------------------------------------

	/*
	 * The main method for testing the implementation
	 */
	public static void main(String[] args) throws WrongUnSortedException, WrongSortedException {

		TestSorting testSearch = new TestSorting();

		// construct an array of data elements
		String[] namen = {"Amalia", "Anton", "Dieter", "Doris", "Fritz", "Frieda"};
		DataRecord[] daten = new DataRecord[6];
		for (int i = 0; i < daten.length; i++) {
			daten[i] = new DataRecord(namen[i], new Key(i));
		}

		// first test: this array is sorted
		if (! isSorted(daten)) 
			throw testSearch.new WrongUnSortedException(daten);
		else 
			System.out.println("Well done. This array is sorted");

		// mix the elements
		DataRecord[] unsortedData = {daten[0], daten[1], daten[3], daten[4], daten[2]};

		// second test: this array is not sorted
		if (isSorted(unsortedData)) 
			throw testSearch.new WrongSortedException(unsortedData);
		else 
			System.out.println("Well done. This array is not sorted");


		// another mess up
		DataRecord[] unsortedData2 = {daten[3], daten[0], daten[2]};

		// third test: this array is not sorted
		if (isSorted(unsortedData2)) 
			throw testSearch.new WrongSortedException(unsortedData2);
		else 
			System.out.println("Well done. This array is not sorted");

		// another test case
		DataRecord[] unsortedData3 = {daten[0], daten[1], daten[2], daten[4], daten[3]};

		// last test: this array is not sorted
		if (isSorted(unsortedData3)) 
			throw testSearch.new WrongSortedException(unsortedData3);
		else 
			System.out.println("Well done. This array is not sorted");
	}

	/******  Two internal exceptions ******************************/

	class WrongSortedException extends Exception {

		public WrongSortedException() {
			super("Array is not sorted");
		}

		public WrongSortedException(DataRecord[] data) {
			super("Data collection " + Arrays.toString(data) + " was wrongly classified as beeing sorted");
		}

	}

	class WrongUnSortedException extends Exception {

		public WrongUnSortedException() {
			super("Array is sorted");
		}

		public WrongUnSortedException(DataRecord[] data) {
			super("Data collection " + Arrays.toString(data) + " was wrongly classified as beeing unsorted");
		}

	}

}
