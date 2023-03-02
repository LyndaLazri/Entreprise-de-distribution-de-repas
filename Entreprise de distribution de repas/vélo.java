package Project;

public class vélo extends Véhicule {
	
	public vélo (String nom, int prix) {
		super (nom,prix,0,0,0,0);
	}
	
	//L'émission de CO2 moyenne = 0 pour un vélo.
	public int getCo2Emission() {
		return 0;
	}
	
	//Le cout d'utilisation  sur un km = prix d'Achat / 30000.
	public double getCoutUtilisation() {
		return this.getPrix()/30000;
	}
	
	/*La vitesse moyenne d'un vélo va dépendre du cycliste qui l'utilise,
	 * Donc on va retourner 0,
	 * et puis on ajoute la vitesse du cycliste pour
	 *  le calcul de la vitesse moyenne d'un employé */
	public double getVitesseMoyenne() {
		return 0;
	}

}
