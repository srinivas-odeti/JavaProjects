package banking_app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/transfer")
public class TransferServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		long accNumber =Long.parseLong(req.getParameter("accountnumber"));
		long bAccNumber = Long.parseLong(req.getParameter("baccountnumber"));
		String pword = req.getParameter("pword");
		String uname = req.getParameter("uname");
		double amount = Double.parseDouble(req.getParameter("amount"));
		OpenAccountBean opa = new LoginDAO().login(uname, pword);
		if(opa!=null) 
		{
			 boolean transfer = new TransferDAO().transfer(accNumber,bAccNumber, amount,opa);
			if(transfer)
			{
//				OpenAccountBean bean = new LoginDAO().login(uname, pword);
				req.setAttribute("bean", opa);
				req.getRequestDispatcher("transfer.jsp").forward(req, res);
			}
		}
	}
}
