import java.util.Arrays;

/*find out the given strings are anagram or not*/

public class AnagramString {
	public static void main(String[] args) {
		
		String s1 = new String("hoello");
		String s2 = new String("ohlelo");
		
			//here, we are converting String to charArray
			char[] c1 = s1.toCharArray();
			Arrays.sort(c1);	//sorting the charArray
			System.out.println(c1);
			char[] c2 = s2.toCharArray();
			Arrays.sort(c2);
			System.out.println(c2);
			
			//we are converting charArray to String 
			String s4 = Arrays.toString(c1);
			System.out.println(s4);
			
			String s5 = Arrays.toString(c2);
			System.out.println(s5);
			
			if(s4.contentEquals(s5)) {
			System.out.println("anagram");
			}
			else {
			System.out.println("it is not anagram");
			}
	}
}
