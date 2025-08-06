package pack1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/aps")
public class AddProductServlet extends HttpServlet
{
 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
 {
	 try {
	 HttpSession session=req.getSession(false);
	 if(session==null)
	 {
		 req.setAttribute("msg", "Session Expired");
		 RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.html");
		  rd.forward(req, res);
	 }
	 else
	 {
		 ProductBean pbean=new ProductBean();
		 pbean.setPcode(req.getParameter("pcode"));
		 pbean.setPname(req.getParameter("pname"));
		 pbean.setPcompany(req.getParameter("pcompany"));
		 pbean.setPprice(req.getParameter("pprice"));
		 pbean.setPqty(req.getParameter("pqty"));
		 
		 int rc=new AddProductDAO().insertProduct(pbean);
		
		 if(rc>0)
		 {
	        req.setAttribute("msg", "Product added Successfully");
	        req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
	     }
//		 else
//		 {
//			 System.out.println("Data not inserted");
//		 }
	 }
	 }
	 catch(Exception e)
	 {
		 req.setAttribute("msg", "Duplicate products are not allowed");
		 req.getRequestDispatcher("Error.jsp").forward(req, res);
	 }
 }
}
