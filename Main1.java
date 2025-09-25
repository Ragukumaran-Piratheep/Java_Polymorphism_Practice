public class Main1 {
	public static void main(String [] args) {
		Shape[] shapes = new Shape[2];
			
		Circle circle = new Circle();
		circle.setColor("red");
		
		Rectangle rectangle = new Rectangle();
		rectangle.setColor("Blue");
		
		shapes[0] = circle;
		shapes[1] = rectangle;
		
		for(Shape shape : shapes) {
			shape.draw();
		}
	}
}