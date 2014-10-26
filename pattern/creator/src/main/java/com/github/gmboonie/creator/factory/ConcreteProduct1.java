
package com.github.gmboonie.creator.factory;

/** 
 * @ClassName: ConcreteProduct1 
 * @Description: 具体的产品
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 上午11:09:42 
 *  
 */
public class ConcreteProduct1 implements Product {
	
	/*  
	* <p>Title: product</p> 
	* <p>Description: </p>  
	* @see com.github.gmboonie.creator.factory.Product#product() 
	*/
	public void product() {
		System.out.println("ConcreteProduct 1 -----");
	}
}
