
public class StringScenario {
	public StringScenario(java.lang.String string) {
		// TODO Auto-generated constructor stub
	}
	void String(String s1,String s2){
	}
	public static void main(String[] args) {
		
		StringScenario s = new StringScenario("java");

		String s1 = new String("java");
		String s2 = new String("java");
	
		System.out.println(s);
		if(s1 == s2) {		//compare memory location//primitive datatype
			System.out.println("==");
			}
		else
			System.out.println("not ==");
		if(s1.equals(s2))	//compare value//object
			System.out.println("equals");
		else
			System.out.println("not equals");
	}
}
