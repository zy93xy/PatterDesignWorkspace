package com.proxy.demo.custom.jdk;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.proxy.demo.jdk.Person;

public class MeiTuan2018 implements InvocationHandler {
	
	private Person target;
	// ��ȡ������Ķ������Ϣ
	public Object getInstance(Person target){
		this.target = target;
		@SuppressWarnings("rawtypes")
		Class clazz = target.getClass();
		System.out.println("����������class��=="+clazz);
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), (java.lang.reflect.InvocationHandler) this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return null;
	}

}
