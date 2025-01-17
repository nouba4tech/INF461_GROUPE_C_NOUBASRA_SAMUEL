package bridge;

public class Cercle extends Forme{
	Cercle(Couleur color){
	super(color);	
	}
	
	public void colorier() {
		System.out.println("\n----------------> Design Cercle using Bridge");
		couleur.RemplirCouleur();
	}
}
