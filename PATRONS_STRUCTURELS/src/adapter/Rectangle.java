package adapter;

public class Rectangle {
		public float longueur;
		public float largeur; 
		public Rectangle(float longueur , float largeur) {
			this.longueur = longueur; 
			this.largeur = largeur; 
		}
		
		public float Aire() {
			return longueur*largeur;
			
		}
		
		public float Perimetre() {
			return (longueur+largeur)*2;
		}
}
