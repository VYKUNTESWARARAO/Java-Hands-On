package r_Practice_Java;

public class Questions_java
{
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder("Hello World");
		
		for(int i=0;i<sb.length()/2;i++) 
		{
			int front= i;
			int back = sb.length()-1-i;
			
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			
			sb.setCharAt(back,frontChar);
			sb.setCharAt(front,backChar);
			
		}
		System.out.println(sb);
		
	}

}
