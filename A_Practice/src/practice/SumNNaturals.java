package practice;
import java.util.Scanner;

public class SumNNaturals
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) 
		{
			sum+=i;
		}
		System.out.println("The sum of first "+n+" Naturals is "+ sum);
		sc.close();
		
	}
}
