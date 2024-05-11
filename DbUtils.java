package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	private static Connection connection;
	private static final String username;
	private static final String passward;
	private static final String url;
	static {
		url="jdbc:mysql://localhost:3306/iacsd";
		username="root";
		passward="Gaurav@1855";
	}
	
	public static Connection openConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get connection from db
		connection = DriverManager.getConnection(url,username, passward);
		
		return connection;
		
	}
	

}
