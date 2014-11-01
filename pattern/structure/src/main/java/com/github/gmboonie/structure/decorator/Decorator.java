
package com.github.gmboonie.structure.decorator;

/** 
 * @ClassName: Decorator 
 * @Description: 装饰角色
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午7:33:54 
 *  
 */
public class Decorator  implements Component{
	private Component component;	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public Decorator() {
	}
	
	public Decorator(Component component){
		this.component = component;
	}
	
	/* 
	* <p>Title: sampleOpeartion</p> 
	* <p>Description: </p>  
	* @see com.github.gmboonie.structure.decorator.Component#sampleOpeartion() 
	*/
	@Override
	public void sampleOpeartion() {
		System.out.println("Decorator sampleOperation ---");
		this.component.sampleOpeartion();
	}
	
	

}
