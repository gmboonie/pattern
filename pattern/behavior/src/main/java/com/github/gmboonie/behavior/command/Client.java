
package com.github.gmboonie.behavior.command;

/** 
 * @ClassName: Client 
 * @Description: 客户端
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午10:07:22 
 *  
 */
public class Client {
	public static void main(String[] args) {
		Command command = new ConcreteCommand(new Receiver());
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}
