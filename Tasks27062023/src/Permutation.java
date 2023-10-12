import java.util.*;
public class Permutation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> names = new ArrayList<Integer>();
		System.out.println("enter the letters");
		int n = scanner.nextInt();
		
		System.out.println("enter " + n + " numbers");
		for(int i=0;i<n;i++) {
			int num = scanner.nextInt();
			names.add(num);
		}
		System.out.println("ArrayList contents: "+names);
		
	}
	//permutation program 
//	
//		        generatePermutations(nums, 0);
//		    }
//
//		    public static void generatePermutations(String[] nums, int index) {
//		        if (index == nums.length - 1) {
//		            System.out.println(Arrays.toString(nums));
//		        } else {
//		            for (int i = index; i < nums.length; i++) {
//		                swap(nums, index, i);
//		                generatePermutations(nums, index + 1);
//		                swap(nums, index, i); // Backtrack
//		            }
//		        }
//		    }
//
//		    public static void swap(String[] nums, int i, int j) {
//		        String temp = nums[i];
//		        nums[i] = nums[j];
//		        nums[j] = temp;
//		    }
}

