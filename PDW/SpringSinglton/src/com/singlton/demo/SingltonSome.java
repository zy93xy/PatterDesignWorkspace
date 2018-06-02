package com.singlton.demo;

public class SingltonSome {
	private  volatile static  SingltonSome sin ; 
	//volatile ������������������sin����������������������߳��ǿɼ��ģ��Ӷ�ȷ����ԭ�Ӳ���
	private SingltonSome(){}
	
	public static Object getInstance(){
		if(sin==null){
			//����ǰ����ж�����Ϊsysnchronize��java���������������������Ӱ������
			synchronized (SingltonSome.class) {//����ҪС�ģ�һ���Ƿ����ȡͬ�����ģ�����д���û�ȡ���Ļ��ƣ���Ȼ�Ϳ�ָ����
				if(sin==null){
					sin = new SingltonSome();
				}
			}
		}
		return sin;
	}
}
