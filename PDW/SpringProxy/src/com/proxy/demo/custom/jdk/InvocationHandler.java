package com.proxy.demo.custom.jdk;

import java.lang.reflect.Method;

public interface InvocationHandler {
	public Object invoke(Object proxy, Method method, Object[] args)
	        throws Throwable;
}
