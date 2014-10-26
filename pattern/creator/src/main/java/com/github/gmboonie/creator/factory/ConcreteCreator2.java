
package com.github.gmboonie.creator.factory;

/** 
 * @ClassName: ConcreteCreator2 
 * @Description: 具体的工厂实现
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 上午11:14:43 
 *  
 */
public class ConcreteCreator2 implements Creator{
	
	/* (非 Javadoc) 
	* <p>Title: factory</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.github.gmboonie.creator.factory.Creator#factory() 
	*/
	public Product factory() {
		return new ConcreteProduct2();
	}

}
