package com.singlton.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class ThreadTest {
	/*public static void main(String[] args) {
		//����100���߳�ȥ��
		int count = 100;
		CountDownLatch lath = new CountDownLatch(100);
		
		//Ψһ����� Set����ȥ�ظ��������̲߳���ȫ��
		final Set<SingltonSome> set =  Collections.synchronizedSet(new HashSet<SingltonSome>());
		
		for (int i = 0; i < count; i++) {
			new Thread(){
				@Override
				public void run() {
					set.add((SingltonSome) SingltonSome.getInstance());
				}
			}.start();
			lath.countDown();
		}
		try {
			lath.await();
			System.out.println(set.size());
		} catch (Exception e) {
			
		}
	}*/
	 public static void main(String[] args) {
	        Thread t = new Thread(){
	            public void run() {
	                pong();
	            }
	        };
	        t.start();  //
	    /*��������ǽ�t.run();�޸�Ϊt.start();��ô����������Ծ��ǡ�ping pong����
	        ��Ϊ��ִ�е��˴���������һ���µ��߳�t�����ھ���״̬���������ִ�У���ӡ����ping����
	        ��ʱ��ִ����ϡ��߳�t�õ�CPU��ʱ��Ƭ����ʼִ�У�����pong()������ӡ����pong����*/
	       // t.run();
	        System.out.println("ping");
	    }

	    static void pong() {
	        System.out.println("pong");
	    }
}
