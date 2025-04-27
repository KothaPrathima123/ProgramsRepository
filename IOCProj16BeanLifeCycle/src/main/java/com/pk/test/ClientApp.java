package com.pk.test;

import java.applet.AppletContext;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.pk.beans.CheckVoting;

public class ClientApp {
	public static void main(String[] args) {
		/*FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		CheckVoting cv=(CheckVoting) ctx.getBean("cv");
		System.out.println(cv.checkVotingEligibility());
		ctx.close();*/
		XmlBeanFactory bfactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/pk/cfgs/applicationContext.xml"));
		CheckVoting cv1=(CheckVoting) bfactory.getBean("cv");
		System.out.println(cv1.checkVotingEligibility());
		bfactory.destroySingletons();
	}
}
