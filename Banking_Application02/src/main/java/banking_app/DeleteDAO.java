package banking_app;

import java.sql.*;

public class DeleteDAO 
{
	public int k=0;
	
	public int delete(long accNo) 
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("delete from accountdetails where accno=?");
			ps.setLong(1, accNo);
			k = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}
	
}
