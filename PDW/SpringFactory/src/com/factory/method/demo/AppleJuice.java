package com.factory.method.demo;

public class AppleJuice implements FactoryMethodInterface {

	@Override
	public Object getDring() {
		// TODO Auto-generated method stub
		return new AppleJuice();
	}
	
}
