
package com.github.gmboonie.behavior.command;

/** 
 * @ClassName: ConcreteCommand 
 * @Description: 具体的命令
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午10:09:09 
 *  
 */
public class ConcreteCommand implements Command{
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	public void execute(){
		this.receiver.action();
	}

}
