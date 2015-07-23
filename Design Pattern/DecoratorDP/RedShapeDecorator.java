package DecoratorDP;

public class RedShapeDecorator extends ShapeDecorator {

	
	
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void Draw() {
		 decoratedShape.Draw();	       
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }

}
