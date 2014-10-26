package com.github.gmboonie.creator.singleton;

/** 
 * @ClassName: HungrySingleton 
 * @Description: 饿汉式单例模式
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 上午9:43:03 
 *  
 */
public class HungrySingleton {
	private static HungrySingleton hungrySingleton = new HungrySingleton();
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	private HungrySingleton() {
		
	}
	
	public synchronized static HungrySingleton newInstance(){
		return hungrySingleton;
	}

}
