package com.strategy.demo;

public class RedDuky implements FlyDuky {
	//�й��ԵĹ������Կ����ü̳еķ�ʽ
	// ��ͬ�����ԵĿ����ýӿ�ʵ�֣�Ϊ�˶�ʵ��
	// ���һ��ʵ�ֵķ�ʽ��ͬ����
	@Override
	public void fly() {
		System.out.println("��ͷѼ�ǿ��Էɵ�");

	}
	
	public void swim(){
		System.out.println("����Ӿ");
	}
}
