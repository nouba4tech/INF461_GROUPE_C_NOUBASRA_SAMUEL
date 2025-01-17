package bridge;

public class Rectangle extends Forme{
	Rectangle (Couleur color){
		super(color);
	}

	public void colorier() {
		System.out.println("-----------------> Rectangle designed by the pattern Bridge\n");
		couleur.RemplirCouleur();
	}
}
