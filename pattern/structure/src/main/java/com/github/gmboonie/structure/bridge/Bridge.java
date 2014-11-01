
package com.github.gmboonie.structure.bridge;

/** 
 * @ClassName: Bridge 
 * @Description: 抽象化角色
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午8:28:49 
 *  
 */
public  abstract class Bridge {
	protected Sourceable source;
	
	public void operation(){
		source.method1();
	}
	

}
