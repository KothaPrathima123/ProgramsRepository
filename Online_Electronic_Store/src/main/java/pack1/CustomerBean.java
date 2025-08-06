package pack1;

import java.io.Serializable;

public class CustomerBean implements Serializable
{
  private String uname,pword,fname,lname,add,mailid,mobile;

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPword() {
	return pword;
}

public void setPword(String pword) {
	this.pword = pword;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getAdd() {
	return add;
}

public void setAdd(String add) {
	this.add = add;
}

public String getMailid() {
	return mailid;
}

public void setMailid(String mailid) {
	this.mailid = mailid;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}
  public CustomerBean() {}
}
