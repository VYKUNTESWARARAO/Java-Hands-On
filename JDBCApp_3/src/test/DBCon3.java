package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class DBCon3 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		try(sc;)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System","Chinni143");
				PreparedStatement ps1=con.prepareStatement("Insert into Product59 Values(?,?,?,?)");
				PreparedStatement ps2=con.prepareStatement("Select * from Product59");
				PreparedStatement ps3=con.prepareStatement("Select * from Product59 where Code=?");
				PreparedStatement ps4=con.prepareStatement("Update Product59 set price =? ,Qty=qty+? where code =?");
				PreparedStatement ps5=con.prepareStatement("Delete from Product59 where Product Code=?");
				while(true) 
				{
					System.out.println("********Enter Your Choice********");
					System.out.println("\t1.Add Products"
										+"\n\t2.View Products"
										+"\n\t3.View Products by Code"
										+"\n\t4.update ProductBy Code"
										+"\n\t5.Delete Product by code"
										+"\n\t6.Exit");
					System.out.println("Enter Your Choice : ");
					int choice=Integer.parseInt(sc.nextLine());
					switch (choice) 
					{
						case 1:
							System.out.println("------Enter Product Details------");
							
							System.out.println("Enter Product Code :");
							int pC= Integer.parseInt(sc.nextLine());
							
							System.out.println("Enter Product Name :");
							String pN= sc.nextLine();
							
							System.out.println("Enter Product Price :");
							Float pP= Float.parseFloat(sc.nextLine());
							
							System.out.println("Enter Product Qty :");
							int pQ= Integer.parseInt(sc.nextLine());
							
							//Loading Prepared Statement Object
							ps1.setInt(1,pC);
							ps1.setString(2,pN);
							ps1.setFloat(3,pP);
							ps1.setInt(4,pQ);
							
							//Execution
							int k= ps1.executeUpdate();
							
							if(k>0) 
							{
								System.out.println("Product Deatils Added Successfully");
							}
							break;
						case 2:
							ResultSet rs=ps2.executeQuery();
							System.out.println("===========> Product Details Are <===========");
							while(rs.next()) 
							{
								System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
							}
							break;
						case 3:
							System.out.println("Enter Product Code to Display Deatils....");
							String pC1=sc.nextLine();
							ps3.setString(1, pC1);
							ResultSet rs1=ps3.executeQuery();
							System.out.println("===========> Product Details Are <===========");
							if(rs1.next()) 
							{
								System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getFloat(3)+"\t"+rs1.getInt(4));
							}
							else 
							{
								System.out.println("INVALID PRODUCT CODE .....");
							}
							break;
						case 4:
							System.out.println("Enter Product Code to Update Price..");
							int pC2=Integer.parseInt(sc.nextLine());
							ps3.setInt(1, pC2);
							ResultSet rs2=ps3.executeQuery();
							if(rs2.next()) 
							{
								System.out.println("Product Old-Price :"+rs2.getFloat(3));
								System.out.println("Enter Product new Price: ");
								float nPrice = Float.parseFloat(sc.nextLine());
								System.out.println("Product Existing qty :"+rs2.getInt(4));
								int nQty = Integer.parseInt(sc.nextLine());
								ps4.setFloat(1,nPrice);
								ps4.setInt(2, nQty);
								ps4.setInt(3,pC2);
								
								int k2=ps4.executeUpdate();
								if(k2>0) 
								{
									System.out.println("Product Details Updated Successfully....");
								}
							 }
							else 
							{
								System.out.println("INVALID PRODUCT CODE .....");
							}
							
							break;
						case 5:
							System.out.println("Enter Product Code to Delete The Product");
							int pC3=Integer.parseInt(sc.nextLine());
							ps3.setInt(1, pC3);
							ResultSet rs3=ps3.executeQuery();
							if(rs3.next()) 
							{
								ps5.setInt(1, pC3);
								int k3=ps5.executeUpdate();
								if(k3>0) 
								{
									System.out.println("Product Deleted Successfully..");
								}
							}
							else 
							{
								System.out.println("Invalid Product Code.....");
							}
							
							break;
						case 6:
							System.out.println(" Operations Stopped........");
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
