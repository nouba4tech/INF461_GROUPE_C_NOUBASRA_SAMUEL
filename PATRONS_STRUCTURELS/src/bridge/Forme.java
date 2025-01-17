package bridge;

public abstract class Forme {
	
	Couleur couleur;
	Forme(Couleur couleur){
		this.couleur = couleur; 
	}

	abstract public void colorier();
}
