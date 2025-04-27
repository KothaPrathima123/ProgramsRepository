package com.pk.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.pk.bo.BaseBO;

public class BOPostProcessor implements BeanPostProcessor{
	public BOPostProcessor() {
		System.out.println("BOPostProcessor:0-param constructor");
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String bid) throws BeansException {
			System.out.println("BPP:BeforInitialization(-,-)");
			if(bean instanceof BaseBO){
			((BaseBO) bean).setDoj(new Date());
			return bean;
			 }
		return bean;
		}
		@Override
	public Object postProcessAfterInitialization(Object bean, String bid) throws BeansException {
		System.out.println("BPP:AfterInitialization(-,-)");
		return bean;
	}

}
