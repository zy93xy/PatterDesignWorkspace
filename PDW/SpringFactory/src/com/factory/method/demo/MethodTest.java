package com.factory.method.demo;

public class MethodTest {

	public static void main(String[] args) {
		FactoryMethodInterface fmi = new AppleJuice();
		System.out.println(fmi.getDring());
		FactoryMethodInterface fmo = new OranGeade();
		System.out.println(fmo.getDring());

	}

}
