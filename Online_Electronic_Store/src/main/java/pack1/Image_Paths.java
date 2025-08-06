package pack1;

public class Image_Paths {
	
	
	public static String imgPath(String pname)
	{
		if(pname.equalsIgnoreCase("watch"))
			return "watch.jfif";
		else if(pname.equalsIgnoreCase("mobile"))
			return "mobile.jpg";
		else if(pname.equalsIgnoreCase("laptop"))
			return "laptop.jfif";
		else if(pname.equalsIgnoreCase("waterpurifier"))
			return "waterpurifier.jfif";
		else if(pname.equalsIgnoreCase("mouse"))
			return "mouse.jfif";
		else if(pname.equalsIgnoreCase("tvremote"))
			return "tvremote.jfif";
		else
			return "noimage.jfif";
	}
}
