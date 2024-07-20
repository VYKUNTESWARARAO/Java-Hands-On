package patterns;

public class Pattern7 
{
	//INVERTED HALF PYRAMID WITH NUMBERS
	public static void main(String[] args) 
	{
        int n=5;
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();      // ANOTHER WAY TO PRINT
//		}
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=(n-i+1);j++) 
			{
				System.out.print(j+" ");
				
			}
		    System.out.println();
		}
	}

}
