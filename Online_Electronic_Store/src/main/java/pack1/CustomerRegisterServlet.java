package pack1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/crs")
public class CustomerRegisterServlet extends HttpServlet
{
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
	 // HttpSession session=req.getSession(false);
	  
	  CustomerBean cbean=new CustomerBean();
	  cbean.setUname(req.getParameter("username"));
	  cbean.setPword(req.getParameter("password"));
	  cbean.setFname(req.getParameter("cfname"));
	  cbean.setLname(req.getParameter("clname"));
	  cbean.setAdd(req.getParameter("cadd"));
	  cbean.setMailid(req.getParameter("cmid"));
	  cbean.setMobile(req.getParameter("cmob"));
	  int rc=new CustomerRegisterDAO().insertDetails(cbean);
	  if(rc>0)
	  {
		  req.setAttribute("msg", "User Registered Successfully!!");
		  req.getRequestDispatcher("CustomerRegister.jsp").forward(req, res);
		  
	  }
//	  else
//	  {
//		  req.setAttribute("msg", "User Registered Successfully!!");
//		  req.getRequestDispatcher("CustomerRegister.jsp").forward(req, res);
//	  }
	  
	  
  }
}
