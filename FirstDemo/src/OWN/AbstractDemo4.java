package OWN;

abstract class Bikes{
	Bikes(){
		System.out.println("Bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear changed");
	}
}
class TVS extends Bikes{
	void run() {
		System.out.println("TVS bike is running");
	}
}
public class AbstractDemo4 {

	public static void main(String[] args) {
		Bikes b = new TVS();
		b.changeGear();
		b.run();
	}
}
