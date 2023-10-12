class Studentt{
	int rollno;
	String name;
	static String college = "KLN";
	
	static void change() {
		college = "SIT";
	}
	
	Studentt(int r,String n){
		rollno = r;
		name = n;
		
	}
	void display() {
		System.out.println(rollno + " " + name + " " + college);
		}
}
public class Student4 {

	public static void main(String[] args) {
		
		Studentt s1 = new Studentt(123, " aa ");
		Studentt s2 = new Studentt(124, " bb ");
		s1.display();
		Studentt.change();
		s1.display();
		s2.display();
	}
}
