package Project;

public class Salariés {
	    private String nom;
	    private double poids;
	    private double salaire;
	    

	    //constructeur
	    public Salariés(String nom, double poids, double salaire){
	        this.nom= nom;
	        this.poids = poids;
	        this.salaire=salaire;
	        }
	    
	   //getters
	  
	    public String getNom() {
	        return this.nom;
	    }

	    public double getPoids() {
	        return this.poids;
	    }
	    public double getSalaire() {
	        return this.salaire;
	    }
	    public double getCharge() {
	        return this.getPoids() / 8;
	    }
	    
	    
	   
	    //setters

	    public void setNom(String nom) {
	        this.nom = nom;
	    }


	    public void setPoids(double poids) {
	        this.poids=poids;
	    }
	    
	    public void setSalaire(double salaire) {
	        this.salaire = salaire;
	    }
	    
	    //
	    public String toString() {
	        return " [Le nom de salarié=" + nom + ", son poids=" + poids +"]";
	    }


	}


