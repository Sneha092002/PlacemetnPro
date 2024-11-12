package project;
import java.sql.*;
public class ConnectionProvider {
	public static Connection getCon()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PPJSP","root","Here add your password"); //Create a database named PPJSP
			return con;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
}