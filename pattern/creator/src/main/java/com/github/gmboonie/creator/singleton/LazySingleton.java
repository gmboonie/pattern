package com.github.gmboonie.creator.singleton;

/** 
 * @ClassName: LazySingleton 
 * @Description: 懒汉式单例模式
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 上午9:38:28 
 *  
 */
public class LazySingleton {
	private static LazySingleton lazySingleton = null;
	
	/** 
	 * <p>Title: 构造方法 </p> 
	 * <p>Description: 私有构造方法</p>  
	 */
	private LazySingleton() {

	}
	
	public synchronized static LazySingleton newInstance(){
		if(null == lazySingleton)
			lazySingleton = new LazySingleton();
		return lazySingleton;
	}

}
