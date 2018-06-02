package com.appoint.demo;

public class Appointer {
	private Executor exe;
	
	public Appointer(){
	}
	public Appointer(Executor exe){
		this.exe = exe;
		this.exe.doing();
	}
}
