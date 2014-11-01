
package com.github.gmboonie.behavior.Observer;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName: ConcreteSubject 
 * @Description: 具体的观察者角色
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午9:12:16 
 *  
 */
public class ConcreteSubject implements Subject {

	public List<Observer> observerList= new ArrayList<Observer>();
	/* (非 Javadoc) 
	 * <p>Title: attach</p> 
	 * <p>Description: </p> 
	 * @param observer 
	 * @see com.github.gmboonie.behavior.Observer.Subject#attach(com.github.gmboonie.behavior.Observer.Observer) 
	 */
	@Override
	public void attach(Observer observer) {
		this.observerList.add(observer);
	}

	/* (非 Javadoc) 
	 * <p>Title: detach</p> 
	 * <p>Description: </p> 
	 * @param observer 
	 * @see com.github.gmboonie.behavior.Observer.Subject#detach(com.github.gmboonie.behavior.Observer.Observer) 
	 */
	@Override
	public void detach(Observer observer) {
		this.observerList.remove(observer);
	}

	/* (非 Javadoc) 
	 * <p>Title: notifyObservers</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.behavior.Observer.Subject#notifyObservers() 
	 */
	@Override
	public void notifyObservers() {
		for(Observer observer : observerList){
			observer.uupdate();
		}
	}
	
	public List<Observer> getObservers(){
		return this.observerList;
	}
}
