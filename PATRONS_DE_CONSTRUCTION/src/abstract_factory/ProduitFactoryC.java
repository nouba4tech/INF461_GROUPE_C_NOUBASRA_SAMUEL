package abstract_factory;

public class ProduitFactoryC extends ProduitFactory{
	protected Produit createProduit() {
		Produit produit = null;
		produit = new ProduitC();
		return produit;
	}
	
}
