
package com.github.gmboonie.behavior.memento;

/** 
 * @ClassName: Caretaker 
 * @Description: 负责人
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午8:10:11 
 *  
 */
public class Caretaker {
	private Memento memento;

	public Memento retriverMemento(){
		return this.memento;
	}
	
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
	
}
