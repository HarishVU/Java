import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		//this is for palindrome string
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("enter the string:");
		name = scanner.nextLine();
		//String s1 = new String("dad");
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--) {
			reverse = reverse + name.charAt(i);
		}
		if(name.toLowerCase().equals(reverse.toLowerCase())){
			System.out.println(name +" palindrome");
		}
		else {
			System.out.println(name +" it is not palindrome");
		}
			
	//this is for palindrome number
		int n;
		System.out.println("enter the number:");
		n = scanner.nextInt();	
		int temp = n;
        int reversed = 0;
  
        while (n != 0) {
        	int digit = n % 10;
        	reversed = reversed * 10 + digit;
		    n /= 10;
        }		  
        if (temp == reversed) {
        	System.out.println(temp +" is palindrome");
        	} 
        else {
        	System.out.println(temp +" it is not palindrome");
        	}
        }
	}

