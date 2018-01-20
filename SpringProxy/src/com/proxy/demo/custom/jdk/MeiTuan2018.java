package com.proxy.demo.custom.jdk;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.proxy.demo.jdk.Person;

public class MeiTuan2018 implements InvocationHandler {
	
	private Person target;
	// 获取被代理的对象的信息
	public Object getInstance(Person target){
		this.target = target;
		@SuppressWarnings("rawtypes")
		Class clazz = target.getClass();
		System.out.println("被代理对象的class是=="+clazz);
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return null;
	}

}
