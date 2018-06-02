package com.strategy.demo;

public class RedDuky implements FlyDuky {
	//有共性的功能特性可以用继承的方式
	// 不同的特性的可以用接口实现，为了多实现
	// 结果一样实现的方式不同罢了
	@Override
	public void fly() {
		System.out.println("红头鸭是可以飞的");

	}
	
	public void swim(){
		System.out.println("会游泳");
	}
}
