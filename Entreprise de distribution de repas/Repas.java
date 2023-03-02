package Project;

public class Repas {
	private int poids;
	private double distance;
	
	public Repas(int poids, double distance){
		this.poids = poids;
		this.distance = distance; 
		
	}
	
	//getters
	
	public int getPoids() {
		return this.poids;
	}
	
	public double getDistance() {
		return this.distance;
	}
	
	//Une méthode qui retourne un booléen false si le poids est inférieure à 0;)
	
	public boolean poidsValide() {
		if(this.poids<0) 
			return false;
		    return false;
		
	
	}
    //Une méthode qui retourne le poids en kg et la distance en km
	public String toString() {
		return " Le poids du repas =" + poids + "kg" + ",et sa distance=" + distance + "km"+ "]";
	}
	//setters
	
	public void setPoids(int poids) {
		this.poids=poids;
	}
	public void setDistance(double distance) {
		this.distance=distance;
	}



}

