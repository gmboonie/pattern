
package com.github.gmboonie.creator.simpleFactory;

/** 
 * @ClassName: Grape 
 * @Description: 产品具体实现类
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 上午10:06:51 
 *  
 */
public class Grape implements Fruit {

	/* (非 Javadoc) 
	 * <p>Title: plant</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.creator.factory.Fruit#plant() 
	 */
	public void plant() {
		log("grape plant");
	}

	/* (非 Javadoc) 
	 * <p>Title: harvest</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.creator.factory.Fruit#harvest() 
	 */
	public void harvest() {
		log("grape harvest");
	}

	/* (非 Javadoc) 
	 * <p>Title: grow</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.creator.factory.Fruit#grow() 
	 */
	public void grow() {
		log("grape grow");
	}
	
	private void log(String msg){
		System.out.println(msg);
	}
}
