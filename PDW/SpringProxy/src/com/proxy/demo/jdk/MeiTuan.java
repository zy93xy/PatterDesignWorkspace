package com.proxy.demo.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//被代理的类  美团
//思考怎样将被代理对象的信息送到这里来
public class MeiTuan implements InvocationHandler{
	
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
		//调用时
		method.invoke(this.target, args); //貌似这个方法写不写都可以来实现代理呀
		System.out.println("我是美团已经接到你要吃的菜，不用你出门，我来就行");
		
		
		System.out.println("调用后我不知道是什么情况");
		return null;
	}

}
