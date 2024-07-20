package practice;

import java.util.Scanner;

public class SumInRaNge
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number :");
		int fn=sc.nextInt();
		System.out.println("Enter second number :");
		int sn=sc.nextInt();
		int sum=0;
		for(int i=fn;i<=sn;i++) 
		{
			sum+=i;
		}
		System.out.println("The sum of Numbers in given range is "+ sum);
		sc.close();
	}

}
