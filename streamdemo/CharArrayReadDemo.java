package com.streamdemo;
import java.io.*;

public class CharArrayReadDemo {
	public static void main(String[] args) throws IOException{
		char[] ch = {'k','e','v','e','l','l','c','o','r','p'};
		CharArrayReader ary = new CharArrayReader(ch);
		int i=0;
		while((i=ary.read())!=-1) {
			char chh = (char)i;
			System.out.print(chh + ":");
			System.out.println(i);
		}
	}
}
