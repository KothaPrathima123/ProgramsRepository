package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class UpdateCustomerProductDAO
{
  public int updateDetails(String pcode, int reqqty, HttpServletRequest req, HttpServletResponse res)
  {
	  int rowCount=0;
	  try
	  {
		  Connection con=DBConnect.getCon();
		  PreparedStatement pstm=con.prepareStatement("select pqty,pprice from productinfo where pcode=?");
		  pstm.setString(1, pcode);
		  ResultSet rs=pstm.executeQuery();
		  if(rs.next())
		  {
			  if(Integer.parseInt(rs.getString(1))>=reqqty)
			  {
				  PreparedStatement pstm2=con.prepareStatement("update productinfo set pqty=pqty-? where pcode=?");
				  pstm2.setInt(1, reqqty);
				  pstm2.setString(2, pcode);
				  rowCount=pstm2.executeUpdate();
				  req.setAttribute("bill", Double.parseDouble(rs.getString(2))*reqqty);
				  req.setAttribute("rowCount", rowCount);
			  }
			  else
			  {
				  req.setAttribute("msg", "There is no enough stock to buy!!");
				  req.getRequestDispatcher("OrderCancelled.jsp").forward(req, res);
				  
				  
			  }
		//	  req.getRequestDispatcher("OrderConfirmed.jsp").forward(req, res);
		  }
		 
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return rowCount;
  }
}
