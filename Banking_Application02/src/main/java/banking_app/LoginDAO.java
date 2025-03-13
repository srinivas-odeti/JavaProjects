package banking_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDAO 
{	
	public OpenAccountBean login(String un,String pw)
	{
		OpenAccountBean abean=null;
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from accountdetails where username=? and password=?");
			ps.setString(1, un);
			ps.setString(2, pw);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				abean=new OpenAccountBean();
				abean.setAccountNumber(rs.getLong(1));
				abean.setuName(rs.getString(2));
				abean.setPassword(rs.getString(3));
				abean.setAmount(rs.getDouble(4));
				abean.setAddress(rs.getString(5));
				abean.setPhn(rs.getLong(6));
				return abean;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return abean;
	}

}
