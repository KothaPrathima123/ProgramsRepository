package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerRegisterDAO
{
  public int insertDetails(CustomerBean cbean)
  {
	  int rowCount=0;
	  try
	  {
		  Connection con=DBConnect.getCon();
		  PreparedStatement pstm=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
		  pstm.setString(1, cbean.getUname());
		  pstm.setString(2, cbean.getPword());
		  pstm.setString(3, cbean.getFname());
		  pstm.setString(4, cbean.getLname());
		  pstm.setString(5, cbean.getAdd());
		  pstm.setString(6, cbean.getMailid());
		  pstm.setString(7, cbean.getMobile());
		  rowCount=pstm.executeUpdate();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return rowCount;
  }
}
