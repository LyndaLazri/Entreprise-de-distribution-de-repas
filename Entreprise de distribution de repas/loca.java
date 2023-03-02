/*package InterfacesGraphics;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt. Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing. ImageIcon;
import Project.GPS;
import java.io.DataInputStream;
import java.net.URL;
import java.net.URLConnection;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class location {
    private GPS position;
    private ArrayList <ruelle> Adresse;
    private double largeur ,longueur;
    private boolean restaurant ;
    private BufferedImage image;

    //constructeur
    public  location (GPS position, double largeur, double longueur, ArrayList<ruelle>adresse,boolean restaurant ) {
    this.position=position;
    this.Adresse=adresse;
    this.largeur=largeur;
    this.longueur=longueur ;
    }
    	
    public void dessiner (Graphics graph)
    {
    graph.dessinerImage(image.this.position.getlongitude()-(largeur/2),this.position.getLongitude()-(longueur/2) , largeur, longueur, null);

}
*/