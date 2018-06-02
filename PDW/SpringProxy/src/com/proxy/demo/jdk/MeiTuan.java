package com.proxy.demo.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//���������  ����
//˼��������������������Ϣ�͵�������
public class MeiTuan implements InvocationHandler{
	
	private Person target;
	// ��ȡ������Ķ������Ϣ
	public Object getInstance(Person target){
		this.target = target;
		@SuppressWarnings("rawtypes")
		Class clazz = target.getClass();
		System.out.println("����������class��=="+clazz);
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//����ʱ
		method.invoke(this.target, args); //ò���������д��д��������ʵ�ִ���ѽ
		System.out.println("���������Ѿ��ӵ���Ҫ�ԵĲˣ���������ţ���������");
		
		
		System.out.println("���ú��Ҳ�֪����ʲô���");
		return null;
	}

}
