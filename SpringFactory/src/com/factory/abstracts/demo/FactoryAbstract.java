package com.factory.abstracts.demo;

import com.factory.simple.demo.AppleJuice;
import com.factory.simple.demo.OranGeade;

public abstract class FactoryAbstract {
	public abstract Object getDrink(String name) ;
	
	
	public Object getDrinK(String name){
		if("OranGeade".equals(name)){
			return new OranGeade();
		} else if ("AppleJuice".equals(name)){
			return new AppleJuice();
		}else{
			return null;
		}
	}
}
