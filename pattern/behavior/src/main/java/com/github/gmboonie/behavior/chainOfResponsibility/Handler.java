
package com.github.gmboonie.behavior.chainOfResponsibility;

/** 
 * @ClassName: Handler 
 * @Description: 抽象处理者
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午9:52:47 
 *  
 */
public abstract class Handler {
	protected Handler handler;
	
	public abstract  void handleRequest();
}
