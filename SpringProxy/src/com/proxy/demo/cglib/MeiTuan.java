package com.proxy.demo.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MeiTuan implements MethodInterceptor{
	
	public Object getInstance(Class clazz)throws Exception{
		Enhancer enhancer = new Enhancer();//����ǲ���cglib�Ĵ�����
		
		enhancer.setSuperclass(clazz);
		
		enhancer.setCallback(this); //�������˻�һֱ���� java.lang.IllegalStateException: Callbacks are required
		
		return enhancer.create();
		
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] arg2,
			MethodProxy proxy) throws Throwable {
		proxy.invokeSuper(obj, arg2);  //���ʱΪʲ������������
		System.out.println("��������С�磬��˿���Ͼ͵���");
		return null;
	}

}
