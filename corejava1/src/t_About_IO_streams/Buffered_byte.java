package t_About_IO_streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Buffered_byte 
{
	void fileOperation1() throws Exception
	{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\FileIO\\file2.txt"));
		System.out.println("this is the data in file : ");
		System.out.println();
		int i;
		while((i=bis.read())!= -1) 
		{
			System.out.print((char)i);
		}
		bis.close();
	}
	void fileOperation2() throws Exception
	{
		BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\FileIO\\\\file2.txt",true));
		String msg=" He kissed her";
		byte arr[]=msg.getBytes();
		bos.write(arr);
		System.out.println("writitng completed");
		bos.close();
	}
	void fileOperations3() throws Exception
	{
		BufferedInputStream bis= new BufferedInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\FileIO\\file2.txt"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\user\\Desktop\\FileIO\\file5.txt"));
		
		int i;
		while((i=bis.read())!= -1) 
		{
			bos.write((char)i);
		}
		System.out.println("Copying completed");
		bis.close();
		bos.close();
		
	}
	public static void main(String[] args) throws Exception
	{
		Buffered_byte obj=new Buffered_byte();
		//obj.fileOperation1();
		//obj.fileOperation2()
		obj.fileOperations3();
		
	}

}
