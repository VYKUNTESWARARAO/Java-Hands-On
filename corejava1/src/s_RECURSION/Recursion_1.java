package s_RECURSION;

public class Recursion_1
{
	//NUMBERS FROM N TO 1
	public static void printNum(int n) 
	{
		if(n==0)
			return;
		System.out.println(n);
		printNum(n-1);
	}
	public static void main(String[] args) 
	{
		int n=5;
		printNum(n);
		
	}

}
