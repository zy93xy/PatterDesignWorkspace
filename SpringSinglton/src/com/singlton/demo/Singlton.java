package com.singlton.demo;

/**
 * ���Ե�ʱ��С�ģ���д©��
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
