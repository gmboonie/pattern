
package com.github.gmboonie.behavior.mediator;

/** 
 * @ClassName: ConcreteColleague 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午9:33:51 
 *  
 */
public class ConcreteColleague extends Colleague{
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public ConcreteColleague(Mediator mediator) {
		super(mediator);
	}
	/* (非 Javadoc) 
	* <p>Title: action</p> 
	* <p>Description: </p>  
	* @see com.github.gmboonie.behavior.interpreter.Colleague#action() 
	*/
	@Override
	public void action() {
		System.out.println("ConcreteColleague action");
	}

}
