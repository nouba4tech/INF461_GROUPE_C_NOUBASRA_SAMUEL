package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		
		Singleton singleton2 = Singleton.getInstance();

		//Les 2 variables referent le meme objet
		
		System.out.println(singleton1 == singleton2); // Affiche true pour vérifier que les 2 objets ont meme reference
	}

}
