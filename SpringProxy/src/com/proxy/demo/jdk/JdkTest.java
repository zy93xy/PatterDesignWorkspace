package com.proxy.demo.jdk;

public class JdkTest {
	//��������
	public static void main(String[] args) {
		Person p = (Person)new MeiTuan().getInstance(new ZakYoung());
		p.order();
		
//		ZakYoung z=	(ZakYoung) new MeiTuan().getInstance(new ZakYoung());
//		z.order();�������ᱨ����ת���쳣
	}

}
