package banking_app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String uname = req.getParameter("uname");
		long accountnumber = Long.parseLong(req.getParameter("accountnumber"));
		String pword = req.getParameter("pword");
		LoginDAO ld=new LoginDAO();
		OpenAccountBean opa=ld.login(uname, pword);
		if(opa!=null) 
		{
			int k = new DeleteDAO().delete(accountnumber);
			if(k>0)
			{
//				OpenAccountBean bean = new LoginDAO().login(uname, pword);
				req.setAttribute("bean", opa);
				req.getRequestDispatcher("delete.jsp").forward(req, res);
			}
		}
	}
}
