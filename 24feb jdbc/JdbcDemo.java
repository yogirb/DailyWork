package Jdbc;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	
	{
		//1.load databsae driver
		  //1.1 by using forNamr() methode
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		 //1.2
		
		//Driver.driver=new com.mysql.jdbc.Driver();
		
		// 2 establish connection
		String url ="jdbc:mysql://localhost:3306/ctspune";
		Connection conn=DriverManager.getConnection(url,"root","root");
		System.out.println(conn.getClass().getName());	
		
		Statement stmt=conn.createStatement();
	
		//String query="insert into emp values(4,'mayuresh','mp',26,5689231478)";
		//String query="update emp set address='Nanded' where id=1";
		//String query="delete from emp where id=3";
		String sql="create table student"+  " (id int primary key"+ "name varchar(200)"+"clg varchar(200)"+"branch varchar(200))";
		String query="select * from emp";
		stmt.executeQuery(query);
		ResultSet rs = stmt.executeQuery(query);
		stmt = conn.createStatement();
		
	/*	while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int age =rs.getInt(4);
			long phone=rs.getLong(5);
			System.out.println(id+" : "+name+" : "+age+" : "+phone);
		}*/
		
		int result1=stmt.executeUpdate(sql);
		if(result1>0)
			
		{
			System.out.println("table craeted succesfully");	
			
		}
		else
		{
			System.out.println("something went wrong");	
		}
		
		
	
		
	}

}
