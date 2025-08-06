package com.pk.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pk.PE.CustomerAmtEditor;
import com.pk.beans.IntrAmtCalculator;
import com.pk.beans.IntrAmtDetails;

public class ClientApp {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/pk/cfgs/applicationContext.xml"));
		((ConfigurableListableBeanFactory)factory).addPropertyEditorRegistrar(new MyCustomPER());
		IntrAmtCalculator iCalc=factory.getBean("intrCalculate",IntrAmtCalculator.class);
		System.out.println("Itr Amt: "+iCalc.calIntrAmt());
	}
}
	class MyCustomPER implements PropertyEditorRegistrar{

		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
			registry.registerCustomEditor(IntrAmtDetails.class, new CustomerAmtEditor());
			
		}
		
	}

