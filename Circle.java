public class Circle extends Shape implements Colorable {
	
	private String color;
	
	@Override
	public void draw() {
		System.out.println("Draw the Circle");
	}
	public Circle(String color) {
		this.color = color;
	}
	
	@Override
	public void setColor(String color) {
		this.color = color;
	}
}