package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
	
	private static final String URL = "jdbc:mysql://localhost:3306/one";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "system";
	public static Connection getConnection()
	{
		
		try
		{
			 Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	         
	         return connection;
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		
		return null;
		
	}
}


