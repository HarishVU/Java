class Calculation{  
 
	void factorial(int n){  //n is calling new Calculation().factorial(4);
		int fact=1;  
		for(int i=1;i<=n;i++){  
			fact=fact*i;  
  }  
 System.out.println("factorial is "+fact);  
}  
 
public static void main(String args[]){  
 new Calculation().factorial(4);//calling method with anonymous object  
}  
} 