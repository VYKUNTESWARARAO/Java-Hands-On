package t_About_IO_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;




public class Buferred_Char
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
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\FileIO\\file5.txt"));
		String msg ="hiiiiiiiiiii";
		bw.write(msg);
		System.out.println("writing completed");
		bw.close();
		
	}
	void fileOperation3() throws Exception
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\FileIO\\file5.txt"));
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\FileIO\\file2.txt"));
		int i;
		while((i=br.read())!= -1) 
		{
			bw.write(i);
		}
		System.out.println("successfully copied");
		br.close();
		bw.close();
	}
	

	public static void main(String[] args) throws Exception
	{
		Buferred_Char obj=new Buferred_Char();
		obj.fileOperation3();
		
	}

}

