package com.proxy.demo.jdk;

public class JdkTest {
	//入口在哪里？
	public static void main(String[] args) {
		Person p = (Person)new MeiTuan().getInstance(new ZakYoung());
		p.order();
		
//		ZakYoung z=	(ZakYoung) new MeiTuan().getInstance(new ZakYoung());
//		z.order();这样做会报类型转化异常
	}

}
