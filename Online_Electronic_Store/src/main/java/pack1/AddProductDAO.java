package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO 
{
  public int insertProduct(ProductBean pbean)throws Exception
  {
	  int rowCount=0;
	  try {
		  Connection con=DBConnect.getCon();
		  PreparedStatement pstm=con.prepareStatement("insert into productinfo values(?,?,?,?,?)");
		  pstm.setString(1, pbean.getPcode());
		  pstm.setString(2, pbean.getPname());
		  pstm.setString(3, pbean.getPcompany());
		  pstm.setString(4, pbean.getPprice());
		  pstm.setString(5, pbean.getPqty());
		  rowCount=pstm.executeUpdate();
	  }
	  catch(Exception e)
	  {
		 // e.printStackTrace();
		  throw e;
	  }
	  return rowCount;
  }
}
