package Jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Table{	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {	
		
		Class.forName("com.mysql.jdbc.Driver");		
		
		String url="jdbc:mysql://localhost:3306/ctsPune";
		
		Connection conn = DriverManager.getConnection(url, "root", "root");
		
		Statement stat=conn.createStatement();		
		
		//String query="create table user(id int primary key,name varchar(50),phone varchar(10),address varchar(100))";
		
		
				//	int rex=stat.executeUpdate(query);
					
					String query1="insert into user values(1,'mayuresh',5689231478,'pune')";
					stat.executeUpdate(query1);
	}
	

}



