package com.zakYoung.Spring.aop.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



public class LogAspect {

	private final static Log LOG = LogFactory.getLog(LogAspect.class);
	
	public void before(Joinpoint joinPoint){
		LOG.info("调用方法之前执行" + joinPoint);
	}
	
	public void after(Joinpoint joinPoint){
		LOG.info("调用之后执行" + joinPoint);
	}
	
	public void afterReturn(Joinpoint joinPoint){
		LOG.info("调用获得返回值之后执行" + joinPoint);
	}
	
	
	public void afterThrow(Joinpoint joinPoint){
		LOG.info("抛出异常之后执行" + joinPoint);
	}
}
