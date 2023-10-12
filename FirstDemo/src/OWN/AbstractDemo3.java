package OWN;

abstract class Bank{
	abstract int rateOfInterest();
}
class SBI extends Bank{
	int rateOfInterest() {
		return 7;
	}
}
class IOB extends Bank{
	int rateOfInterest() {
		return 8;
	}
}

public class AbstractDemo3 {

	public static void main(String[] args) {
		Bank b; 
		b = new SBI();
		System.out.println("SBI rate of interest is : " + b.rateOfInterest() + " % " );
		b.rateOfInterest();
		
		b = new IOB();
		System.out.println("IOB rate of interest is : " + b.rateOfInterest() + " % " );
		b.rateOfInterest();
	}
}
