package s_RECURSION;

public class Recursion_5 
{
	//FIBANOCCI SERIES
	public static void printfact(int a,int b,int n) 
	{
		if(n==0) 
		{
			return;
		}
		
		int c=a+b;
		System.out.println(c);
		printfact(b, c, n-1);
	}
	public static void main(String[] args) 
	{
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		int n=7;
		printfact(a,b,n-2);
		
	}

}
