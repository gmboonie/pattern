
package com.github.gmboonie.behavior.Strategy;

/** 
 * @ClassName: ConcreteStrategy 
 * @Description:具体角色类 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午8:37:29 
 *  
 */
public class ConcreteStrategy implements Strategy {

	/* (非 Javadoc) 
	 * <p>Title: statregyInterface</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.behavior.Strategy.Strategy#statregyInterface() 
	 */
	@Override
	public void statregyInterface() {
		System.out.println("concrete strategy ----");
	}

}
