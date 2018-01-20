package com.factory.simple.demo;

public class SimpleTest {

	public static void main(String[] args) {
		FactoryInterface fi = new SimpleFactory();
		System.out.println(fi.getDring("OranGeade"));
	}

}
