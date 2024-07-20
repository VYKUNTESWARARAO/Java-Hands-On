package test;
import java.sql.*;

public class DBCon1 
{
	public static void main(String[] args)
	{
		try 	
		{
			//Step-1 Loading driver 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Step-2 Creating Connection;
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Chinni143");
			//Step-3 Prepare Statements
			Statement stm=con.createStatement();
			//Step-4 Executing Queries
			ResultSet rs=stm.executeQuery("Select * From User59");
			
			System.out.println("   ======>User Details<======    ");
			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+"\t" + rs.getString(2)+"\t"+rs.getString(3)+"\t" + rs.getLong(4));
			}//end of loop
			con.close();
			//step-5 Closing the Connection
		}//end of try
		catch(Exception e) 
		{
			System.out.println(e.toString());
		}
		
	}
	
}
