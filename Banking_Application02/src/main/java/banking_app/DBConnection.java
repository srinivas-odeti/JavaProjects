package banking_app;
import java.sql.*;
public class DBConnection 
{
	private static Connection con;
	private DBConnection() {
		
	}
	
	static 
	{
		try
		{
			Class.forName(DBInfo.driver);
			con=DriverManager.getConnection(DBInfo.dbURL,DBInfo.uName,DBInfo.pWord);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getCon()
	{
		return con;
	}
}
