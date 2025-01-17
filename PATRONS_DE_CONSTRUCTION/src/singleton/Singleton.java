package singleton;

public class Singleton {
	
	private static Singleton instance; 
	
	private void Singleton() {
		// Le constructeur privé par défaut
	}
	
public static Singleton getInstance() {
	if (instance == null) {
		instance = new Singleton();
	}
	return instance; 
}


}
