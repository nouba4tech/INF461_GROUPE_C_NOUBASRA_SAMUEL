package AbstractFact;

import FactMthd.ProduitB;

public class ProduitFactory1 implements IProduitFactory{
	
	public ProduitA getProduitA() {
		return new ProduitA1();
	}

	@Override
	public ProduitB getProduitB() {
		// TODO Auto-generated method stub
		return new ProduitB();
	}
}

