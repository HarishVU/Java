package OWN;
class A{  
	 void msg(){System.out.println("Hello java");}  
	}  
	  
	public class AccessModi extends A{  
	void msg(){
		System.out.println("Hello java");
	}
	 public static void main(String args[]){  
		 AccessModi obj=new AccessModi();  
	   obj.msg();  
	   }  
	}
//	
//public class AccessModi {
//
//}
