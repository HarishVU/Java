class Employee{
	int id;
	String name;
	double salary;
	
	void insert(int i,String n,double s) {
		id = i;
		name = n;
		salary = s;
	}
	void employeeDetails() {
		System.out.println(id+ "" +name+ "" +salary);
	}
}
public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(); //here we called class file of employee
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.insert(101," Haris ",15000.12);// we are called the insert method
		e2.insert(102, " Sabari ",16000);
		e3.insert(103," Ganesh ",15000);
		
		e1.employeeDetails();// here we called employyeeDetails
		e2.employeeDetails();
		e3.employeeDetails();
		
		String text = "eclipse workspace \"JRE\" and";
		System.out.println(text);
	}

}
