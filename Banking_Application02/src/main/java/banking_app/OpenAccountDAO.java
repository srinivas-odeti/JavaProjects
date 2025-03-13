package banking_app;
import java.sql.*;

public class OpenAccountDAO 
{
	public int k=0;
	
	public int insert(OpenAccountBean account)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into accountdetails values(?,?,?,?,?,?)");
			ps.setLong(1, account.getAccountNumber());
			ps.setString(2, account.getuName());
			ps.setString(3, account.getPassword());
			ps.setDouble(4, account.getAmount());
			ps.setString(5, account.getAddress());
			ps.setLong(6, account.getPhn());
			k = ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		return k;
	}
}
