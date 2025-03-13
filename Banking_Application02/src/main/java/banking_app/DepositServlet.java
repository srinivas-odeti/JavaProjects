package banking_app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/deposit")
public class DepositServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String uname=(String) req.getParameter("uname");
		String pword=(String) req.getParameter("pword");
		double amount= Double.parseDouble(req.getParameter("amount"));
		LoginDAO ld=new LoginDAO();
		OpenAccountBean opa=ld.login(uname, pword);
		if(opa!=null) 
		{
			int k = new DepositDAO().update(amount,uname);
			if(k>0)
			{
				OpenAccountBean bean = new LoginDAO().login(uname, pword);
				req.setAttribute("bean", bean);
				req.getRequestDispatcher("deposit.jsp").forward(req, res);
			}
			
		}
		else
		{
			req.getRequestDispatcher("LoginFailed.jsp").forward(req, res);
		}
	}
	
}
