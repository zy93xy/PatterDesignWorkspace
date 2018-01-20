package com.strategy.demo;

public class GreenDuck implements NotFlyDuky {

	@Override
	public void NotFly() {
		System.out.println("绿头鸭是不会飞的");
	}

}
