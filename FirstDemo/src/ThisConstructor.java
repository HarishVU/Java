class Student5{
	int rollno;
	String name,course;
	float fee;
	
	Student5(int no,String ii,String v){
		this.rollno = no;
		this.name = ii;
		this.course = v;
		System.out.println("Hi");
	}
	
	Student5(int rollno,String name,String course,float fee){
//		this.rollno= rollno;
//		this.name = name;
//		this.course = course;
		this(rollno,name,course);
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
//	void display() {
//		
//		System.out.println("Naveen");
//	}
}
public class ThisConstructor {
	public static void main(String[] args) {
		
		Student5 s1 = new Student5(001,"vikram", "java");
		Student5 s2 = new Student5(002,"dhruv", "java", 5000f);
		
		s1.display();
		s2.display();
	}

}
