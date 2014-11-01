
package com.github.gmboonie.structure.proxy;

/** 
 * @ClassName: ProxySubject 
 * @Description: 代理Subject类
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月27日 下午7:45:14 
 *  
 */
public class ProxySubject implements Subject {
	private Subject subject;
	/* 
	 * <p>Title: request</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.structure.proxy.Subject#request() 
	 */
	@Override
	public void request() {
		beforeRequest();
		
		if(null == subject){
			subject = new RealSubject();
		}
		subject.request();
		
		afterRequest();
	}
	
	private void beforeRequest(){
		
	}
	
	private void afterRequest(){
		
	}

}
