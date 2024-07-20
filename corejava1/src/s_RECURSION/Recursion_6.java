package s_RECURSION;

public class Recursion_6
{
	public static int calcPower(int x,int n) 
	{
		// X^N finding
		if(n==0) 
		{
			return 1;
		}
		if(x==0) 
		{
			return 0;
		}
		int xpnm1=calcPower(x,n-1);
		int xpn=x*xpnm1;
		return xpn;
	}
	public static void main(String[] args)
	{
		int x=2,n=5;
		int ans =calcPower(x, n);
		System.out.println(ans);
		
		
	}

}
