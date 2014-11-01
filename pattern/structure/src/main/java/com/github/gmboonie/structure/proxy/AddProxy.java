
package com.github.gmboonie.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * @ClassName: AddProxy 
 * @Description: 代理类
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月27日 下午8:08:44 
 *  
 */
public class AddProxy implements InvocationHandler {
	/**
	 * 需要被代理的类
	 */
	private Object target;
	
	public AddProxy( Object target){
		this.target = target;
	}
	
	public static Object factory(Object object){
		Class clazz =  object.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new AddProxy(object));
	}
	/*
	 * <p>Title: invoke</p> 
	 * <p>Description: </p> 
	 * @param proxy
	 * @param method
	 * @param args
	 * @return
	 * @throws Throwable 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]) 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before invocation -----");
		Object resultObject = method.invoke(target, args);
		System.out.println("after invocation -----");
		return resultObject;
	}
}
