package proxy;

public class Main {

	public static void main(String[] args) {
	System.out.println("-----> Utilisation de proxy <-----");
	Image image1 = new ProxyImage("Photo1.jpg");
	Image image2 = new ProxyImage("Photo2.png");
	Image image3 = new ProxyImage("Photo3.JPG");



	
	image1.displayImage();
	image2.displayImage();
	image3.displayImage();


	
	}

}
