package AbstractFact;

import FactMthd.ProduitB;

public class ProduitFactory2 implements IProduitFactory{
	
	public ProduitA getProduitA() {
		return ProduitA2();
	}

	private ProduitA ProduitA2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProduitB getProduitB() {
		// TODO Auto-generated method stub
		return new ProduitB();
	}

}
