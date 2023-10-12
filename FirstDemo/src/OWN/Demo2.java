package OWN;

class Cat extends Animal{
	void meow(){
		System.out.println("Meow");
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.meow();
		c1.eat();
	}

}
