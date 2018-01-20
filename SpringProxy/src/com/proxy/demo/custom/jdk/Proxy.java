package com.proxy.demo.custom.jdk;

import java.lang.reflect.InvocationHandler;

public class Proxy {
	private static String ln = "\r\n";
	public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,
            InvocationHandler h)throws IllegalArgumentException
	{
		// Éú³ÉÔ´Âë
		String poxySrc = generateSrc(interfaces[0]);
		
		return null;
	}
	
	public static String generateSrc(Class<?> interfaces){
		StringBuffer src = new StringBuffer();
		src.append("com.proxy.demo.custom.jdk;"+ln);
		src.append("import java.lang.reflect.Method;"+ln);
		src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);
		src.append("GPInvocationHandler h;" + ln);
		
		return null;
	}
}
