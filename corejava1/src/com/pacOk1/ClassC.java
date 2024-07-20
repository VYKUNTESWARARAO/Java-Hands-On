package com.pacOk1;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class ClassC
{ 
	void meth1() 
	{
		Hashtable<Object,Object> ht=new Hashtable<Object,Object>();
		ht.put(101,"java");
		ht.put("gas","jas");
		ht.put(109,103);
		ht.put(106,"ravi");
		ht.put(105,"pavan");
		ht.put(207,"rafi");
		ht.put(104,"java");
		ht.put(103,false);
		System.out.println(ht);
		ArrayList<Object> al=new ArrayList<Object>(ht.keySet());
		Iterator<Object> i1=al.iterator();
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
		ArrayList<Object> al2=new ArrayList<Object>(ht.entrySet());
		Iterator<Object> i2=al2.iterator();
		while(i2.hasNext()) 
		{
			@SuppressWarnings("rawtypes")
			Entry e=(Entry)i2.next();
			System.out.println(e.getValue());
		}
		
		
	}
	public static void main(String[] args) 
	{
		new ClassC().meth1();
	}
	
	
	

}
