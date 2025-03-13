package banking_app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/login")
public class BalanceServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		String uname=(String) req.getParameter("uname");
		String pword=(String) req.getParameter("pword");
		LoginDAO ld=new LoginDAO();
		OpenAccountBean opa=ld.login(uname, pword);
		if(opa!=null) 
		{
			req.setAttribute("bean",opa);
			req.getRequestDispatcher("Login.jsp").forward(req, res);
		}else {
			req.setAttribute("bean",opa);
			req.getRequestDispatcher("LoginFailed.jsp").forward(req,res);
		}
	}
}
