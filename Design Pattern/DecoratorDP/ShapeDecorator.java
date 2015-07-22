package DecoratorDP;

public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;
	public ShapeDecorator(Shape shape) {
		this.decoratedShape=shape;
	}

	@Override
	public void Draw() {
		decoratedShape.Draw();
	}

}
