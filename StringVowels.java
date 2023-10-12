import java.util.Scanner;

public class StringVowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n;
		System.out.println("enter the string");
		n=scanner.nextLine();
		int count = 0;
		for(int i=0;i<n.length();i++) {
			char ch = n.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch);
			}
		}
	}
}
