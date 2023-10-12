class Box{
	int length;
	int breadth;
	int height;
	
	Box(){
		
	}
	Box(int l,int b,int h){
		length = l;
		breadth = b;
		height = h;
	}
	Box doubleBox() {
		Box temp = new Box();
		temp.length = 2 * this.length;
		temp.breadth = 2 * this.breadth;
		temp.height = 2 * this.height;
		//Box temp = new Box(2*length,2*breadth,2*height);
		return temp;
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		Box b1 = new Box(5,3,4);
		
		Box b3 = b1.doubleBox();//  here, we Returned the object b1....//Box b3 = here, temp reference is copied..
		
		System.out.println(b3.length);
		System.out.println(b3.breadth);
		System.out.println(b3.height);
	}
}
