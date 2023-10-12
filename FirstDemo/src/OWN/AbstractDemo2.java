package OWN;

abstract class Shape{
	abstract void draw();
}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
//		Circle c1 = new Circle();
//		Rectangle r1 = new Rectangle();
//		
//		c1.draw();
//		r1.draw();
		
		Shape s = new Circle(); ///In a real scenario, object is provided through method, e.g., getShape() method 
		s.draw();
		
		Shape s1 = new Rectangle();
		s1.draw();
	}
}
