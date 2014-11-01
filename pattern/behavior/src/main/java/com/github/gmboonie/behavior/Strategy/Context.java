
package com.github.gmboonie.behavior.Strategy;

/** 
 * @ClassName: Context 
 * @Description: 环境角色
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午8:36:02 
 *  
 */
public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void contextInterface(){
		this.strategy.statregyInterface();
	}
}
