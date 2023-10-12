import java.util.*;

public class StreamMin {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(6,5,8,2,3);
		
		Optional<Integer> result = list.stream()
				.sorted()
				.min(Integer::compareTo);
		System.out.println(result);
		
		// this is another way to find min & max values without optional class
		Integer min = list.stream()
				.min(Integer::compareTo)
				.orElse(null);
		if(min!=null) {
			System.out.println("this is minimum value " + min);
		}
		else {
			System.out.println("empty ");
		}
		Integer max = list.stream()
				.max(Integer::compareTo)
				.orElse(null);
		if(max!=null) {
			System.out.println("this is maximum value " + max);
		}
		else {
			System.out.println("empty ");
		}
	}
}
