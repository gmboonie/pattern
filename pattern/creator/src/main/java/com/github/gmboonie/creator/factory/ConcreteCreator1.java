
package com.github.gmboonie.creator.factory;

/** 
 * @ClassName: ConcreteCreator1 
 * @Description: 具体的工厂类
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 上午11:13:33 
 *  
 */
public class ConcreteCreator1 implements Creator {

	/*
	 * <p>Title: factory</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.github.gmboonie.creator.factory.Creator#factory() 
	 */
	public Product factory() {
		return new ConcreteProduct1();
	}

}
