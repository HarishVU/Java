class Student1{
	int id;
	String name;
	int age;
	
	Student1(int i,String n){
		id = i;
		name = n;
	}
	
	Student1(int i,String n,int a){
		id = i;
		name = n;
		age = a;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Student1 [id=" + id + ", name=" + name ]";
//	}
	
//	void display() {
//		System.out.println(id + " " + name + " " + age);
//	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1(1001," Arya ");
		Student1 s2 = new Student1(1002," Surya ",22);
		
//		s1.display();
//		s2.display();
		
		System.out.println(s2.toString());
	}
}
