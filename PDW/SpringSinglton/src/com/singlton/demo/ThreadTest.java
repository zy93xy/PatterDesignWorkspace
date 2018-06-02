package com.singlton.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class ThreadTest {
	/*public static void main(String[] args) {
		//启动100个线程去抢
		int count = 100;
		CountDownLatch lath = new CountDownLatch(100);
		
		//唯一无序的 Set可以去重复，且是线程不安全的
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
	    /*而如果我们将t.run();修改为t.start();那么，结果很明显就是”ping pong”，
	        因为当执行到此处，创建了一个新的线程t并处于就绪状态，代码继续执行，打印出”ping”。
	        此时，执行完毕。线程t得到CPU的时间片，开始执行，调用pong()方法打印出”pong”。*/
	       // t.run();
	        System.out.println("ping");
	    }

	    static void pong() {
	        System.out.println("pong");
	    }
}
