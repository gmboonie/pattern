
package com.github.gmboonie.behavior.mediator;

/** 
 * @ClassName: Colleague 
 * @Description: 成员类
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午9:26:30 
 *  
 */
public abstract class Colleague {
	private Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
	
	public void change(){
		this.mediator.changeColleague(this);
	}
	
	public abstract void action();
	
	public void setMediator(Mediator mediator){
		this.mediator = mediator;
	}
	
	public Mediator getMediator(){
		return this.mediator;
	}
}
