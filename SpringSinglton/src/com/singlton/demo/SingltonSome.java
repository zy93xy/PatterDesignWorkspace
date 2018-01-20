package com.singlton.demo;

public class SingltonSome {
	private  volatile static  SingltonSome sin ; 
	
	private SingltonSome(){}
	
	public static Object getInstance(){
		if(sin==null){
			synchronized (SingltonSome.class) {//这里要小心，一定是反射获取同步锁的，不能写引用获取锁的机制，不然就空指针了
				if(sin==null){
					sin = new SingltonSome();
				}
			}
		}
		return sin;
	}
}
