package com.proxy.demo.cglib;

public class CglibTest {
	public static void main(String[] args) {
		try {
			SongSong ss = (SongSong)new MeiTuan().getInstance(SongSong.class);
			ss.order();
			//
		} catch (Exception e) {
			//������asm���Ļ����Զ�����ģ������Ҳ���������쳣
			e.printStackTrace();
		}
	}
}
