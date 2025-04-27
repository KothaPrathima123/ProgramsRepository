package com.pk.PE;

import java.beans.PropertyEditorSupport;

import com.pk.beans.IntrAmtDetails;

public class CustomerAmtEditor extends PropertyEditorSupport {
	public CustomerAmtEditor() {
		System.out.println("CustomerAmtEditor:0-param constructor");
	}
	@Override
	public void setAsText(String text) throws IllegalArgumentException{
		int principle=Integer.parseInt(text.substring(0,text.indexOf(",")));
		int time=Integer.parseInt(text.substring(text.indexOf(",")+1, text.substring(text.lastIndexOf(","))));
		int rate=Integer.parseInt(text.substring(text.lastIndexOf(",")+1, text.length()));
		IntrAmtDetails details=new IntrAmtDetails();
		details.setPrinciple(principle);
		details.setTime(time);
		details.setRate(rate);
		setValue(details);
	}
	

}
