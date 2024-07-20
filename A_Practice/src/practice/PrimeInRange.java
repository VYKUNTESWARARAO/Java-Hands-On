package practice;

import java.util.Scanner;

public class PrimeInRange 
{
	
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first number");
		int f=sc.nextInt();
		System.out.println("enter second number");
		int n=sc.nextInt();
		for (int i=f;i<=n;i++)
		{
			f=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					f++;
			}
			if(f==2)
			System.out.print(i +"\t");
		}
		sc.close();

		
	}

}
/*
 * int n2 = input.nextInt();
   int f=0;
for (int i=n1;i<=n2;i++)
{
	f=0;
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
			f++;
	}
	if(f==2)
	System.out.print(i +"\t");
}
*/
