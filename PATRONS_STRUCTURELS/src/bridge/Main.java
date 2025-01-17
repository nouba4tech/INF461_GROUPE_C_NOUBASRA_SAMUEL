package bridge;

public class Main {

	public static void main(String[] args) {

		System.out.println("----------------> Using design pattern Bridge <----------------\n");
		
		System.out.println("----------------> Utilisation de la couleur Rouge <----------------\n"); 
		//Rectangle de couleur rouge
		Forme s1 = new Rectangle(new CouleurRouge());
		s1.colorier();
		
		//Cercle de couleur rouge
		Forme C1 = new Cercle(new CouleurRouge());
		C1.colorier();
		
		//Triangle de couleur rouge
		Forme t1 = new Triangle(new CouleurRouge());
		t1.colorier();
		
		System.out.println("-----> Utilisation de la couleur Bleue <-------\n"); 
		//Rectangle de couleur bleue
		Forme s2 = new Rectangle(new CouleurBleu());
		s2.colorier();
		
		//Cercle de couleur rouge
		Forme C2 = new Cercle(new CouleurRouge());
		C2.colorier();
		
		//Triangle de couleur bleue
		
		Forme t2 = new Triangle(new CouleurBleu());
		t2.colorier();
		
		System.out.println("Utilisation de la couleur noir\n"); 
		
		//Rectangle de couleur noire
		
		Forme s3 = new Rectangle(new CouleurNoir());
		s3.colorier();
		
		// Cercle de couleur noire
		
		Forme C3 = new Cercle(new CouleurNoir());
		C3.colorier();
		
		Forme t3 = new Triangle(new CouleurNoir());
		t3.colorier();
		
		System.out.println("Changement de couleurs\n");
		//Affecter la couleur Rouge à la couleur bleue
		C1 = C2;
		C1.colorier();
		
		//Affecter la couleur noire à la couleur rouge
		C2 = C3;
		C2.colorier();
		
		t1 = t2; t1.colorier();
		
		t3 = t2; 
		
		t3.colorier();
		
		
		System.out.println("----> Mission accomplie <----");
	}

}
