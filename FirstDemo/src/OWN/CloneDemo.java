package OWN;

class Department{
	int deptid;
	String name;
	Department(int id,String n){
		deptid = id;
		name = n;
	}
	void display() {
		System.out.println("deptid " + deptid);
		System.out.println("dept name is " + name);
	}
}
class Stud implements Cloneable{
	int id;
	String name;
	Department dept;
	Stud(int i,String n,Department d){
		id = i;
		name = n;
		dept = d;
	}

	void display() {
		System.out.println("id is " + id);
		System.out.println("name is " + name);
		dept.display();
}

protected Object clone() throws CloneNotSupportedException{
	return super.clone();
}}
public class CloneDemo {

	public static void main(String[] args)  throws CloneNotSupportedException{
		Department dept = new Department(1,"physics");
		Stud s1 = new Stud(1,"hari",dept);
		Stud s2 = (Stud)s1.clone();

//		dept.display();
//		dept.name = "maths";
		s2.display();
		s1.display();
	}
}