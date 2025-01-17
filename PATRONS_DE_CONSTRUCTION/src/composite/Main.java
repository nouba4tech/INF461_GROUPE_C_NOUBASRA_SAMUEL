package composite;

public class Main {

	public static void main(String[] args) {

		// Creation des composants
		
		Composite root = new Composite();
		
		Leaf leaf1 = new Leaf(); 
		Leaf leaf2 = new Leaf(); 
		Leaf feuille3 = new Leaf();
		
		
		Composite composite1 = new Composite(); 
		Composite composite2 = new Composite();
		
		// Construction de  l'arbre
		
		root.add(leaf1);
		root.add(composite1);
		composite1.add(leaf2); 
		
		root.add(composite2);
		composite2.add(feuille3);

		
		//Appel de l'opération sur le composant racine
		root.operation();

	}

}
