package Project;
import java.util.ArrayList;


public class Trajet {
	
	private ArrayList<GPS> route;
	   
	   
	   //constructeur 
	   public Trajet() {
		   ArrayList<GPS> route1 =new ArrayList<GPS>();   
	   }
	   
	   
	   public void addPoint(GPS g) {
		   this.route.add(g);
	   }
	   
	   
	   public double getDisctanceCourse() {
		   double distance=0;
		   for(int i=0 ;i<this.route.size()-1;i++) {
			   distance=distance+route.get(i).distance(route.get(i+1));
		   }
		   return distance/20;
	   }
		   
		   
		   public String toString() {
			   return "La route du trajet est:" + route.toString()+"]";
		   }
		
	   }


