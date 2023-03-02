package Project;

public class GPS {
	private double latitude;
	private double longitude;

	public GPS(double longitude,double latitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	} 
	
	//getters

	public double getLatitude() {
		return this.latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}
	
	//Setters
	
	public void setLatitude(double latitude) {
		this.latitude=latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude=longitude;
	}
	
	//Une méthode qui retourne la distance entre deux points.
	public double distance (GPS p) {
		return Math.sqrt((Math.pow(p.getLatitude()- this.getLatitude(), 2)
				+Math.pow(p.getLongitude()- this.getLongitude(),2)));
	}
	
	//Une méthode qui retourne un point GPS en chaine de caractères.
	public String toString() {
		return "PointGps[latitude=" +latitude + ",longitude=" + longitude + "]";
		
	}
	
	public boolean GPSValide() {
		boolean v = true;
		if (latitude > 550||longitude > 550|| latitude < 50 || longitude < 50 ) {
		return v =false;
		}
		return v;		
	}
}

