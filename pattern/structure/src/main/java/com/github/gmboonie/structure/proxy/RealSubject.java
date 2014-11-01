
package com.github.gmboonie.structure.proxy;

/** 
 * @ClassName: RealSubject 
 * @Description: 具体的类
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月27日 下午7:43:21 
 *  
 */
public class RealSubject implements Subject {

	/* 
	 * <p>Title: request</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.structure.proxy.Subject#request() 
	 */
	@Override
	public void request() {
		
		System.out.println("real subject request---");
	}

}
