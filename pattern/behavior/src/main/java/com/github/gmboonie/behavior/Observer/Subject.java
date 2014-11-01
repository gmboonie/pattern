
package com.github.gmboonie.behavior.Observer;

/** 
 * @ClassName: Subject 
 * @Description: 抽象主题角色
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午9:09:43 
 *  
 */
public interface Subject {

	public void  attach(Observer observer);
	
	public void detach(Observer observer);
	
	public void notifyObservers();
	
}
