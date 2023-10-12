import java.util.*;
//Fahrenheit and Celcius program
public class FarenheitCelcius {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double fahrenheit;
		double celcius;
		System.out.println("Enter the temparature in Fahrenheit: ");
		fahrenheit = scanner.nextDouble();
		
		double cel = (fahrenheit-32)*5/9;
		System.out.println("Fahrenheit to Celcius:" +cel);
		
		System.out.println("Enter the temparatuere in Celcius: ");
		celcius = scanner.nextDouble();
		
		double cel2 = (celcius*9/5)+32;
		System.out.println("Celcius to Fahrenheit:" +cel2);
	}
}
