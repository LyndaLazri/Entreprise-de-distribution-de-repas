package Project;
import java.util.ArrayList;

public class Course {
	private Repas repas; 
	private Trajet livraison;
	private Véhicule vehicule; 
	private Salariés livreur;

	//constructeur
	public Course(Repas repas, Véhicule vehicule, Salariés livreur,Trajet livraison) {
	
		this.repas = repas;
		this.vehicule = vehicule;
		this.livreur = livreur;
		this.livraison= livraison;
		
		
	}
	//getters
	public Trajet getLivraison() {
		return this.livraison;
	}
	
	public Véhicule getVehicule() {
		return this.vehicule;
	}
	
	public Salariés getsalarié() {
		return this.livreur;
	}
	
	public Repas getRepas() {
		return this.repas;
	}
	
	//setters
	
	public void setLivraison(Trajet livraison) {
		this.livraison= livraison;
	}

	

	public void setVehicule(Véhicule vehicule) {
		this.vehicule = vehicule;
	}

	public void setLivreur(Salariés livreur) {
		this.livreur= livreur;
	}

	

	public void setRepas(Repas repas) {
		this.repas = repas;
	}

	//nous retourne   le maximum d'une charge d'une course entre celle du véhicule et celle du livreur
	public double getcharge() {
			return Math.max(livreur.getCharge(),vehicule.getCharge());
	}
	
	public String toString() {
		return "Course [repas=" + repas.toString() + ", livraison=" + livraison.toString() + ", "
				+ "vehicule=" + vehicule.toString() + ", livreur=" + livreur.toString() + "]";
	}

	
	
		
	//le CO2 emis
	public double getCo2Emission() {
		double taux = 0;
		if(vehicule instanceof vélo){
			taux = ((vélo) vehicule).getTaux() * livraison.getDisctanceCourse();
		}
		if(vehicule instanceof scooter){
			taux = ((scooter) vehicule).getTaux() * livraison.getDisctanceCourse();
		}
		return taux;
	}
	

}
