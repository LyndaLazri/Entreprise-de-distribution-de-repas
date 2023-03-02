package Project;
import java.util.ArrayList;
import java.util.Arrays;

public class progPrincipal {

	public static void main(String[] args) {
		
		//Variables
		double vitesseMoyenne;
		int taux;
		double cout;
		int cylindree;
		double consommation;
		int charge;
		double prix;
		String nom;
		int temps;
		int poids;
		double distance;
		boolean valide;
		String chaine;
		
		
          Cycliste C1 = new Cycliste ("Jade",55,7.1,"Cycliste débutant");
          ConducteursDeScooter C2 = new ConducteursDeScooter("Alferd" ,80,7.2);
          Cycliste C3 = new Cycliste ("Anna",67,7.4,"Cycliste expert");
          ConducteursDeScooter C4 = new ConducteursDeScooter("Tiago",62,7.2);
          Cycliste C5 =new Cycliste ("Blaise",74,7.25,"Cycliste sportif");
          
          vélo v1 = new vélo ("Cyclou",450);
          vélo v2 = new vélo ("Vavite",500);
          
          scooter s1 = new scooter ("Yamama",3500,300,50,7.5);
          scooter s2 = new scooter ("Vespo",2500,125,30,5.5);
          scooter s3 = new scooter ("Piagigi",2000,150,35,6);
          
          Temps t1 = new Temps (1,22,14);
          
          Repas r1 =new Repas(2,5);
          
          Point p1 =new Point (1.2,5);
          
          GPS g1 = new GPS (599,600);
          GPS g2 = new GPS (600,601);
         
          ArrayList<GPS> route1 = new ArrayList();
          route1.add(g1);
          route1.add(g2);
          
          Course Course1 = new Course (r1,v1,C1,route1);
         
          
          //La classe Salariés
          vitesseMoyenne=C1.getVitesseMoy();
          System.out.println("La vitesse moyenne de Jade  = " +vitesseMoyenne + "km/h");
          
          vitesseMoyenne=C3.getVitesseMoy();
          System.out.println("La vitesse moyenne de Anna  = " +vitesseMoyenne + "km/h");
          
          vitesseMoyenne=C5.getVitesseMoy();
          System.out.println("La vitesse moyenne de Blaise  = " +vitesseMoyenne + "km/h");
          
          //La classe Vélo
          
          nom = v1.getNom();
          System.out.println("Le nom de ce vélo :" +nom);
          
          nom = v2.getNom();
          System.out.println("Le nom de ce vélo :" +nom);
          
          
          taux=v1.getCo2Emission();
          System.out.println("Le taux d'émission de CO2 de ce vélo =" +taux );
          
          taux=v2.getCo2Emission();
          System.out.println("Le taux d'émission de CO2 de ce vélo =" +taux );
          
          cout = v1.getCoutUtilisation();
          System.out.println("Le coût d’utilisation sur un kilomètre =" +cout);
          
          cout = v2.getCoutUtilisation();
          System.out.println("Le coût d’utilisation sur un kilomètre =" +cout);
          
          vitesseMoyenne=v1.getVitesseMoyenne();
          System.out.println("La vitesse moyenne de ce vélo = " +vitesseMoyenne + "km/h");
          
          vitesseMoyenne=v2.getVitesseMoyenne();
          System.out.println("La vitesse moyenne de ce vélo = " +vitesseMoyenne + "km/h");
          
          //La classe Scooter
          nom =s1.getNom();
          System.out.println("Le nom de ce scooter :" +nom);
          
          nom =s2.getNom();
          System.out.println("Le nom de ce scooter :" +nom);
          
          nom =s3.getNom();
          System.out.println("Le nom de ce scooter :" +nom);
          
          cylindree = s1.getCylindree();
          System.out.println("La cylindrée de ce scooter = " +cylindree + "cm3");
          
          cylindree = s2.getCylindree();
          System.out.println("La cylindrée de ce scooter = " +cylindree + "cm3");
          
          cylindree = s3.getCylindree();
          System.out.println("La cylindrée de ce scooter = " +cylindree + "cm3");
          
          consommation =s1.getConsommation();
          System.out.println("La connsommation d'essence de ce scooter " + consommation );
          
          consommation =s2.getConsommation();
          System.out.println("La connsommation d'essence de ce scooter " + consommation);
          
          consommation =s3.getConsommation();
          System.out.println("La connsommation d'essence de ce scooter " + consommation);
          
          charge = s1.getCharge();
          System.out.println("La charge utile de ce scooter=" + charge +"kg");
          
          charge = s2.getCharge();
          System.out.println("La charge utile de ce scooter=" + charge +"kg");
          
          
          charge = s3.getCharge();
          System.out.println("La charge utile de ce scooter=" + charge +"kg");
          
          prix = s1.getPrix();
          System.out.println("Le prix de ce scooter =" +prix +"Euro");
          
          prix = s2.getPrix();
          System.out.println("Le prix de ce scooter =" +prix +"Euro");
          
          prix = s3.getPrix();
          System.out.println("Le prix de ce scooter =" +prix +"Euro");
          
          //La classe Temps   
          
          temps = t1.getTempsTotal();
          System.out.println("Le temps total = " + temps +"s");
          
          chaine =t1.toString();
          System.out.println(chaine);
          
          //La classe Repas
          poids = r1.getPoids();
          System.out.println("Le poids de ce repas =" +poids +"kg");
          
          distance = r1.getDistance();
          System.out.println("La distance =" +distance +"km");
          
          valide = r1.poidsValide();
          System.out.println(valide);
          
          chaine =r1.toString();
          System.out.println(chaine);
          
          //La classe GPS
          
          distance = g2.distance(g1);
          System.out.println("La distance entre ces deux points =" + distance +"km");
          
          chaine = g1.toString();
          System.out.println(chaine);
          
         valide = g1.GPSValide();
         System.out.println(valide);
         
         //La classe trajet
         chaine = route1.toString();
         System.out.println(chaine);
       
         //La classe course
         
         charge= (int) Course1.getcharge();
         System.out.println(charge);
         
         chaine = Course1.toString();
         System.out.println(chaine);
         

         
         
         
         
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
		
          

	}

}
