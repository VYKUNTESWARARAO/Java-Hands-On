package test;

import java.sql.*;
import java.util.*;

public class DBCon2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		try(sc;)
		{
			try 
			{
				System.out.println("Enter userId :");
				String userId=sc.nextLine();
				System.out.println("Enter userName :");
				String userName=sc.nextLine();
				System.out.println("Enter MId :");
				String mId=sc.nextLine();
				System.out.println("Enter phno :");
				Long phno=sc.nextLong();
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Chinni143");
				Statement stm=con.createStatement();
				
				int k = stm.executeUpdate
						("insert into User59 values('"+userId+"','"+userName+"','"+mId+"',"+phno+")");
				if(k>0)
				{
					System.out.println("User details added successfully...");
			    }
				con.close();
			 }
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
			
		 }
		
	 }

 }
