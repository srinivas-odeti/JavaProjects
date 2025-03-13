package banking_app;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DepositDAO
{
	public int k=0;
	public int update(double amount,String un)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("update accountdetails set amount=amount+? where username=?");
			ps.setDouble(1, amount);
			ps.setString(2, un);
			k = ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
		
	}
}
