
package com.github.gmboonie.structure.flyweight;

/** 
 * @ClassName: ConcreteFlyweight 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月27日 下午9:09:51 
 *  
 */
public class ConcreteFlyweight extends Flyweight {
	
	//维护自己的内部状态
	private String intrinsicStatus;
	
	/**	
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public ConcreteFlyweight(String intrinsicStatus) {
		this.intrinsicStatus = intrinsicStatus;
	}
	
	
	/* (非 Javadoc) 
	* <p>Title: operation</p> 
	* <p>Description: </p> 
	* @param status 
	* @see com.github.gmboonie.structure.flyweight.Flyweight#operation(java.lang.String) 
	*/
	@Override
	public void operation(String status) {
		System.out.println("intrinsic Status: " +  this.intrinsicStatus + " ouside status: " + status);
	}

}
