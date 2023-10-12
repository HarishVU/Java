package OWN;

class Account{
	private long acc_no;
	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", name=" + name + ", email=" + email + ", amount=" + amount + "]";
	}
	private String name,email;
	private float amount;
	
	public long getAcc_no(){
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}

public class EncapsuleDemo {

	public static void main(String[] args) {
		Account a1 = new Account();
		
		
		a1.setAcc_no(1330201130l);
		a1.setName("Harish");
		a1.setEmail("hari123@gmail.com");
		a1.setAmount(30000f);
		System.out.println(a1.toString());

		
		System.out.println("your accno is :\\n " + a1.getAcc_no() + "\n " + a1.getName() + " " + a1.getEmail() + " " + a1.getAmount());
	}

	
}
