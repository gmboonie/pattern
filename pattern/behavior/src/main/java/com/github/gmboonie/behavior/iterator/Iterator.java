
package com.github.gmboonie.behavior.iterator;

/** 
 * @ClassName: Iterator 
 * @Description: 迭代接口
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月28日 下午9:30:27 
 *  
 */
public interface Iterator {
	public void first();
	
	public void next();
	
	public boolean hasNext();
	
	public Object currentObject();
	
}
