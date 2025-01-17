package factory_method;

public class Main {

	public static void main(String[] args) {

		Fabrique fabrique = new FabriqueConcrete();
		Produit produit = fabrique.methodeFabrique();
		produit.utiliser();
		
	}

}
