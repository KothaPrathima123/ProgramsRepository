package pack1;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/view1")
public class ViewProductServlet extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
	  HttpSession session=req.getSession(false);
	  if(session==null)
	  {
		  req.setAttribute("msg", "Session Expired");
		  RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.html");
		  rd.forward(req, res);
	  }
	  else
	  {
		  ArrayList<ProductBean> al=new ViewProductDAO().retrieveProducts();
		  session.setAttribute("ProductsList", al);
		  req.getRequestDispatcher("ViewProduct.jsp").forward(req, res);
	  }
  }
}
