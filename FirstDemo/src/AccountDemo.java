class Account{
	int acc_no;
	String name;
	double amount;
	
	void insert(int a,String n, double amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	void deposit(double amt) {
		amount = amount+amt;
		System.out.println(amount + " deposited");
	}
	
	void withdrawn(double amt) {
		if(amount<amt) {
			System.out.println("Insufficient balance");
		}
		else {
			amount = amount-amt;
			System.out.println(amount + " withdrawn");
		}
	}
	
	void display() {
		System.out.println(acc_no + "" +name+ "" +amount);
	}
	
	void checkBalance() {
		System.out.println("Balance is : " + amount);
	}
}
public class AccountDemo {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.insert(23456, " Bala ",10000);
		a1.display();
		a1.checkBalance();
		a1.deposit(120000);
		a1.checkBalance();
		a1.withdrawn(1300);
		a1.checkBalance();
	}
}
