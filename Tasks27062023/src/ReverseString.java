/*How to reverse a string using for loop*/
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
//		StringBuilder s = new StringBuilder("Welcome to world");
//		System.out.println(s.reverse());
		Scanner scanner = new Scanner(System.in);
		String s1 = null;
		String reverse = "";
		System.out.println("enter the string: "+s1);
		s1 = scanner.nextLine();
		for(int i=s1.length()-1;i>=0;i--) {
			reverse += s1.charAt(i);
		}
		System.out.println(reverse);
		
		
	}
}
