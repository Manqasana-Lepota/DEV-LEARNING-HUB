package abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		GraphicObject cirle = new Circle();
		cirle.draw();
		cirle.resize();
		
		GraphicObject rectangle = new Rectangle();
		rectangle.draw();
		rectangle.resize();

	}

}
