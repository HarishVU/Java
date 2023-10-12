
public class PrefixSuffix {
	public static void main(String[] args) {
				
//		PreSuffix p = new PreSuffix();
//		p.important = "unimportant";
//		System.out.println(p);
		StringBuilder s1 = new StringBuilder("important");
		StringBuilder s2 = new StringBuilder("courage");
		StringBuilder[] s3 = new StringBuilder[10];
		System.out.println("prefix is " + s1.insert(0, "un"));
		s2.insert(0, "dis");	
		System.out.println("prefix is " +s2);
		s2.delete(0, 3);
		s2.insert(s2.length(), "ous");
		System.out.println("suffix is " +s2);
		
				
	}
}
