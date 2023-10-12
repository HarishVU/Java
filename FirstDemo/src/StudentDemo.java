class Student{
	int id;
	String name;
	
	void insertRecord(int r, String n) {
		id = r;
		name = n;
	}
	void displayInformation() {
		System.out.println(id + " " + name);
	}
}
public class StudentDemo {

	public static void main(String[] args) {
	Student s1 = new Student();    
	Student s2 = new Student();
	
	/* here is the another method of insert the values into the Student object.
	 * we can use directly like this
	 * Student s1 = new Student(101,"haris");
	 * Student s2 = new Student(102,"sabari");
	 * but, this type we can use only when we created a constructor
	 * Student(int r, String n){
	 * id = r;
	 * name = n;
	 * 
	 */
	
	s1.id = 101;
	s1.name = "haris";
	
	s2.id = 102;
	s2.name = "sabari";
	
	s1.displayInformation();
	s2.displayInformation();
	
	}
}
