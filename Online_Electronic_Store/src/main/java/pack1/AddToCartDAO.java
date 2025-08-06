package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddToCartDAO
{
  public int addToCart(String pcode)
  {
	  int rowCount=0;
	  try
	  {
		  Connection con=DBConnect.getCon();
		  PreparedStatement pstm=con.prepareStatement("select * from productinfo where pcode=?");
		  pstm.setString(1, pcode);
		  ResultSet rs=pstm.executeQuery();
		  if(rs.next())
		  {
			  PreparedStatement pstm2=con.prepareStatement("insert into cart values(?,?,?,?,?)");
			  pstm2.setString(1, rs.getString(1));
			  pstm2.setString(2, rs.getString(2));
			  pstm2.setString(3, rs.getString(3));
			  pstm2.setString(4, rs.getString(4));
			  pstm2.setString(5, rs.getString(5));
			  rowCount=pstm2.executeUpdate();
		  }
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return rowCount;
  }
}
