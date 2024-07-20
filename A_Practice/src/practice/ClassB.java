package practice;
import java.util.Iterator;
import java.util.TreeSet;

public class ClassB
{
	void meth1()
	{
		TreeSet<ClassD> ts =new TreeSet<ClassD>();
		ClassD d1= new ClassD("dog","daburman","salt");
		ClassD d2= new ClassD("dog","daburman","salt");
		ts.add(d1);
		ts.add(d2);
		System.out.println(ts+"\n");
		Iterator<ClassD> i =ts.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) 
	{
		 ClassB b=new ClassB();
		 b.meth1();
	}
}
