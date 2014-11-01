
package com.github.gmboonie.structure.interfaceAdapter;

/** 
 * @ClassName: Source1 
 * @Description: 实现类，实现自己感兴趣的方法
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午7:22:20 
 *  
 */
public class Source1  extends Adapter{
	
	/* 
	* <p>Title: method1</p> 
	* <p>Description: 实现感兴趣的method1 </p>  
	* @see com.github.gmboonie.structure.interfaceAdapter.Adapter#method1() 
	*/
	@Override
	public void method1() {
		System.out.println("source method1 ---");
	}

}
