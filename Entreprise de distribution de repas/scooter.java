package Project;

public class scooter extends Véhicule  {
	private int cylindree;
	private double consommation;//c'est la consommation moyenne d'essence en litres par 100km.
	
	
	public static double prixEssence =1.50;
	
	public scooter (String nom,int prix, int cout,int cylindree,double consommation) {
		
		super(nom,prix,30+cylindree/50,cylindree/4,0,prix/20000+(consommation*prix/100));
		
		this.cylindree = cylindree;
		this.consommation = consommation;
	}
		public int getCylindree(){
			return this.cylindree;
		}
		
		public double getConsommation() {
			return this.consommation;
		}

}


