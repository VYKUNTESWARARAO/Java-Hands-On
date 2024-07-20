package practice;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
	if(n>2)	
	{
		for(int i=1;i<=n/2;i++) 
		{
			if(n%i==0) 
			{
				count+=1;
			}
		}
		if(count>1) 
		{
			System.out.println("given number is not a prime");
		}
		else
		{
			System.out.println("given number is a prime");
        }
	}
	else
		System.out.println("enter number grater than 1");
		
		sc.close();
		}
}
