
/*
 * The key class for sorting.
 */
public class Key implements Comparable<Key> {

	/*
	key value is an integer
	 */
	private int value;
	
	public Key(int v) {
		value = v;
	}
	
	/*
	 * This method defines how to compare two keys
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Key w) {
		return value - w.value;
	}
	
	/*
	 * Formatting the print output
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "" + value;
	}

}
