
package com.github.gmboonie.behavior.Observer;

/** 
 * @ClassName: ConcreteObserver 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午9:15:55 
 *  
 */
public class ConcreteObserver  implements Observer{
	
	/* (非 Javadoc) 
	* <p>Title: uupdate</p> 
	* <p>Description: </p>  
	* @see com.github.gmboonie.behavior.Observer.Observer#uupdate() 
	*/
	@Override
	public void uupdate() {
		System.out.println("obsever update ---");
	}
}
