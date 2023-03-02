package Project;

public class Véhicule {
	private String nom;
	private double prix;
	protected double vitesse; //la vitesse moyenne est en km/h.
	protected double taux; //le taux d'émission de CO2 en gr/km.
	protected int charge; //la charge est en kg.
	protected double cout; //le cout est en euros par km.
	
	public Véhicule (String nom, double prix,double vitesse,double taux,int charge,double cout) {
		this.nom =nom;
		this.prix=prix;
		this.vitesse = vitesse;
		this.taux = taux;
		this.charge = charge;
		this.cout =cout;
	}
	//getters
	public String getNom() {
		return this.nom;
	}
	
	public double getPrix() {
		return this.prix;
	}
	
	public double getVitesse() {
		return this.vitesse;
	}
	
	public double getTaux() {
		return this.taux;
	}
	
	public int getCharge() {
		return this.charge;
	}
	
	public double getCout() {
		return this.cout;
	}
	
//setters 
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrix(double prix) {
		this.prix=prix;
	}
	public void setCharge(int charge) {
		this.charge=charge;
	}
	public void setTaux(double taux) {
		this.taux=taux;
	}
	public void setVitesse(double vitesse) {
		this.vitesse=vitesse;
	}



}
