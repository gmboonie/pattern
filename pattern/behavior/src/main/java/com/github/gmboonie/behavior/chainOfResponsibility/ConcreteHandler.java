
package com.github.gmboonie.behavior.chainOfResponsibility;

/** 
 * @ClassName: ConcreteHandler 
 * @Description: 具体的处理者
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午9:55:05 
 *  
 */
public class ConcreteHandler  extends Handler{
	
	public ConcreteHandler(Handler handler){
		this.handler = handler;
	}
	/* (非 Javadoc) 
	* <p>Title: handleRequest</p> 
	* <p>Description: </p>  
	* @see com.github.gmboonie.behavior.chainOfResponsibility.Handler#handleRequest() 
	*/
	@Override
	public void handleRequest() {
		this.handler.handleRequest();
	}
	
	
}
