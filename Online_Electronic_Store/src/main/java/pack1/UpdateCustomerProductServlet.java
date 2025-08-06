package pack1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/updateprod")
public class UpdateCustomerProductServlet extends HttpServlet
{
	  @Override
	  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	  {
		  HttpSession session=req.getSession(false);
		  if(session==null)
		  {
			  req.setAttribute("msg", "Session Expired");
			  req.getRequestDispatcher("InvalidCustomer.jsp").forward(req, res);
		  }
		  else
		  {
			 // String pcode=req.getParameter("pcode");
			  int rowCount=new UpdateCustomerProductDAO().updateDetails(req.getParameter("pcode"),Integer.parseInt(req.getParameter("reqqty")), req, res);
			  if(rowCount>0)
			  {
				  req.setAttribute("order", "Your order is placed successfully!!");
				  req.getRequestDispatcher("OrderConfirmed.jsp").forward(req, res);
			  }
		  }
	  }

}
