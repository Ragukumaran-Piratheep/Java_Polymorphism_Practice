public class Rectangle extends Shape implements Colorable {
	private String color;
	
	@Override
	public void draw() {
		System.out.println("Draw the "+color+" Rectangle");
	}
	public Rectangle(String color){
		this.color = color;	
	}
	public void setColor(String color) {
		this.color = color;
	}
}