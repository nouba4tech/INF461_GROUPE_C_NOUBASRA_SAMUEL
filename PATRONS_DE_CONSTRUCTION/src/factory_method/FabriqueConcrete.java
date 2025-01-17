package factory_method;

public class FabriqueConcrete extends Fabrique {

	@Override
	public Produit methodeFabrique() {
		return new ProduitConcret(); 
	}
}
