
/*
 * This class defines the data elements of a data collection
 */
public class DataRecord {
	
	private Key key;
	private String name;
	
	public DataRecord(String s, Key k) {
		key = k;
		name = s;
	}
	
	public Key getKey() {
		return key;
	}
	
	public String toString() {
		return "[" + name + ": " + key+ "]";
	}
	
	public String getName() {
		return name;
	}

}
