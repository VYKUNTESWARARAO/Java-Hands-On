package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBCon1a
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Chinni143");
			Statement stm=con.createStatement();
			ResultSet rs= stm.executeQuery("select * from Product59");
			
			System.out.println("=========>Product Details Are<==========");
			System.out.println();
//			System.out.println("Code"+"\t"+"Name"+"\t"+"Price"+"\t"+"QTY");
//			System.out.println("---------------------------------------");
													
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1) + "\t" +rs.getString(2) + "\t" + rs.getFloat(3) + "\t"+" "+rs.getInt(4));
			}
			
		}
		catch(Exception e) 
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}

}
