package com.singlton.demo;

/**
 * 这是一种高效的单例模式，使用内部类的好处是：使用了classLoader加载类时自带锁的机制
 * 保证了并发实例时单例
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
