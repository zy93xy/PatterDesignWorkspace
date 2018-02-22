package com.singlton.demo;

public class SingltonSome {
	private  volatile static  SingltonSome sin ; 
	//volatile 是轻量级的锁，它是sin这变量在整过过程中其他线程是可见的，从而确保了原子操作
	private SingltonSome(){}
	
	public static Object getInstance(){
		if(sin==null){
			//这里前面加判断是因为sysnchronize是java并发编程里重量级的锁，影响性能
			synchronized (SingltonSome.class) {//这里要小心，一定是反射获取同步锁的，不能写引用获取锁的机制，不然就空指针了
				if(sin==null){
					sin = new SingltonSome();
				}
			}
		}
		return sin;
	}
}
