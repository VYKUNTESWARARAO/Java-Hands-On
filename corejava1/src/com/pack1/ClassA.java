package com.pack1;
import java.util.Scanner;

public class ClassA 
{
	
	void meth1() 
	{
		System.out.println("meth1() called");
		String s1="java";
		String s2= new String("java");
		String s3="java";
		String s4=new String("java");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("JAVA"));
		System.out.println(s1.equalsIgnoreCase("JAVA"));
		System.out.println(s3.equals(s1));
		System.out.println("java".equals("java"));
		System.out.println(new String("java").equals("java"));
		System.out.println(s3.equals(s4));
		System.out.println("----------------------");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println();
		
		System.out.println(s2==new String("java"));
		System.out.println("java"==s1);
		System.out.println("java"=="java");
		System.out.println(new String("java")==new String("java"));
		System.out.println("java"==new String("java"));
	}
	void meth2() 
	{
		System.out.println("Implementing String Class methods");
		String s1="java";
		System.out.println("s1 : "+s1);
		System.out.println("concat() : "+s1.concat(" is awesome"));
		System.out.println("s1 : "+s1);
		System.out.println("length() :"+s1.length());
		System.out.println("concat() : "+s1.concat(" is awesome").length());
		System.out.println();
		System.out.println("charAt() : "+s1.charAt(0));
		System.out.println("charAt() : "+s1.charAt(s1.length()-1));
		System.out.println("charAt() : "+s1.charAt(s1.length()-2));
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Gender");
		/*char gender=sc.next().charAt(0);
		
		switch(gender)
		{
			case 'm','M':
				System.out.println("User is male");
				break;
			case 'f','F':
				System.out.println("User is Female");
				break;
			default:
				System.out.println("Invalid Input");
		}*/
		sc.close();
		String s2="java is awesome";
		System.out.println("startswtith() : " + s2.startsWith(s1));
		System.out.println("startswtith() : " + s2.startsWith("j"));
		System.out.println("startswtith() : " + s2.startsWith("java"));
		
		
	}
	

	public static void main(String[] args) 
	{
		
		ClassA aobj=new ClassA();
		//aobj.meth1();
		//System.out.println("----------------------");
		aobj.meth2();
		
	}
}
