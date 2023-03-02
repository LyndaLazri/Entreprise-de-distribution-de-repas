package Project;

public class Temps {
	private int h;
	private int m;
	private int s;
	private int  tempsTotal; // Le temps tetal en seconde

	//Constructeur
	public Temps (int h,int m, int s) {
	this.h=h;
	this.m=m;
	this.s=s;
	this.tempsTotal= 0;

	}

	//getters

	public int getHeure() {
	return this.h;
	}

	public int getMinute() {
	return this.m;
	}

	public int getSeconde() {
	return this.s;
	}

	public int getTempsTotal() {
		return this.tempsTotal = (h*3600)+(m*60)+s;
	}

	//Setters

	public void setHeure(int h) {
	this.h=h;
	}

	public void setMinute(int m) {
	this.m=m;
	}

	public void setSeconde(int s) {
	this.s=s;
	}

	public void setTempsTotal(int tempsTotal) {
	this.tempsTotal= tempsTotal;
	}

	public String toString() {
	return "[" +h+  "h" +m+ "m" +s+ "s]";
	}
}


