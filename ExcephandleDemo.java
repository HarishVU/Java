import java.io.*;

public class ExcephandleDemo {
public static void main(String[] args)  {
//	for(int j=0;j<args.length;j++) {	//here we are using varargs
//		System.out.println(args[j]);
//	}
	int a=10,b=0;
	int c=0;
	
	try {
		int[] arr=null;
		System.out.println(arr[1]);
	
		
		}
	catch(Exception e) {
		System.out.println("sfasfas");
	}
	try {
		c=a/b;
			}
		catch(Exception e) {
			System.out.println(c);
		}
	finally {
	System.out.println("now its working");
	
}
	
	File file =new File("acs.txt");
	try {
		FileInputStream f = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		
	}
	System.out.println("asfasd");
}}
