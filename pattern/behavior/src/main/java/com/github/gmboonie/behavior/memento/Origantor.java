
package com.github.gmboonie.behavior.memento;

/** 
 * @ClassName: Origantor 
 * @Description: 发起人
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午8:08:31 
 *  
 */
public class Origantor {
	private Memento memento;
	private String status;
	
	public Memento createMemento(){
		return  new Memento(status);
	}
	
	public void restoreMemento(Memento memento){
		this.status =  memento.getStatus();
	}
	
	public String getStatus(){
		 return this.status;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
}
