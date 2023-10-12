//int rand = (int)(Math.random() * range) + min;
//here we are using that above method for printing random numbers.
public class ForEach10Num {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			int random = (int) (Math.random()*10) + 1;
			System.out.println(random);
		}	
	}
}
