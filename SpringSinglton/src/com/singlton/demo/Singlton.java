package com.singlton.demo;

/**
 * ����һ�ָ�Ч�ĵ���ģʽ��ʹ���ڲ���ĺô��ǣ�ʹ����classLoader������ʱ�Դ����Ļ���
 * ��֤�˲���ʵ��ʱ����
 * @author zhangyang
 *
 */

public class Singlton {
	private static class  InnerClass{
		private  final static Singlton sin= new Singlton();
	}
	private Singlton(){}
	
	public   static Object getInstance(){
		return InnerClass.sin;
	}
}
