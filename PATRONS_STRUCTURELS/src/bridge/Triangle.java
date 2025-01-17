package bridge;

public class Triangle extends Forme{
	Triangle(Couleur color){
		super(color);
		
	}
	
	public void colorier() {
		System.out.println("Triangle designed using Brigde\n");
		couleur.RemplirCouleur();
	}
}
