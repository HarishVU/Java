package OWN;

class Employee{
	float salary = 40000;
}

class Programmer extends Employee{

	float bonus = 10000;
	float add;
	
	void check(float a) {
		a = salary + bonus;
		add = a;}
	void display() {System.out.println(add);
	}
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("the salary is : " +p.salary);
		System.out.println("the bonus is : " + p.bonus);
	
		p.check(0);
		p.display();
	}

}

