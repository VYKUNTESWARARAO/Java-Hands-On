package com.pack1;

public class ClassA 
{
	void meth1(int a) 
	{
		if(a>=30)
		{
			if(a==9) 
			{
				System.out.println("executing in if");
				
			}
			else 
			{
				System.out.println("executing in else");
				switch(a) 
				{
					case 5:
						System.out.println("over in swith"+a);
					case 10:
						while(a<=15) 
						{
							do 
							{
								for(int i=0;i>=5;i++) 
								{
									System.out.println("i value :"+i);
								}
							
							}
							while(a<=14);
						}
					}
			  }
			
		}

	}
	public static void main(String[] args) 
	{
		new ClassA().meth1(10);
		
	}
}
