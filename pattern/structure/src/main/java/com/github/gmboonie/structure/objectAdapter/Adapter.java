
package com.github.gmboonie.structure.objectAdapter;

/** 
 * @ClassName: Adapter 
 * @Description: 对象适配器
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午7:17:12 
 *  
 */
public class Adapter implements Target {
	private Source source;
	
	
	public Adapter(Source source) {
		this.source = source;
	}

	/* 
	 * <p>Title: method1</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.structure.objectAdapter.Target#method1() 
	 */
	@Override
	public void method1() {
		this.source.method1();
	}

	/*
	 * <p>Title: method2</p> 
	 * <p>Description: </p>  
	 * @see com.github.gmboonie.structure.objectAdapter.Target#method2() 
	 */
	@Override
	public void method2() {
		System.out.println("target method2 ---");
	}

}
