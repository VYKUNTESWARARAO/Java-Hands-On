package practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ClassC 
{
	void meth1() 
	{
		System.out.println("IMPLEMENTING VECTOR");
		System.out.println("--------------------");
		Vector<Object> v=new Vector<Object>();
		
		v.add(10);
		v.add("java");
		v.add(null);
		v.add(10);
		v.add(1);
		v.add('A');
		v.add(true);
		v.add(75);
		
		System.out.println(v+"\n");
		
		System.out.println("get() :"+v.get(1));
		System.out.println("size() :"+v.size());
		System.out.println("Capacity()"+v.capacity());
		v.add(v.size()-1,100);
		System.out.println(v);
		v.add(v.size()-1,200);
		System.out.println(v);
		v.add(2,"oracle");
		System.out.println(v);
		v.add(5000);
		System.out.println(v);
		System.out.println("capacity() : "+v.capacity());
		
		for(int i=0;i<v.size();i++) 
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		
		for(int i=v.size()-1;i>=0;i--) 
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		for(Object o:v) 
		{
			System.out.print(o+" ");
		}
		System.out.println();
		
		Iterator<Object> i =v.iterator();
		while(i.hasNext()) 
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		Enumeration<Object> e =v.elements();
		while(e.hasMoreElements()) 
		{
			System.out.print(e.nextElement()+" ");
		}
		
		
		
	}
	public static void main(String[] args)
	{
		ClassC cobj=new ClassC();
		cobj.meth1();
		
	}
}