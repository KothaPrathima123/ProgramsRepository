package com.pk.dao;



import org.springframework.jdbc.core.JdbcTemplate;

import com.pk.aspect.UserDetails;

public class AuthenticateDAO {
	private static final String AUTH_QRY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt=jt;
	}
	public boolean authenticate(UserDetails ud) {
		int cnt=jt.queryForObject(AUTH_QRY,Integer.class,ud.getUser(),ud.getPwd());
		if(cnt==0)
			return false;
		else
			return true;
	}

}
