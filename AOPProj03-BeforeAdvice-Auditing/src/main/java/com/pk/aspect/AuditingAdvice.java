package com.pk.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class AuditingAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Target class name: "+target.getClass());
		System.out.println("Target method name: "+Arrays.toString(target.getClass().getMethods()));
		System.out.println("target method args: "+Arrays.toString(args));
		if((Integer)args[0]==0)
			throw new IllegalArgumentException("Wrong Order Id");
		if((Integer)args[0]<0)
			args[0]=(Integer)args[0]-1;
		FileWriter fw=new FileWriter("E:\\Spring\\AuditLog.txt",true);
		fw.write(args[0]+" order has come for approval at: "+new Date()+"\n");
		fw.flush();
		fw.close();
	}

}
