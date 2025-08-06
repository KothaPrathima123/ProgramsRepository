package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO
{
  public AdminBean checkAdmin(String username, String password)
  {
	  AdminBean abean=null;
	  Connection con=DBConnect.getCon();
	  try {
		  PreparedStatement pstm=con.prepareStatement("select * from admin where uname=? and pword=?");
		  pstm.setString(1, username);
		  pstm.setString(2, password);
		  ResultSet rs=pstm.executeQuery();
		  if(rs.next())
		  {
			  abean=new AdminBean();
			  abean.setUsername(rs.getString(1));
			  abean.setPassword(rs.getString(2));
			  abean.setFname(rs.getString(3));
			  abean.setLname(rs.getString(4));
			  abean.setAddress(rs.getString(5));
			  abean.setMailId(rs.getString(6));
			  abean.setMobile(rs.getString(7));
		  }
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return abean;
  }
}
