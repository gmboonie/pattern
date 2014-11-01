
package com.github.gmboonie.behavior.command;

/** 
 * @ClassName: Invoker 
 * @Description: 调用者
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午10:08:41 
 *  
 */
public class Invoker {
	private Command command;
	
	public Invoker(Command command){
		this.command = command;
	}

	public void action(){
		this.command.execute();
	}
}
