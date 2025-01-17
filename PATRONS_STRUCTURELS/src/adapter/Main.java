package adapter;

public class Main {

	public static void main(String[] args) {

		System.out.print("--------------> Le patron Adapter ");
			Carre carre = new Carre(5);
			System.out.print("\n\n--------------> L'aire de notre carré vaut : "+carre.Aire());
			System.out.print("\n\n--------------> Le périmètre vaut : "+carre.Perimetre());
			
		AdaptRectangle rect = new AdaptRectangle(new Rectangle( 3,5));
		
		System.out.println("\n\n--------------> L'aire du rectangle est : "+rect.Aire());
		System.out.println("\n\n--------------> Le périmètre du rectangle vaut: "+rect.Perimetre());
	
	}

}
