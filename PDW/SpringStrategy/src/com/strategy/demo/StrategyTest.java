package com.strategy.demo;

public class StrategyTest {
	public static void main(String[] args) {
		RedDuky rd = new RedDuky();
		// 隐藏了实现了，只关心是否会有飞行的结果出来吧了
		rd.fly();
	}
}
