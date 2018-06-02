package com.factory.simple.demo;

public class SimpleFactory implements FactoryInterface {

	public Object getDring(String  name) {
		if("OranGeade".equals(name)){
			return new OranGeade();
		} else if ("AppleJuice".equals(name)){
			return new AppleJuice();
		}else{
			return null;
		}

	}

}
