import java.util.*;
/*Write a Java 8 program to get the sum of all numbers present in a list?*/
public class Java8Sum {
	public static void main(String[] args) {
		
		List<Integer> alist = Arrays.asList(21,123,132,12);
		
		int sum = alist.stream()
				.reduce(0, (element1, element2) -> (element1 + element2 ));
		
		System.out.println("total sum is: "+sum);
		
		
		
	}
}
