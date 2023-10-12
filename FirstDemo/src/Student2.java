class Student3{
	int id;
	String name;
	
	Student3(int i, String n){
		id = i;
		name = n;
		System.out.println("Hello");
	}
	Student3(){
		
	}
	void display() {
		System.out.println(id+ " " + name);
	}
	
}
public class Student2 {

	public static void main(String[] args) {
		
		Student3 s1 = new Student3(111, " vishnu ");
		Student3 s2 = s1;	
		
		System.out.println(s1.name);
//		s2.id = s1.id;
//		s2.name = s1.name;
		
		s1.display();
		s2.display();
	
	}
}
