
package com.github.gmboonie.structure.defaultAdapter;

/** 
 * @ClassName: Adapter 
 * @Description: 适配器类
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午7:12:27 
 *  
 */
public class Adapter extends Source implements Target {

	/* 
	 * <p>Title: method2</p> 
	 * <p>Description: 新添加的方法，匹配目标方法。 </p>  
	 * @see com.github.gmboonie.structure.defaultAdapter.Target#method2() 
	 */
	@Override
	public void method2() {
		System.out.println("target method2 -----");
	}

}
