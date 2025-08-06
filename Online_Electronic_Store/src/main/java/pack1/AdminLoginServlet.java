package pack1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/als")
public class AdminLoginServlet extends HttpServlet
{
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
	  AdminLoginDAO ald=new AdminLoginDAO();
	  AdminBean abean=ald.checkAdmin(req.getParameter("username"), req.getParameter("password"));
	  if(abean==null)
	  {
		  req.setAttribute("msg", "Invalid Admin credentials!!");
		  RequestDispatcher rd=req.getRequestDispatcher("InvalidAdmin.jsp");
		  rd.forward(req, res);
	  }
	  else
	  {
		  HttpSession session=req.getSession();
		  session.setAttribute("abean", abean);
		  RequestDispatcher rd=req.getRequestDispatcher("AdminHome.jsp");
		  rd.forward(req, res);
	  }
  }
}
