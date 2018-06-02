package com.factory.method.demo;

public class OranGeade implements FactoryMethodInterface {

	@Override
	public Object getDring() {
		return new OranGeade();
	}
	
	
}
