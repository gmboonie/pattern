
package com.github.gmboonie.structure.facade;

/** 
 * @ClassName: Computer 
 * @Description: 门面角色
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午8:41:20 
 *  
 */
public class Computer {
	private Cpu cpu;
	private Memory memory;
	
	public void start(){
		this.cpu.start();
		this.memory.start();
	}
}
