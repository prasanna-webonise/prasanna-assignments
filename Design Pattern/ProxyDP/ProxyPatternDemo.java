package ProxyDP;

public class ProxyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 ImageImpl image = new ProxyImage("test_10mb.jpg");

	      //image will be loaded from disk
	      image.display(); 
	      //image will not be loaded from disk
	      image.display(); 
	}
}
