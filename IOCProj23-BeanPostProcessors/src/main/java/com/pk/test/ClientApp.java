package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.service.CustStudService;

public class ClientApp {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx =new
		FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		/* BeanFactory factory=new XmlBeanFactory(new
		FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//register BeanPostProcessor
		BOPostProcessor bpp=new BOPostProcessor();
		((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(bpp); */
		//get Bean
		CustStudService service=ctx.getBean("service",CustStudService.class);
		//call b.methods
		service.processCustomer(1001,"raj",9200);
		service.processStudent(101,"karan","java");
		service.processCustomer(1002,"ravi",6000);
		service.processStudent(102,"karan","python");

}
}