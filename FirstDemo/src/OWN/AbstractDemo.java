package OWN;

abstract class Employeee{
	abstract void display();
}
class Servant extends Employeee{
	void display() {
		System.out.println("your salary is");
	}
	void salary(double s) {
		double salary = 1000;
		System.out.println(salary);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Servant s1 = new Servant();
		s1.display();
		s1.salary(0);
	}
}
