package pack1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet
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
			  String pcode=req.getParameter("pcode");
			  int rowCount=new AddToCartDAO().addToCart(pcode);
			  if(rowCount>0)
			  {
				  req.setAttribute("msg", "Product added to cart successfully!!");
				  req.getRequestDispatcher("AddToCart.jsp").forward(req, res);
			  }
		  }
	  }
}
