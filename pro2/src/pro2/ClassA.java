package pro2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ClassA 
{
	void fileOperation1() throws Exception
	{
		System.out.println("Reading the data");
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\FileIO\\file2.txt"));
		
		int i;
		while((i=br.read())!= -1) 
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("Reading Completed");
		br.close();
	}
	void fileOperation2() throws Exception
	{
		
		//BufferedWriter bw =new BufferedWriter (new FileWriter("C:\\Users\\user\\Desktop\\FileIO\\file3.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\FileIO\\file5.txt"));
		String msg ="hiiiiiiiiiii";
		bw.write(msg);
		bw.close();
		
	}

	public static void main(String[] args) throws Exception
	{
		ClassA obj=new ClassA();
		obj.fileOperation1();
		
	}

}
