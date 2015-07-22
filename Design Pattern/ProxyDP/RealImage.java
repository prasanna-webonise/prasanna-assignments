/**
 * 
 */
package ProxyDP;

/**
 * @author webonise
 * 
 */
public class RealImage implements ImageImpl {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ProxyDP.ImageImpl#display()
	 */
	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	private void loadFromDisk(String fileName2) {
		System.out.println("Loading " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

}
