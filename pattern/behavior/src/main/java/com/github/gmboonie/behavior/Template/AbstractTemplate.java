
package com.github.gmboonie.behavior.Template;

/** 
 * @ClassName: AbstractTemplate 
 * @Description: 抽象模板类。定义模板流程
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午8:48:54 
 *  
 */
public abstract class AbstractTemplate {
	
	public void methodTemplate(){
		doOperation();
		doOperation1();
		doOperation3();
	}
	
	public abstract void doOperation();
	
	public abstract void doOperation1();
	
	public final void doOperation3(){
		System.out.println("dooperation3 ---");
	}
	
	

}
