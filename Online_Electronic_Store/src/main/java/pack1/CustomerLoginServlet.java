package pack1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/cls")
public class CustomerLoginServlet extends HttpServlet
{
	  @Override
	  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	  {
		  CustomerBean cbean=new CustomerLoginDAO().checkCustomer(req.getParameter("username"), req.getParameter("password"));
		  if(cbean==null)
		  {
			  req.setAttribute("msg", "Invalid user!!");
			  req.getRequestDispatcher("InvalidCustomer.jsp").forward(req, res);
		  }
		  else
		  {
			  HttpSession session=req.getSession();
			  session.setAttribute("cbean", cbean);
			  req.getRequestDispatcher("CustomerHome.jsp").forward(req, res);
		  }
	  }


}
