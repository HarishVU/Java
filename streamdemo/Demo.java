package com.streamdemo;
//this is stringwriter example
import java.io.*;  
public class Demo {  
    public static void main(String[] args) throws IOException {  
/*        char[] ary = new char[512];  
        StringWriter writer = new StringWriter();  
        FileInputStream input = new FileInputStream("D://testout.txt"); 
        BufferedReader buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));  
      
        int x;  
        while ((x = buffer.read(ary)) != -1) {  
                   writer.write(ary, 0, x);  
        }  
        System.out.println(writer.toString());        
        writer.close();  
        buffer.close();  
    }  
}  */
   // this is example of objectoutputstream and objectinputstream
    	FileOutputStream fout = new FileOutputStream("D:\\Haris\\tex.txt");
    	ObjectOutputStream out = new ObjectOutputStream(fout);
    	out.write(4);
    	out.close();
    	System.out.println("writing");
    	
    	FileInputStream fin = new FileInputStream("D:\\Haris\\tex.txt");
    	ObjectInputStream oin = new ObjectInputStream(fin);
    	System.out.println(oin.read());
    	oin.close();
    	
    }
}