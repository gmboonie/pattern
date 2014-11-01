
package com.github.gmboonie.behavior.mediator;

/** 
 * @ClassName: ConcreteMediator 
 * @Description: 具体的调停者
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午9:38:59 
 *  
 */
public class ConcreteMediator  extends Mediator{
	private ConcreteColleague c1;
	private ConcreteColleague2 c2;
	
	public void createMediator(){
		c1 = new ConcreteColleague(this);
		c2 = new ConcreteColleague2(this);
	}
	
	/* (非 Javadoc) 
	* <p>Title: changeColleague</p> 
	* <p>Description: </p> 
	* @param colleague 
	* @see com.github.gmboonie.behavior.interpreter.Mediator#changeColleague(com.github.gmboonie.behavior.interpreter.Colleague) 
	*/
	@Override
	public void changeColleague(Colleague colleague) {
		c1.action();
		c2.action();
	}
	
	public ConcreteColleague getConcreteColleague() {
		return this.c1;
	}
	
	public ConcreteColleague2 getConcreteColleague2(){
		return c2;
	}
	
}
