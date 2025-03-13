package banking_app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/withdraw")
public class WithdrawServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String un=(String)req.getParameter("uname");
		String pword=(String)req.getParameter("pword");
		double amount=Double.parseDouble(req.getParameter("amount"));
		LoginDAO ld=new LoginDAO();
		OpenAccountBean oac=ld.login(un, pword);
		if(oac!=null)
		{
			if(amount<=oac.getAmount())
			{
				int k = new WithdrawDAO().withdraw(amount,oac);
				if(k>0)
				{
					
					req.setAttribute("bean", oac);
					req.getRequestDispatcher("withdraw.jsp").forward(req, res);
				}
			}
			else
			{
				req.setAttribute("bean", null);
				req.getRequestDispatcher("withdraw.jsp").forward(req, res);
			}
		}
		else
		{
			req.getRequestDispatcher("WithdrawFailed.jsp").forward(req, res);
		}
	}
}
