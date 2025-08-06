package pack1;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class Session_Listener implements HttpSessionListener, HttpSessionAttributeListener
{

	@Override
	public void sessionCreated(HttpSessionEvent hse)
	{
		System.out.println("session created");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent hse)
	{
		System.out.println("session destroyed");
	}
	@Override
	public void attributeAdded(HttpSessionBindingEvent hsbe)
	{
		System.out.println("Attribute added to the session");
		System.out.println("===>"+hsbe.getName());
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent hsbe)
	{
		System.out.println("Attribute removed from  the session");
	}
}
