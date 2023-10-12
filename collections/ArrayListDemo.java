package com.collections;
import java.util.ArrayList;

public class ArrayListDemo{

	public static void main(String[] args)throws Exception{
        
        ArrayList<Integer> alist = new ArrayList<Integer>();
        
        for(int i=1;i<10;i++)
        alist.add(i);
        System.out.println(alist);
        
        ArrayList<String> slist = new ArrayList<String>();
        
        slist.add("hari");
        slist.add("vinod");
        slist.add("chat");
        System.out.println(slist);
        
        ArrayList nlist = new ArrayList();
        
        nlist.add("hari");	//string
        nlist.add(100);		//int
        nlist.add('t');		//char
        nlist.add(true);	//bool
        nlist.add(987654l);	//long
        nlist.add(98.9f);	//float
        System.out.println(nlist);
        
        ArrayList<IteratorDemo> nt = new ArrayList<IteratorDemo>();
        //nt.add(new IteratorDemo());
        
        System.out.println(nt);
        
        
        }


       
    }
