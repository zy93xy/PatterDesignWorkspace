package com.proxy.demo.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MeiTuan implements MethodInterceptor{
	
	public Object getInstance(Class clazz)throws Exception{
		Enhancer enhancer = new Enhancer();//这个是不是cglib的代理类
		
		enhancer.setSuperclass(clazz);
		
		enhancer.setCallback(this); //这里少了会一直报错 java.lang.IllegalStateException: Callbacks are required
		
		return enhancer.create();
		
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] arg2,
			MethodProxy proxy) throws Throwable {
		proxy.invokeSuper(obj, arg2);  //入参时为什是这两个参数
		System.out.println("我是外卖小哥，粉丝马上就到了");
		return null;
	}

}
