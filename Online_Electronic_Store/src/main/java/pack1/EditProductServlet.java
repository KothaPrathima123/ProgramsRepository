package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/edit")
public class EditProductServlet  extends HttpServlet
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
			  String pcode=req.getParameter("pcode");
			  ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductsList");
			  ProductBean pb=null;
			  Iterator<ProductBean> i=al.iterator();
			  while(i.hasNext())
			  {
				  pb=i.next();
				  if(pcode.equals(pb.getPcode()))
					  break;
				  
			  }
			  req.setAttribute("pbean", pb);
			  req.getRequestDispatcher("EditProduct.jsp").forward(req, res);
		  }
	  }

}
