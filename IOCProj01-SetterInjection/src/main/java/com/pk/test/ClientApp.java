package com.pk.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.pk.beans.WishGenerator;
public class ClientApp {
public static void main(String[] args) {
System.out.println("ClientApp:main(-)");
//Locate Spring Bean configuration file
ClassPathXmlApplicationContext res=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
// Get Bean class obj
WishGenerator bean=res.getBean("wmg",WishGenerator.class);
// Call B.method
String result=bean.WishMsgGenerator();
System.out.println(result);
}//main
}//class