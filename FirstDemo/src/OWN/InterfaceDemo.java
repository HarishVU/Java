package OWN;

interface Ridable {
	void ride();
	default void display() {
		System.out.println("Hello from ridable interface");
	}
	
}

class Car implements Ridable{
	public void ride() {
		System.out.println("you are riding a car");
	}
	public void display() {
		System.out.println("hello from car class");
	}
}
class Bike implements Ridable{
	public void ride() {
		System.out.println("you are riding a bike");
	}
}

class Mechanic{
	void check(Ridable r ) {
		System.out.println("checking");
	}
}
public class InterfaceDemo{

	public static void main(String[] args) {
		Ridable r = new Car();
		Car c = new Car();
		Bike b = new Bike();
		Mechanic m = new Mechanic();
		
		c.display();
		m.check(b);
		c.ride();
		m.check(c);
		
	}
		
	}
