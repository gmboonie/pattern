
package com.github.gmboonie.behavior.visitor;

/** 
 * @ClassName: Node 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author boonie  gmboonie@gmail.com 
 * @date 2014年10月29日 下午8:54:32 
 *  
 */
public interface Node {
	public  void accept(Visitor visitor);
}
