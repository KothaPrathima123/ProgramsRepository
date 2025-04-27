package com.pk.beans;

import java.util.Date;
public class WishGenerator{
//bean properties
private String sname;
private Date date;
//Getter methods for setter injection
public void setName( String name){
sname=name;
}
public void setDate(Date date){
this.date=date;
}
//B.logic
public String WishMsgGenerator (){
return "GoodMorning "+sname+" "+date;
}
}