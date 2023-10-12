/* just I try this one 
 * 
 */
class StaticVariable1{
	int rollno;
	String name;
	int age;
	String school = "Highschool";
	String college = "KLN";


	StaticVariable1(int r, String n){
		rollno = r;
		name  = n;
		
	}
	StaticVariable1(){
		
	}
	void setStudent(int r,String n){
		rollno = r;
		name = n;
		
	}
	void check(int age) {
	if(age<=18) {
		String school = " Highschool";
		System.out.println(age + school);
	}
	else {
		String college = " KLN";
		System.out.println(age + college);
	}
		
	}
	
	void display() {
		System.out.println(rollno + " " + name + " " );
	}

}

public class StaticDemo {
	public static void main(String[] args) {
		
		StaticVariable1 s1 = new StaticVariable1(123, " Arya ");
		StaticVariable1 s2 = new StaticVariable1(124, " Barath ");
		
		s1.display();
		s1.check(21);
		s2.display();
		s2.check(18);
		
//		s1.StaticVariable(132, "Surya" , 15, "  ");
	}

}
