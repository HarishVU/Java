import java.util.*;

public class Demo {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(1,2,3,0,12,14,2,3,0);
	System.out.println(list);
	list.removeIf(n -> (n==0));
	System.out.println(list);
	
}
}
