
package com.github.gmboonie.behavior.memento;

/** 
 * @ClassName: Client 
 * @Description: 客户端
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午8:23:12 
 *  
 */
public class Client {
	private static Origantor origantor = new Origantor();
	private static Caretaker caretaker = new Caretaker();
	
	public static void main(String[] args) {
		origantor.setStatus("on");
		caretaker.saveMemento(origantor.createMemento());
		System.out.println("status : " + origantor.getStatus());
		origantor.setStatus("off");
		origantor.restoreMemento(caretaker.retriverMemento());
		System.out.println("status : "+ origantor.getStatus());
		
	}
}
