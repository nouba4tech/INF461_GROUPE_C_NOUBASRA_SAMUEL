package composite;

//Classe feuille qui implémente l'interface Component
public class Leaf implements Component{

	@Override
	public void operation() {
		System.out.println("\n-------------------> Opération de la feuille <-----------------------");
	
	}
	

}
