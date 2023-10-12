import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/

public class Startwith1Stream {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(12);
		list.add(53);
		list.add(324);
		
		Stream<Integer> start  = list.stream();
			start.map(i -> i+"")	//we are converting integer to string
				.filter(c -> c.startsWith("1"))
				.forEach(n -> System.out.println(n));//here, we collect the list
		
	}
}
