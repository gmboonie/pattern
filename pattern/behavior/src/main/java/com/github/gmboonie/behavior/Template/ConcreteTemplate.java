
package com.github.gmboonie.behavior.Template;

/** 
 * @ClassName: ConcreteTemplate 
 * @Description: 具体的模板实现类，强制实现抽象方法
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午8:52:18 
 *  
 */
public class ConcreteTemplate extends AbstractTemplate {

	/* (非 Javadoc) 
	 * <p>Title: doOperation</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.behavior.Template.AbstractTemplate#doOperation() 
	 */
	@Override
	public void doOperation() {
		System.out.println("do operation ---");
	}

	/* (非 Javadoc) 
	 * <p>Title: doOperation1</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.behavior.Template.AbstractTemplate#doOperation1() 
	 */
	@Override
	public void doOperation1() {
		System.out.println("do operation1 ---");
	}

}
