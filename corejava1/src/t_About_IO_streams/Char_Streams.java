package t_About_IO_streams;

import java.io.FileReader;
import java.io.FileWriter;

public class Char_Streams
{
	void fileOperations1() throws Exception
	{
		FileReader fr=new FileReader("C:\\Users\\user\\Desktop\\FileIO\\file2.txt");
		System.out.println("This is the text inside the file :");
		System.out.println();
		int i;
		while((i=fr.read())!=-1) 
		{
			System.out.print((char)i);
		}
		fr.close();
	}
	void fileOperations2() throws Exception
	{
		FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\FileIO\\file2.txt",true);
		String msg ="He Has GirlFriend";
		fw.write(msg);
		
		System.out.println("writing completed");
		fw.close();
		
		
	}
	public static void main(String[] args) throws Exception
	{
		Char_Streams obj = new Char_Streams();
		//obj.fileOperations1();
		obj.fileOperations2();
		
	}

}
