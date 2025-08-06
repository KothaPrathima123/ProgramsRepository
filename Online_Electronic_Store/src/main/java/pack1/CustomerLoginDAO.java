package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO
{
  public CustomerBean checkCustomer(String username, String password)
  {
	  CustomerBean cbean=null;
	  try
	  {
		  Connection con=DBConnect.getCon();
		  PreparedStatement pstm=con.prepareStatement("select * from customer where uname=? and pword=?");
		  pstm.setString(1, username);
		  pstm.setString(2, password);
		  ResultSet rs=pstm.executeQuery();
		  if(rs.next())
		  {
			  cbean=new CustomerBean();
			  cbean.setUname(rs.getString(1));
			  cbean.setPword(rs.getString(2));
			  cbean.setFname(rs.getString(3));
			  cbean.setLname(rs.getString(4));
			  cbean.setAdd(rs.getString(5));
			  cbean.setMailid(rs.getString(6));
			  cbean.setMobile(rs.getString(7));
			  
		  }
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return cbean;
  }
}
