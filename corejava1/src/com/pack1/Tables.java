package com.pack1;
import java.util.Scanner;

public class Tables 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Which table you want? ");
		int n =sc.nextInt();
		for(int i=1;i<11;i++) 
		{
			int a=n*i;
			System.out.println(n+"×"+i+"="+a);
		}
		sc.close();
	}
}
