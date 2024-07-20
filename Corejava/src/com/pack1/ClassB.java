package com.pack1;

public class ClassB 
{
	

	void meth1(int i) 
	{
		if(i>=100) 
		{
			System.out.println(i);
		}
		i++;
		
		
	}
	public static void main(String[] args) 
	{
		new ClassA().meth1(1);
		
		
		
	}

}
