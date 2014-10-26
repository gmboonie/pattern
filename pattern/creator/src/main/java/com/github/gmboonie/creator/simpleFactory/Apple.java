
package com.github.gmboonie.creator.simpleFactory;

/** 
 * @ClassName: Apple 
 * @Description: 产品具体实现
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 上午10:03:51 
 *  
 */
public class Apple implements Fruit {
	/* 
	 * <p>Title: plant</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.creator.factory.Fruit#plant() 
	 */
	public void plant() {
		System.out.println("apple  plant");
	}

	/* (非 Javadoc) 
	 * <p>Title: harvest</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.creator.factory.Fruit#harvest() 
	 */
	public void harvest() {
		System.out.println("apple harvest");
	}

	/* (非 Javadoc) 
	 * <p>Title: grow</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.creator.factory.Fruit#grow() 
	 */
	public void grow() {
		System.out.println("apple grow");
	}

}
