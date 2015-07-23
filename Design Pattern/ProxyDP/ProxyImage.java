package ProxyDP;

public class ProxyImage implements ImageImpl {

	private RealImage realImage;
	private String fileName;
	public ProxyImage(String fileName) {
		this.fileName=fileName;
	}

	@Override
	public void display() {
		if(realImage == null){
	         realImage = new RealImage(fileName);
	      }
	      realImage.display();
	}

}
