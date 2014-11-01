
package com.github.gmboonie.structure.bridge;

/** 
 * @ClassName: ConcreteBridge 
 * @Description: 具体的桥梁实现
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午8:31:50 
 *  
 */
public class ConcreteBridge extends Bridge {
	
	public ConcreteBridge(Sourceable source){
		this.source = source;
	}
	
	/* (非 Javadoc) 
	* <p>Title: operation</p> 
	* <p>Description: </p>  
	* @see com.github.gmboonie.structure.bridge.Bridge#operation() 
	*/
	@Override
	public void operation() {
		System.out.println("具体的桥梁实现调用方法");
		super.operation();
	}
}
