package OWN;

public class CloneArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		System.out.println("printing original array");
		for(int i:arr1) {
			System.out.println(i);
	}
		System.out.println("printing cloning array");
		
		int[] arr2 = arr1.clone();
		for(int i:arr1) {
			System.out.println(i);
		}
			System.out.println(arr1==arr2);
}}
