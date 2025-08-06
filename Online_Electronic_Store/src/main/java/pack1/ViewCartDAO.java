package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ViewCartDAO
{
  public ArrayList<ProductBean> retriveCart()
  {
	  ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	  Connection con=DBConnect.getCon();
	  try {
		PreparedStatement pstm=con.prepareStatement("select * from cart");
		ResultSet rs=pstm.executeQuery();
			while(rs.next())
			{
				ProductBean pbean=new ProductBean();
				  pbean.setPcode(rs.getString(1));
				  pbean.setPname(rs.getString(2));
				  pbean.setPcompany(rs.getString(3));
				  pbean.setPprice(rs.getString(4));
				  pbean.setPqty(rs.getString(5));
				  al.add(pbean);
			}
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	  
	  return al;
  }
}
