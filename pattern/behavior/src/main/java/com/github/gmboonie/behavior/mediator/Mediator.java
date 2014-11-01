
package com.github.gmboonie.behavior.mediator;

/** 
 * @ClassName: Mediator 
 * @Description: 调停者
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午9:28:05 
 *  
 */
public abstract class Mediator {
	public abstract void changeColleague(Colleague colleague);
	
	public static void main(String[] args) {
		ConcreteMediator cm = new ConcreteMediator();
		cm.createMediator();
		ConcreteColleague c1 = new ConcreteColleague(cm);
		ConcreteColleague2 c2 = new ConcreteColleague2(cm);
		
		cm.changeColleague(c1);
		
	}
}
