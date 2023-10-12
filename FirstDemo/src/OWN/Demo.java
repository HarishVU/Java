package OWN;

//Multilevel Inheritance//

class Dog extends Animal{
	void bark() {
		System.out.println("barkinggg");		
	}
	
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("Babydog is Weeping");
	}
}

public class Demo {	
	public static void main(String[] args) {
		System.out.println("Multilevel Inheritance");
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		BabyDog b1 = new BabyDog();
		b1.bark();
		b1.eat();
		b1.weep();
	
	}
	
}
