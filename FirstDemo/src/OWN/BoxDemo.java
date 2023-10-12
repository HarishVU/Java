package OWN;

class Box{
	int length;
	int breadth;
	int height;
	
	Box(int l,int b,int h){
		length = l;
		breadth = b;
		height = h;
	}
	boolean isEqual(Box b) {
		b.length++;
		if(length==b.length && breadth==b.breadth && height==b.height)
			return true;
		return false;
	}
}

public class BoxDemo {

	static void increment(int a) {
		a++;
	}
	public static void main(String[] args) {
		int a = 10;
		increment(a);
		increment(a);
		
		System.out.println(a);
		
		Box b1 = new Box(5,3,4);
		Box b2 = new Box(5,3,4);
		
		System.out.println(b1.isEqual(b2));
		System.out.println(b2.length);
	}
}
