package Jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.PreparedStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;



public class Jdbc1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException

	{
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("enter the id ");
		///int id=Integer.parseInt(br.readLine());
	   // System.out.println("enter the name ");
	//	String name =br.readLine();
	//System.out.println("enter the address ");
		//String address=br.readLine();
		//System.out.println("enter the age ");
		//int age=Integer.parseInt(br.readLine());
		//System.out.println("enter the phone ");
		//long phone=Long.parseLong(br.readLine());
		
		Class.forName("com.mysql.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		
		
		//String query= "insert ino emp values(?,?,?,?,?)";
		//String query="update emp set name=? where id=?";
		String query="select * from emp";
		PreparedStatement ps=conn.prepareStatement(query);
		 Statement stmt  = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int age =rs.getInt(4);
			long phone=rs.getLong(5);
			System.out.println(id+" : "+name+" : "+age+" : "+phone);
		}
		
		
		//ps.setInt(1, id);
	  //  ps.setString(2, name);
		////ps.setString(3,address);
	   // ps.setInt(4, age);
		//ps.setLong(5, phone);
		
		/*int result=ps.executeUpdate();
		
		if(result>0)
		{
			System.out.println("inserted  ");
			
		}
		else
		{
			System.out.println("went wrong");
		}*/
		
		
		
		
		
	
	}

}
