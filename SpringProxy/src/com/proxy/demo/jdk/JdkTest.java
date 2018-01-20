package com.proxy.demo.jdk;

public class JdkTest {
	//入口在哪里？
	public static void main(String[] args) {
		Person p = (Person)new MeiTuan().getInstance(new ZakYoung());
		p.order();

	}

}
