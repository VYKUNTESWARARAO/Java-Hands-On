package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class ClassA
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ramesh");
		ll.add("suresh");
		ll.add("geetha");
		ll.add("Vyku");
		ll.add("Anjai");
		System.out.println(ll);
		
		Iterator<String> i=ll.iterator();
		while(i.hasNext()) 
		{
			String s=i.next();
			if(s.toLowerCase().contains("a")) 
			{
				i.remove();
			}
		}
		System.out.println("Elements with out A or a :");
		for(String s:ll) 
		{
			System.out.println(s);
		}
	}
}
