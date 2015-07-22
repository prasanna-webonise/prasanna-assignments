/**
 * 
 */
package FacadeDP;

/**
 * @author webonise
 *
 */
public class ShapeMaker {

	/**
	 * 
	 */
	Rctangle rctangle;
	Square square;
	public ShapeMaker() {
		rctangle=new Rctangle();
		square=new Square();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
	public void drawRectangle() {
		rctangle.draw();
	}

}
