package com.pack1;
import java.util.Arrays;
import java.util.Scanner;

public class ClassB 
{
	Scanner sc=new Scanner(System.in);
	void ticket_booking() 
	{
		System.out.println("Which movie tickets you want!");
		String movie_name = sc.next();
		System.out.println("How many tickets do you want for "+movie_name+" movie!");
		String tickets[]=new String[sc.nextInt()];
		System.out.println("Please enter "+tickets.length+" names");
		for(int i=0;i<tickets.length;i++) 
		{
			tickets[i]=sc.next();
		}
		System.out.println(tickets.length+" tickets has been booked for ");
		for(int j=1;j<tickets.length;j++) 
		{
			System.out.println(Arrays.toString(tickets)+" A"+j);
			continue;
		}
		
		
		
		
	}
	public static void main(String[] args) 
	{
		ClassB bobj=new ClassB();
		bobj.ticket_booking();
		
	}
}

