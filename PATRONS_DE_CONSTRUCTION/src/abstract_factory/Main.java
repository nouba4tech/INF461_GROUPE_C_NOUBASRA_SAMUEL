package abstract_factory;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n-------------------------------> Nous sommes avec le pattern Abstract Factory <--------------------------------");
		ProduitFactory produitfactoryA = new ProduitFactoryA();
		ProduitFactory produitfactoryB = new ProduitFactoryB();
		ProduitFactory produitfactoryC = new ProduitFactoryC();
		Produit produit = null; 
		
		//Affiche un produit de type A
		produit =  produitfactoryA.getProduit();
		produit.utiliser();
		
		//Affiche un produit de type B
		produit =  produitfactoryB.getProduit();
		produit.utiliser();
		
		//Affiche un produit de type C
		produit =  produitfactoryC.getProduit();
		produit.utiliser();
	}

}
