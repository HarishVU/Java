import java.util.*;

public class StreamMax {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45,743,23,234);
		
		Optional<Integer> result = list.stream()
				.sorted()
				.max(Integer::compareTo);
		System.out.println("maximum value is : " + result);
		//here, this is without optional class
		Integer max = list.stream()
				.max(Integer::compareTo)
				.orElseThrow(NoSuchElementException::new);
		if(max!=null) {
			System.out.println("max value : " + max);
		}
		else {
			System.out.println("empty ");
		}
	}
}
