package banking_app;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TransferDAO 
{
	public int k=0;

	public boolean transfer(long accNumber, long bAccNumber,double amount,OpenAccountBean oab) 
	{
		try
		{
			Connection con=DBConnection.getCon();
			con.setAutoCommit(false);
			PreparedStatement ps1=con.prepareStatement("update accountdetails set amount=amount-? where accno=?");
			PreparedStatement ps2=con.prepareStatement("update accountdetails set amount=amount+? where accno=?");
			ps1.setDouble(1, amount);
			ps1.setLong(2, accNumber);
			int withdraw = ps1.executeUpdate();
			ps2.setDouble(1, amount);
			ps2.setLong(2, bAccNumber);
			int deposit = ps2.executeUpdate();
			
			if(withdraw==1 && deposit==1)
			{
				con.commit();
				oab.setAmount(oab.getAmount()-amount);
				return true;
			}
			else
			{
				con.rollback();
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
