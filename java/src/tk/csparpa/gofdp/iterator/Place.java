package tk.csparpa.gofdp.iterator;

/**
 * POJO that represents a place in the world
 */
public class Place {
	
	private String toponym;
	private double latitude;
	private double longitude;
	
	public Place(String toponym, double latitude, double longitude) {
		this.toponym = toponym;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getToponym() {
		return toponym;
	}

	public void setToponym(String toponym) {
		this.toponym = toponym;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public void describe(){
		System.out.println(toponym + " - " + "lat=" + latitude + 
				" lon=" + longitude);
	}
}
