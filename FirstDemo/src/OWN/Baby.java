/*Just I try this*/

package OWN;
	
class Animals{
	void eat() {
		System.out.println("eating");
	}
	void sleep() {
		System.out.println("Sleeping");
	}
	
}
class Dogs extends Animals{
	void bark() {
		System.out.println("barking");
	}
}
class BabyDogs extends Dogs{
	void weeps() {
		System.out.println("weep");
	}
}
class Cats extends Animals{
	void meow() {
		System.out.println("meow");
	}
	
}

public class Baby {
	public static void main(String[] args) {
		Dogs d1 = new Dogs();
		Cats c = new Cats();
		BabyDogs bb = new BabyDogs();
		
		d1.bark();
		d1.eat();
		c.eat();
		c.meow();
		c.sleep();
		d1.sleep();
		bb.bark();
		bb.weeps();
		bb.eat();
	}

}
