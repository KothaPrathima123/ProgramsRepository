package pack1;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class Request_Listeners implements ServletRequestListener, ServletRequestAttributeListener
{
	@Override
  public void requestInitialized(ServletRequestEvent sre)
  {
	  System.out.println("Request object initialized");
  }
	@Override
	
  public void requestDestroyed(ServletRequestEvent sre)
  {
	  System.out.println("Request object destroyed");
  }
	@Override
  public void attributeAdded(ServletRequestAttributeEvent srae)
  {
	  System.out.println("Attribute added to the request object");
	  System.out.println("===>"+srae.getName());
  }
	@Override
  public void attributeRemoved(ServletRequestAttributeEvent srae)
  {
	  System.out.println("Attribute removed from the request object");
  }
}
