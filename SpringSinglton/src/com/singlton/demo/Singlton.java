package com.singlton.demo;

/**
 * 面试的时候小心，别写漏了
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
