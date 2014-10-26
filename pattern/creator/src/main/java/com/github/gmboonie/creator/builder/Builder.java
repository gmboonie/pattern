
package com.github.gmboonie.creator.builder;

/** 
 * @ClassName: Builder 
 * @Description: 建造者模式
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月26日 下午3:07:44 
 *  
 */
public interface Builder {
	
	public void buildPart1();
	
	public void buildPart2();
	
	public Product retriverProduct();

}
