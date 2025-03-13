package banking_app;
import java.io.*;
import java.util.Random;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/openaccount")
public class OpenAccountFormServlet extends HttpServlet
{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		OpenAccountBean account=new OpenAccountBean();
		account.setAccountNumber(new Random().nextLong(100000000));
		account.setuName(req.getParameter("uname"));
		account.setPassword(req.getParameter("pword"));
		double amount=Double.parseDouble(req.getParameter("amount"));
		account.setAmount(amount);
		account.setAddress(req.getParameter("address"));
		long phn=Long.parseLong(req.getParameter("phn"));
		account.setPhn(phn);
		int k = new OpenAccountDAO().insert(account);
		if(k>0)
		{
			req.setAttribute("account", account);
			req.getRequestDispatcher("openaccount.jsp").forward(req, res);
		}
//		else
//		{
//			req.getRequestDispatcher("openaccountfailed.jsp").forward(req, res);
//		}
		
	}
}
