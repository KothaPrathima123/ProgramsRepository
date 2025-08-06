package pack1;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/viewCart")
public class ViewCartServlet extends HttpServlet
{
	  @Override
	  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	  {
		  HttpSession session=req.getSession(false);
		  if(session==null)
		  {
			  req.setAttribute("msg", "Session Expired");
			  req.getRequestDispatcher("InvalidCustomer.jsp").forward(req, res);
		  }
		  else
		  {
			  ArrayList<ProductBean> al=new ViewCartDAO().retriveCart();
			  session.setAttribute("CartList", al);
			  req.getRequestDispatcher("ViewCart.jsp").forward(req, res);
		  }

	  }
}
