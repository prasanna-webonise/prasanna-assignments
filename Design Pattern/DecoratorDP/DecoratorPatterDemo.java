/**
 * 
 */
package DecoratorDP;

/**
 * @author webonise
 *
 */
public class DecoratorPatterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape circle = new Circle();

	      Shape redCircle = new RedShapeDecorator(new Circle());

	      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.Draw();

	      System.out.println("\nCircle of red border");
	      redCircle.Draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.Draw();
	}

}
