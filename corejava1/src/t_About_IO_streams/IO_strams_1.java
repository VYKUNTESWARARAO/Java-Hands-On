package t_About_IO_streams;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class IO_strams_1 
{
	void fileOperations1() throws Exception
	{
		System.out.println("reading the data");
		FileInputStream fis= new FileInputStream("C:\\Users\\user\\Desktop\\FileIO\\hello.txt.txt");
		
		
		int i;
		while((i=fis.read())!= -1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("read completed succesfully ");
		fis.close();
	}
	void fileOperations2() throws Exception
	{
		System.out.println("writing the data");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\FileIO\\file2.txt");
		String msg="Chinni is good boy";
		byte arr[]=msg.getBytes();
		fos.write(arr);
		fos.close();
	}
	void fileOperations3() throws Exception
	{
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\user\\\\Desktop\\\\FileIO\\\\file2.txt");
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\FileIO\\\\file3.txt");
		
		int i;
		while((i=fis.read()) != -1) 
		{
			fos.write((char)i);
		}
		System.out.println("copying completed");
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws Exception
	{
		IO_strams_1 obj=new IO_strams_1();
		//obj.fileOperations1();
		//obj.fileOperations2();
		obj.fileOperations3();
	}

}