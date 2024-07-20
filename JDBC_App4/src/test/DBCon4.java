package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBCon4 
{
	public static void main(String[] args) 
	{
		 Scanner  sc =new Scanner(System.in);
		try(sc;)
		{
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System","Chinni143");
				Statement stm=con.createStatement();
				
				
				while(true) 
				{
					System.out.println("*******Enter your  Choice*******");
					System.out.println("\t1.Create/insert/update/delete"+"\n\t2.Retrieve(Select)"+"\n\t3.Exit");
					
					System.out.println("Enter your Choice");
					int choice=Integer.parseInt(sc.nextLine());
					switch(choice) 
					{
						case 1:
							System.out.println("Enter NonSelect query :");
							String nQ=sc.nextLine();
							int k = stm.executeUpdate(nQ);
							System.out.println("The value of K: "+k);
							if(k>0) 
							{
								System.out.println("Query Executed successfully");
							}
							
							break;
						case 2:
							ResultSet rs=stm.executeQuery("Select * from Emp59");
							System.out.println("=======> Emp Details <========");
							while(rs.next()) 
							{
								System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getLong(3));
							}
							
							
							break;
						case 3:
							System.out.println("Oprations Terminated....");
							System.exit(0);
						default:
							System.out.println("Invalid Input");
						
						
					}
					
				}
				
				
				
			}
			catch(Exception e) 
			{
				System.out.println(e.toString());
				
			}
		} 
	}
}
