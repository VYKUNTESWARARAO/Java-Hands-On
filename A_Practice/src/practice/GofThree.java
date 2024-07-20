package practice;

import java.util.Scanner;

public class GofThree {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number :");
		int fn=sc.nextInt();
		System.out.println("Enter second number :");
		int sn=sc.nextInt();
		System.out.println("Enter third number :");
		int tn=sc.nextInt();
		if(fn>=sn && fn>=tn) 
		{
			System.out.println(fn +" is the gratest among three");
		}
		else if(sn>=fn && sn>=tn)
		{
			System.out.println(sn +" is the gratest among three");
		}
		else
		{
			System.out.println(tn +" is the gratest among three");
		}
		
		sc.close();

	}

}
