package com.proxy.demo.cglib;

public class CglibTest {
	public static void main(String[] args) {
		try {
			SongSong ss = (SongSong)new MeiTuan().getInstance(SongSong.class);
			ss.order();
			//
		} catch (Exception e) {
			//不加上asm包的话会自动报错的，就是找不到的类的异常
			e.printStackTrace();
		}
	}
}
